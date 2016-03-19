package de.kodeaffe.corinnaspflanzenbestimmung;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.TextView;



public class FamilyActivity extends AppCompatActivity {
    public final static String FAMILY_ID = "family_id";

    private void setFamily() {
        Intent intent = getIntent();
        String id = intent.getStringExtra(FamilyActivity.FAMILY_ID);
        Log.i("FamilyActiviy.setFamily", "Id: " + id);
        String[] family = new Datastorage(this).getFamily(id);
        Log.i("FamilyActivity.setFamily", "Family: " + family.toString());
        TextView text_name = (TextView) findViewById(R.id.family_name);
        text_name.setText(family[0]);
        TextView text_scientific_name = (TextView) findViewById(R.id.family_scientific_name);
        text_scientific_name.setText(family[1]);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setFamily();
    }

}
