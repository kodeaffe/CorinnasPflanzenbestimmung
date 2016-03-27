package de.kodeaffe.corinnaspflanzenbestimmung;

import android.provider.BaseColumns;

import de.kodeaffe.corinnaspflanzenbestimmung.FamilyContract.Family;

/**
 * Created by shensche on 27.03.16.
 */
public final class DrawingContract {
    // To prevent someone from accidentally instantiating the contract class,
    // give it an empty constructor.
    public DrawingContract() {}

    /* Inner class that defines the table contents */
    public static abstract class Drawing implements BaseColumns {
        public static final String TABLE = "drawing";
        public static final String COLUMN_DRAWABLE = "drawable";
        public static final String COLUMN_FAMILY_ID = "family_id";

        public static final String SQL_CREATE_TABLE =
                "CREATE TABLE " + TABLE + " (" +
                        _ID + " INTEGER PRIMARY KEY," +
                        COLUMN_DRAWABLE + " TEXT NOT NULL, " +
                        COLUMN_FAMILY_ID + " INTEGER, " +
                        "FOREIGN KEY(" + COLUMN_FAMILY_ID + ") REFERENCES " + Family.TABLE + "(" + Family._ID + "))";
        public static final String SQL_DROP_TABLE = "DROP TABLE IF EXISTS " + TABLE;
    }
}

