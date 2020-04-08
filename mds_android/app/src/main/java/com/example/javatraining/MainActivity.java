package com.example.javatraining;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.javatraining.model.Bicycle;
import com.example.javatraining.model.Wheel;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "JavaTraining";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //System.out.println("hello world");
        Log.d(TAG, "hello World");

        //Create new instance
        Wheel wheel1 = new Wheel();
        Wheel wheel2 = new Wheel();

        Bicycle myBicycle1 = new Bicycle();
        Bicycle myBicycle2 = new Bicycle(wheel1, wheel2);
        Bicycle myBicycle3 = new Bicycle("pink", wheel1, wheel2);

    }
}
