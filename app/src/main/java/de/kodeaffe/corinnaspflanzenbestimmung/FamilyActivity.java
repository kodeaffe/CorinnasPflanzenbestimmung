package de.kodeaffe.corinnaspflanzenbestimmung;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.TextView;

public class FamilyActivity extends AppCompatActivity {
    public final static String FAMILY_ID = "family_id";

    private void addFamily() {
        Intent intent = getIntent();
        Integer id = intent.getIntExtra(FamilyActivity.FAMILY_ID, 0);
        Log.i("Family", "id: " + id);

        SQLiteDatabase db = new Datastorage(this).getReadableDatabase();
        String[] columns = {"name", "scientific_name"};
        String selection = "id = ?";
        String[] selectionArgs = {id.toString()};
        Cursor cursor = db.query(
                Datastorage.FAMILY_TABLE_NAME, columns, selection, selectionArgs,
                null, null, null, null);
        Log.i("Family", "Count: " + Integer.toString(cursor.getCount()));
        cursor.moveToPosition(-1);
        while (cursor.moveToNext()) {
            String name = cursor.getString(0);
            Log.i("Family", "name: " + name);
            TextView text_name = (TextView) findViewById(R.id.family_name);
            text_name.setText(name);
            String scientific_name = cursor.getString(1);
            Log.i("Family", "scientific: " + scientific_name);
            TextView text_scientific_name = (TextView) findViewById(R.id.family_scientific_name);
            text_scientific_name.setText(scientific_name);
        }
        cursor.close();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        addFamily();
    }

}
