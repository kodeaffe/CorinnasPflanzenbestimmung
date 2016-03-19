package de.kodeaffe.corinnaspflanzenbestimmung;

import android.provider.BaseColumns;

import de.kodeaffe.corinnaspflanzenbestimmung.FamilyContract.Family;


/**
 * Created by shensche on 19.03.16.
 */
public final class ExampleContract {
	// To prevent someone from accidentally instantiating the contract class,
	// give it an empty constructor.
	public ExampleContract() {}

	/* Inner class that defines the table contents */
	public static abstract class Example implements BaseColumns {
		public static final String TABLE = "example";
		public static final String COLUMN_DATA = "data";
		public static final String COLUMN_FAMILY_ID = "family_id";

		public static final String SQL_CREATE_TABLE =
			"CREATE TABLE " + TABLE + " (" +
				_ID + " INTEGER PRIMARY KEY," +
				COLUMN_DATA + " TEXT NOT NULL, " +
				COLUMN_FAMILY_ID + " INTEGER, " +
				"FOREIGN KEY(" + COLUMN_FAMILY_ID + ") REFERENCES " + Family.TABLE + "(" + Family._ID + "))";
		public static final String SQL_DROP_TABLE = "DROP TABLE IF EXISTS " + TABLE;
	}
}
