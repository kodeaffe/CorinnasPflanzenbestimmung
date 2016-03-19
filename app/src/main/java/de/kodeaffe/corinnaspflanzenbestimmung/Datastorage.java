package de.kodeaffe.corinnaspflanzenbestimmung;

import android.content.ContentValues;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
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

    public String[] getFamily(String id) {
        String[] family = {null, null};
        SQLiteDatabase db = getReadableDatabase();
        String[] columns = {Family.COLUMN_NAME, Family.COLUMN_SCIENTIFIC_NAME};
        String selection = Family._ID + " = ?";
        String[] selectionArgs = {id};
        Cursor cursor = db.query(
                getTableName(Family.TABLE), columns, selection, selectionArgs,
                null, null, null, null);
        Integer count = cursor.getCount();
        Log.i("Datastorage.getFamily", "Count: " + Integer.toString(count));
        if (count == 1) {
            cursor.moveToPosition(0);
            family[0] = cursor.getString(0);
            family[1] = cursor.getString(1);
            Log.i("Datastorage.getFamily", "Family: " + family.toString());
        }
        cursor.close();
        return family;
    }


    public List getFamilies() {
        List families = new ArrayList();
        SQLiteDatabase db = getReadableDatabase();
        String[] columns = {Family._ID, Family.COLUMN_NAME};
        Cursor cursor = db.query(
                getTableName(Family.TABLE), columns, null, null, null, null, null, null);
        Log.i("Datastorage.getFamilies", "Count: " + Integer.toString(cursor.getCount()));
        cursor.moveToPosition(-1);
        while (cursor.moveToNext()) {
            String[] family = {Integer.toString(cursor.getInt(0)), cursor.getString(1)};
            families.add(family);
        }
        cursor.close();
        return families;
    }
}

