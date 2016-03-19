package de.kodeaffe.corinnaspflanzenbestimmung;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.LinearLayout;


public class WelcomeActivity extends AppCompatActivity {

    private Button getFamilyButton(final Integer id, final String name) {
        Button button = new Button(WelcomeActivity.this);
        button.setText(name);
        final WelcomeActivity caller = this;
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(caller, FamilyActivity.class);
                Log.i("Welcome", "id: " + id.toString());
                intent.putExtra(FamilyActivity.FAMILY_ID, id);
                startActivity(intent);
            }
        });
        return button;
    }


    private void addFamilies(LinearLayout container) {
        SQLiteDatabase db = new Datastorage(this).getReadableDatabase();
        String table = "family";
        String[] columns = {"id", "name"};
        Cursor cursor = db.query(
                Datastorage.FAMILY_TABLE_NAME, columns, null, null, null, null, null, null);
        Log.i("Welcome", "Count: " + Integer.toString(cursor.getCount()));
        cursor.moveToPosition(-1);
        while (cursor.moveToNext()) {
            Integer id = cursor.getInt(0);
            String name = cursor.getString(1);
            Log.i("Welcome", "name: " + name);
            Button button = getFamilyButton(id, name);
            container.addView(button);
        }
        cursor.close();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        LinearLayout container = (LinearLayout) findViewById(R.id.container_families);
        addFamilies(container);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_welcome, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_about:
                Intent intent = new Intent(this, AboutActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
