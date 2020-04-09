package com.example.demoproject.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.example.demoproject.R;

public class DemoExtraActivity extends Activity {

    private Button bt_demo_extra_ok;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_extra);

        bt_demo_extra_ok = findViewById(R.id.bt_demo_extra_ok);

        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            String message = bundle.getString("message");
            ((TextView)findViewById(R.id.tv_extra_message)).setText(message);
        }
        bt_demo_extra_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getIntent().putExtra("response", "This is my response");
                setResult(10, getIntent());
                finish();
            }
        });

    }
}
