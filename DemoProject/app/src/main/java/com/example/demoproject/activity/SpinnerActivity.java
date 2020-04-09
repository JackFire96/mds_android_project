package com.example.demoproject.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.demoproject.R;
import com.example.demoproject.model.ProgrammingLanguage;

public class SpinnerActivity extends AppCompatActivity
    implements View.OnClickListener {

        private Button bt_main1, bt_main2, bt_main3;
        private Spinner sp_main_select;

        @Override
        protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        bt_main1 = findViewById(R.id.bt_main1);
        bt_main2 = findViewById(R.id.bt_main2);
        bt_main3 = findViewById(R.id.bt_main3);
        sp_main_select = findViewById(R.id.sp_main_select);

        bt_main1.setOnClickListener(this);
        bt_main2.setOnClickListener(this);
        bt_main3.setOnClickListener(this);

        ProgrammingLanguage[] programminglanguages = {new ProgrammingLanguage("Java", "Java is life"),
            new ProgrammingLanguage("C++", "C++ is evil"),
            new ProgrammingLanguage("PhP", "PhP is cool"),
            new ProgrammingLanguage("COBOL", "COBOL is old"),
        };
            ArrayAdapter arrayAdapter = new ArrayAdapter<ProgrammingLanguage>(
                    this,
                    R.layout.item_spinner,
                    programminglanguages
            );
            sp_main_select.setAdapter(arrayAdapter);
    }


    @Override
    public void onClick(View v) {
        if(v == bt_main1) {
            Toast.makeText(this, "button 1 clicked", Toast.LENGTH_SHORT).show();
            return;
        }
        if(v == bt_main2) {
            Object object = sp_main_select.getSelectedItem();
            ProgrammingLanguage selectedProgrammingLanguage = (ProgrammingLanguage) object;

            String textToShow = selectedProgrammingLanguage.getName() + "\n" + selectedProgrammingLanguage.getDescription() + "\n";
        }
        if(v == bt_main3) {
            Toast.makeText(this, "button 3 clicked", Toast.LENGTH_SHORT).show();
            return;
        }
    }
}
