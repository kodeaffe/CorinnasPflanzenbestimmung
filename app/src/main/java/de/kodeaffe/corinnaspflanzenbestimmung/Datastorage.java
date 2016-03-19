package de.kodeaffe.corinnaspflanzenbestimmung;

import android.content.ContentValues;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;


/**
 * Created by shensche on 18.03.16.
 */

public class Datastorage extends SQLiteOpenHelper {

    public static final String FAMILY_TABLE_NAME = "family";
    private static final int DATABASE_VERSION = 3;
    private static final String DATABASE_NAME = "coripflabe";
    private static final String FAMILY_TABLE_CREATE =
            "CREATE TABLE " + FAMILY_TABLE_NAME + " (" +
                    "id INTEGER PRIMARY KEY, " +
                    "name TEXT, " +
                    "scientific_name TEXT);";

    private Context context;


    Datastorage(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.context = context;
    }


    private void initFamilyTable(SQLiteDatabase db) {
        db.execSQL(FAMILY_TABLE_CREATE);

        Resources res = this.context.getResources();
        TypedArray names = res.obtainTypedArray(R.array.family_names);
        TypedArray scientific_names = res.obtainTypedArray(R.array.family_scientific_names);
        Log.i("Datastorage", "names len" + new Integer(names.length()).toString());
        for (int i = 0; i < names.length(); i++) {
            ContentValues values = new ContentValues();
            final String name = names.getString(i);
            final String scientific_name = scientific_names.getString(i);
            values.put("id", i);
            values.put("name", name);
            values.put("scientific_name", scientific_name);
            Log.i("Datastorage", "name:" + name + ", scientific " + scientific_name);
            db.insertOrThrow("family", null, values);
        }
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        initFamilyTable(db);
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int old_version, int new_version) {
        Log.i("Datastorage", "old: " + new Integer(old_version).toString() + " new: " + new Integer(new_version).toString());
    }
}

