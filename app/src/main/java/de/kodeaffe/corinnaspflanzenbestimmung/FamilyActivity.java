package de.kodeaffe.corinnaspflanzenbestimmung;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;


public class FamilyActivity extends AppCompatActivity {
    public final static String FAMILY_ID = "family_id";

    private void addDrawings(Datastorage storage, String id) {
        List drawings = storage.getFamilyDrawings(id);
        LinearLayout layout = (LinearLayout) findViewById(R.id.layoutFamily);
        String packageName = getPackageName();
        Resources resources = getResources();
        for (Object drawing : drawings) {
            int drawingId = resources.getIdentifier((String) drawing, "drawable", packageName);
            ImageView image = new ImageView(this);
            image.setImageResource(drawingId);
            image.setPadding(0, 10, 0, 0);
            layout.addView(image);
        }
    }


    private void setFamily() {
        Intent intent = getIntent();
        String id = intent.getStringExtra(FamilyActivity.FAMILY_ID);
        Log.d("FamilyActiviy.setFamily", "Id: " + id);
        Datastorage storage = new Datastorage(this);
        List family = storage.getFamily(id);
        Log.d("FamilyActivity.setFamily", "Family: " + family.toString());

        setTitle((String) family.get(0));

        TextView scientific_name =
			(TextView) findViewById(R.id.family_scientific_name);
        scientific_name.setText((String) family.get(1));

        TextView flower_formula = (TextView) findViewById(R.id.family_flower_formula);
        flower_formula.setText((String) family.get(2));

        TextView flower_type = (TextView) findViewById(R.id.family_flower_type);
        flower_type.setText((String) family.get(3));

        TextView flower_perianth = (TextView) findViewById(R.id.family_flower_perianth);
        flower_perianth.setText((String) family.get(4));

        TextView flower_stamen = (TextView) findViewById(R.id.family_flower_stamen);
        flower_stamen.setText((String) family.get(5));

        TextView flower_ovary = (TextView) findViewById(R.id.family_flower_ovary);
        flower_ovary.setText((String) family.get(6));

        TextView flower_sepal = (TextView) findViewById(R.id.family_flower_sepal);
        flower_sepal.setText((String) family.get(7));

        TextView flower_petal = (TextView) findViewById(R.id.family_flower_petal);
        flower_petal.setText((String) family.get(8));

        TextView fruit = (TextView) findViewById(R.id.family_fruit);
        fruit.setText((String) family.get(9));

        TextView sorus = (TextView) findViewById(R.id.family_sorus);
        sorus.setText((String) family.get(10));

        TextView leaf = (TextView) findViewById(R.id.family_leaf);
        leaf.setText((String) family.get(11));

        TextView involucro = (TextView) findViewById(R.id.family_involucro);
        involucro.setText((String) family.get(12));

        TextView stipule = (TextView) findViewById(R.id.family_stipule);
        stipule.setText((String) family.get(13));

        TextView morphology = (TextView) findViewById(R.id.family_morphology);
        morphology.setText((String) family.get(14));

        TextView ingredients = (TextView) findViewById(R.id.family_ingredients);
        ingredients.setText((String) family.get(15));

        TextView misc = (TextView) findViewById(R.id.family_misc);
        misc.setText((String) family.get(16));

        TextView examples = (TextView) findViewById(R.id.family_examples);
        examples.setText((String) family.get(17));

        addDrawings(storage, id);
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
