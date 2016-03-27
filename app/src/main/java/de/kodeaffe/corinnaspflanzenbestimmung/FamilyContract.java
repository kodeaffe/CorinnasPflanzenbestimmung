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
        public static final String COLUMN_FLOWER_FORMULA = "flower_formula";
        public static final String COLUMN_FLOWER_TYPE = "flower_type";
        public static final String COLUMN_FLOWER_PERIANTH = "flower_perianth";
        public static final String COLUMN_FLOWER_STAMEN = "flower_stamen";
        public static final String COLUMN_FLOWER_OVARY = "flower_ovary";
        public static final String COLUMN_FLOWER_SEPAL = "flower_sepal";
        public static final String COLUMN_FLOWER_PETAL = "flower_petal";
        public static final String COLUMN_FRUIT = "fruit";
        public static final String COLUMN_SORUS = "sorus";
        public static final String COLUMN_LEAF = "leaf";
        public static final String COLUMN_INVOLUCRO = "involucro";
        public static final String COLUMN_STIPULE = "stipule";
        public static final String COLUMN_MORPHOLOGY = "morphology";
        public static final String COLUMN_INGREDIENTS = "ingredients";
        public static final String COLUMN_MISC = "misc";

        public static final String SQL_CREATE_TABLE =
                "CREATE TABLE " + TABLE + " (" +
                        _ID + " INTEGER PRIMARY KEY," +
                        COLUMN_NAME + " TEXT NOT NULL, " +
                        COLUMN_SCIENTIFIC_NAME + " TEXT, " +
                        COLUMN_FLOWER_FORMULA + " TEXT, " +
                        COLUMN_FLOWER_TYPE + " TEXT, " +
                        COLUMN_FLOWER_PERIANTH + " TEXT, " +
                        COLUMN_FLOWER_STAMEN + " TEXT, " +
                        COLUMN_FLOWER_OVARY + " TEXT, " +
                        COLUMN_FLOWER_SEPAL + " TEXT, " +
                        COLUMN_FLOWER_PETAL + " TEXT, " +
                        COLUMN_FRUIT + " TEXT, " +
                        COLUMN_SORUS + " TEXT, " +
                        COLUMN_LEAF + " TEXT, " +
                        COLUMN_INVOLUCRO + " TEXT, " +
                        COLUMN_STIPULE + " TEXT, " +
                        COLUMN_MORPHOLOGY + " TEXT, " +
                        COLUMN_INGREDIENTS + " TEXT, " +
                        COLUMN_MISC + " TEXT)";
        public static final String SQL_DROP_TABLE = "DROP TABLE IF EXISTS " + TABLE;
    }
}
