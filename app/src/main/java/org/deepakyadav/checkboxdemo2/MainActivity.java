package org.deepakyadav.checkboxdemo2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onSubmit(View view){
        StringBuffer toppings = new
                StringBuffer().append(getString(R.string.toppings_label)).append("\n");
        if (((CheckBox) findViewById(R.id.checkbox1_chocolate)).isChecked()) {
            toppings.append(getString(R.string.chocolate_syrup_text)).append("\n");
        }
        if (((CheckBox) findViewById(R.id.checkbox2_sprinkles)).isChecked()) {
            toppings.append(getString(R.string.sprinkles_text)).append("\n");
        }
        if (((CheckBox) findViewById(R.id.checkbox3_nuts)).isChecked()) {
            toppings.append(getString(R.string.crushed_nuts_text)).append("\n");
        }
        TextView text_final_selection = (TextView)findViewById(R.id.text_final_selection);
        text_final_selection.setText(toppings);
        //TextView career_options = (TextView) findViewById(R.id.career_options);
        //career_options.setText(careerType);

    }
}