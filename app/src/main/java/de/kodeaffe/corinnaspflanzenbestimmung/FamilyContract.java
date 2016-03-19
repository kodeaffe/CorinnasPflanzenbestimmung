package de.kodeaffe.corinnaspflanzenbestimmung;

import android.provider.BaseColumns;

/**
 * Created by shensche on 19.03.16.
 */
public final class FamilyContract {
    // To prevent someone from accidentally instantiating the contract class,
    // give it an empty constructor.
    public FamilyContract() {}

    /* Inner class that defines the table contents */
    public static abstract class Family implements BaseColumns {
        public static final String TABLE = "family";
        public static final String COLUMN_NAME = "name";
        public static final String COLUMN_SCIENTIFIC_NAME = "scientific_name";

        public static final String SQL_CREATE_TABLE =
                "CREATE TABLE " + TABLE + " (" +
                        _ID + " INTEGER PRIMARY KEY," +
                        COLUMN_NAME + " TEXT NOT NULL, " +
                        COLUMN_SCIENTIFIC_NAME + " TEXT NOT NULL)";
        public static final String SQL_DROP_TABLE = "DROP TABLE IF EXISTS " + TABLE;
    }
}
