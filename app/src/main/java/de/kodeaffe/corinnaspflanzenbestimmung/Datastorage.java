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

	private static final int DATABASE_VERSION = 4;
	private static final String DATABASE_NAME = "coripflabe.db";

	/* For rows concatenated into one column on joins */
	private static final String DATA_SEPERATOR = "\n";

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


	public List getFamily(String id) {
		List family = new ArrayList();
		SQLiteDatabase db = getReadableDatabase();
		String tableName = getTableName(Family.TABLE);
		String exampleTableName = getTableName(Example.TABLE);
		String[] selectionArgs = {id};
		String query = "SELECT f." + Family.COLUMN_NAME + ", " +
			"f." + Family.COLUMN_SCIENTIFIC_NAME + ", " +
			"f." + Family.COLUMN_FLOWER_FORMULA + ", " +
			"f." + Family.COLUMN_FLOWER_TYPE + ", " +
			"f." + Family.COLUMN_FLOWER_PERIANTH + ", " +
			"f." + Family.COLUMN_FLOWER_STAMEN + ", " +
			"f." + Family.COLUMN_FLOWER_OVARY + ", " +
			"f." + Family.COLUMN_FLOWER_SEPAL + ", " +
			"f." + Family.COLUMN_FLOWER_PETAL + ", " +
			"f." + Family.COLUMN_FRUIT + ", " +
			"f." + Family.COLUMN_SORUS + ", " +
			"f." + Family.COLUMN_LEAF + ", " +
			"f." + Family.COLUMN_INVOLUCRO + ", " +
			"f." + Family.COLUMN_STIPULE + ", " +
			"f." + Family.COLUMN_MORPHOLOGY + ", " +
			"f." + Family.COLUMN_INGREDIENTS + ", " +
			"f." + Family.COLUMN_MISC + ", " +
			"group_concat(e." + Example.COLUMN_DATA + ", '" + DATA_SEPERATOR + "') " +
			"FROM " + tableName + " AS f " +
			"LEFT JOIN " + exampleTableName + " AS e " +
			"ON f." + Family._ID + " = e." + Example.COLUMN_FAMILY_ID + " " +
			"WHERE f." + Family._ID + " = ?";
		Log.d("Datastorage.getFamily", "Query: " + query);
		Cursor cursor = db.rawQuery(query, selectionArgs);

		Integer count = cursor.getCount();
		Log.d("Datastorage.getFamily", "Count: " + Integer.toString(count));
		if (count > 0) {
			cursor.moveToPosition(0);
			family.add(cursor.getString(0));
			family.add(cursor.getString(1));
			family.add(cursor.getString(2));
			family.add(cursor.getString(3));
			family.add(cursor.getString(4));
			family.add(cursor.getString(5));
			family.add(cursor.getString(6));
			family.add(cursor.getString(7));
			family.add(cursor.getString(8));
			family.add(cursor.getString(9));
			family.add(cursor.getString(10));
			family.add(cursor.getString(11));
			family.add(cursor.getString(12));
			family.add(cursor.getString(13));
			family.add(cursor.getString(14));
			family.add(cursor.getString(15));
			family.add(cursor.getString(16));
			family.add(cursor.getString(17));
			Log.d("Datastorage.getFamily", "Family: " + family.toString());
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

