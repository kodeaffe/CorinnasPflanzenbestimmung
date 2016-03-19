package de.kodeaffe.corinnaspflanzenbestimmung;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
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
        Cursor result = db.query(
                Datastorage.FAMILY_TABLE_NAME, columns, selection, selectionArgs,
                null, null, null, null);
        Log.i("Family", "Count: " + Integer.toString(result.getCount()));
        TableLayout table = (TableLayout) findViewById(R.id.family_table);
        result.moveToPosition(-1);
        while (result.moveToNext()) {
            String name = result.getString(0);
            Log.i("Family", "name: " + name);
            TextView text_name = new TextView(this);
            text_name.setText(name);
            String scientific_name = result.getString(1);
            Log.i("Family", "scientific: " + scientific_name);
            TextView text_scientific_name = new TextView(this);
            text_scientific_name.setText(scientific_name);
            TableRow row = new TableRow(this);
            row.addView(text_name, 0);
            row.addView(text_scientific_name, 1);
            table.addView(row);
        }
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
