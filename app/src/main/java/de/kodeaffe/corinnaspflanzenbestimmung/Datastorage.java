package de.kodeaffe.corinnaspflanzenbestimmung;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import de.kodeaffe.corinnaspflanzenbestimmung.FamilyContract.Family;

/**
 * Created by shensche on 18.03.16.
 */

public class Datastorage extends SQLiteAssetHelper {

	private static final int DATABASE_VERSION = 1;
	private static final String DATABASE_NAME = "coripflabe.db";


	public Datastorage(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}



	// Get table name depending on locale language
	private String getTableName (String baseTableName) {
		String lang = Locale.getDefault().getLanguage();
		if (lang.isEmpty() || lang.startsWith("en")) {
			return baseTableName;
		} else {
			return baseTableName + "_" + lang;
		}
	}


	private List getObject(String baseTableName, String[] columns, String id) {
		List object = new ArrayList();
		String tableName = getTableName(baseTableName);
		SQLiteDatabase db = getReadableDatabase();
		String selection = "_id = ?";
		String[] selectionArgs = {id};
		Cursor cursor = db.query(
			tableName, columns, selection, selectionArgs,
			null, null, null, null);
		Integer count = cursor.getCount();
		Log.d("Datastorage.getObject", "Count: " + Integer.toString(count));
		if (count == 1) {
			cursor.moveToPosition(0);
			object.add(cursor.getString(0));
			object.add(cursor.getString(1));
			Log.d("Datastorage.getObject", "Object: " + object.toString());
		}
		cursor.close();
		return object;
	}


	public List getObjects(String baseTableName, String[] columns) {
		List objects = new ArrayList();
		String tableName = getTableName(baseTableName);
		SQLiteDatabase db = getReadableDatabase();
		Cursor cursor = db.query(
			tableName, columns, null, null, null, null, null, null);
		Log.d("Datastorage.getObjects",
			"Count: " + Integer.toString(cursor.getCount()));
		cursor.moveToPosition(-1);
		while (cursor.moveToNext()) {
			List object = new ArrayList();
			object.add(Integer.toString(cursor.getInt(0)));
			object.add(cursor.getString(1));
			objects.add(object);
		}
		cursor.close();
		return objects;
	}


	public List getFamily(String id) {
		String[] columns = {Family.COLUMN_NAME, Family.COLUMN_SCIENTIFIC_NAME};
		List family = getObject(Family.TABLE, columns, id);
		Log.d("Datastorage.getFamily", "Family: " + family.toString());
		return family;
	}


	public List getFamilies() {
		String[] columns = {Family._ID, Family.COLUMN_NAME};
		List families = getObjects(Family.TABLE, columns);
		return families;
	}
}

