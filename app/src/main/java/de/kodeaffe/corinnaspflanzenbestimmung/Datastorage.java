package de.kodeaffe.corinnaspflanzenbestimmung;

import android.content.ContentValues;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import de.kodeaffe.corinnaspflanzenbestimmung.FamilyContract.Family;

/**
 * Created by shensche on 18.03.16.
 */

public class Datastorage extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "coripflabe.db";

    private Context mContext;


    Datastorage(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.mContext = context;
    }


    private void createFamily(SQLiteDatabase db) {
        // create table
        db.execSQL(Family.SQL_CREATE_TABLE);

        // fill in data
        Resources res = mContext.getResources();
        TypedArray names = res.obtainTypedArray(R.array.family_names);
        TypedArray scientific_names = res.obtainTypedArray(R.array.family_scientific_names);
        Log.i("Datastorage.createFamily", "names len" + Integer.toString(names.length()));
        for (int i = 0; i < names.length(); i++) {
            ContentValues values = new ContentValues();
            final String name = names.getString(i);
            final String scientific_name = scientific_names.getString(i);
            values.put(Family.COLUMN_NAME, name);
            values.put(Family.COLUMN_SCIENTIFIC_NAME, scientific_name);
            Log.i("Datastorage.createFamily", "name:" + name + ", scientific " + scientific_name);
            db.insertOrThrow(Family.TABLE, null, values);
        }
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        createFamily(db);
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        Log.i("Datastorage.onUpgrade",
                "old: " + Integer.toString(oldVersion) + " new: " + Integer.toString(newVersion));
        // This database is only a cache for online data, so its upgrade policy is
        // to simply to discard the data and start over
        db.execSQL(Family.SQL_DROP_TABLE);
        onCreate(db);
    }


    @Override
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        Log.i("Datastorage.onDowngrade",
                "old: " + Integer.toString(oldVersion) + " new: " + Integer.toString(newVersion));
        onUpgrade(db, oldVersion, newVersion);
    }


    public String[] getFamily(String id) {
        String[] family = {null, null};
        SQLiteDatabase db = getReadableDatabase();
        String[] columns = {Family.COLUMN_NAME, Family.COLUMN_SCIENTIFIC_NAME};
        String selection = Family._ID + " = ?";
        String[] selectionArgs = {id};
        Cursor cursor = db.query(
                Family.TABLE, columns, selection, selectionArgs, null, null, null, null);
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
        Cursor cursor = db.query(Family.TABLE, columns, null, null, null, null, null, null);
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

