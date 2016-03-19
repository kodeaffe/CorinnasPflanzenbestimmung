package de.kodeaffe.corinnaspflanzenbestimmung;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import de.kodeaffe.corinnaspflanzenbestimmung.FamilyContract.Family;
import de.kodeaffe.corinnaspflanzenbestimmung.ExampleContract.Example;

/**
 * Created by shensche on 18.03.16.
 */

public class Datastorage extends SQLiteAssetHelper {

	private static final int DATABASE_VERSION = 3;
	private static final String DATABASE_NAME = "coripflabe.db";

    private Context mContext;

	public Datastorage(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
		setForcedUpgrade();
        mContext = context;
	}


/*
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		Log.i("Datastorage.onUpgrade",
			"Old: " + Integer.toString(oldVersion) + " " +
			"New: " + Integer.toString(newVersion));
		// This database is only a cache for online data, so its upgrade policy is
		// to simply to discard the data and start over
		db.execSQL(Family.SQL_DROP_TABLE);
		db.execSQL(Example.SQL_DROP_TABLE);
		onCreate(db);
	}
*/


	// Get table name depending on locale language
	private String getTableName (String baseTableName) {
		String lang = Locale.getDefault().getLanguage();
		if (lang.isEmpty() || lang.startsWith("en")) {
			return baseTableName;
		} else {
			return baseTableName + "_" + lang;
		}
	}


	private String getExamples(SQLiteDatabase db, String family_id) {
		/*
		String query = "SELECT f." + Family.COLUMN_NAME + ", " +
			"f." + Family.COLUMN_SCIENTIFIC_NAME + ", " +
			"e." + Example.COLUMN_DATA + " " +
			"FROM " + tableName + " AS f " +
			"INNER JOIN " + tableNameExample + " AS e " +
			"ON f." + Family._ID + " = e." + Example.COLUMN_FAMILY_ID + " " +
			"WHERE f." + Family._ID + " = ?";
		Log.d("Datastorage.getObject", "Query: " + query);
		Cursor cursor = db.rawQuery(query, selectionArgs);
		*/
        List examples = new ArrayList();
        String tableName = getTableName(Example.TABLE);
		String[] columns = {Example.COLUMN_DATA};
		String selection = Example.COLUMN_FAMILY_ID + " = ?";
		String[] selectionArgs = {family_id};

		Cursor cursor = db.query(
			tableName, columns, selection, selectionArgs,
			null, null, null, null);
		Log.d("Datastorage.getExamples",
			"Count: " + Integer.toString(cursor.getCount()));
		cursor.moveToPosition(-1);
		while (cursor.moveToNext()) {
			examples.add(cursor.getString(0));
		}
		cursor.close();

        Log.d("Datastorage.getExamples", "Examples: " + examples.toString());
		String joined = StringUtils.join(examples, "\n");
        if (joined.isEmpty()) {
            return mContext.getResources().getString(R.string.none);
        }
        return joined;
	}


	public List getFamily(String id) {
		List family = new ArrayList();
		SQLiteDatabase db = getReadableDatabase();
		String tableName = getTableName(Family.TABLE);
		String[] columns = {Family.COLUMN_NAME, Family.COLUMN_SCIENTIFIC_NAME};
		String selection = "_id = ?";
		String[] selectionArgs = {id};

		Cursor cursor = db.query(
			tableName, columns, selection, selectionArgs,
			null, null, null, null);
		Integer count = cursor.getCount();
		Log.d("Datastorage.getObject", "Count: " + Integer.toString(count));
		if (count == 1) {
			cursor.moveToPosition(0);
			family.add(cursor.getString(0));
			family.add(cursor.getString(1));
			family.add(getExamples(db, id));
			Log.d("Datastorage.getObject", "Object: " + family.toString());
		}
		cursor.close();
		return family;
	}


	public List getFamilies() {
		List families = new ArrayList();
		SQLiteDatabase db = getReadableDatabase();
		String tableName = getTableName(Family.TABLE);
		String[] columns = {Family._ID, Family.COLUMN_NAME};
		Cursor cursor = db.query(
			tableName, columns, null, null, null, null, null, null);
		Log.d("Datastorage.getFamilies",
			"Count: " + Integer.toString(cursor.getCount()));
		cursor.moveToPosition(-1);
		while (cursor.moveToNext()) {
			List family = new ArrayList();
			family.add(cursor.getString(0));
			family.add(cursor.getString(1));
			families.add(family);
		}
		cursor.close();
		Log.d("Datastorage.getFamilies", "Families: " + families.toString());
		return families;
	}
}

