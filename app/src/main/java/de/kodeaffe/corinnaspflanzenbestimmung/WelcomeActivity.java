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

    private Button getFamilyButton(String name) {
        Button button = new Button(WelcomeActivity.this);
        button.setText(name);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Log.i("WelcomeActivity", name);
            }
        });
        return button;
    }


    private void addFamilies(LinearLayout container) {
        SQLiteDatabase db = new Datastorage(WelcomeActivity.this).getReadableDatabase();
        String table = "family";
        String[] columns = {"name"};
        Cursor result = db.query(table, columns, null, null, null, null, null, null);
        Log.i("Welcome", "Count: " + new Integer(result.getCount()).toString());
        while (result.moveToNext()) {
            String name = result.getString(0);
            Log.i("Welcome", "name: " + name);
            Button button = getFamilyButton(name);
            container.addView(button);
        }
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
