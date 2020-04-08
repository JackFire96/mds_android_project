package com.example.celciufahrenightconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.EventListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button convertButton = (Button) findViewById(R.id.button);


        convertButton.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        EditText celciusInput = (EditText) findViewById(R.id.editText);
                        final int celsius =  Integer.parseInt(celciusInput.getText().toString());
                        double answer = (celsius * 9/5) + 32;
                        TextView tv = (TextView) findViewById(R.id.textView2);
                        tv.setText(Double.toString(answer));
                    }
                });
    }
}
