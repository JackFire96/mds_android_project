package com.example.demoproject.activity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.example.demoproject.R;

public class MenuActivity extends Activity implements View.OnClickListener{

    private Button bt_menu_spinner, bt_menu_picasso, bt_menu_demo_extra, bt_menu_demo_url;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        bt_menu_picasso = findViewById(R.id.bt_menu_pigasso);
        bt_menu_spinner = findViewById(R.id.bt_menu_spinner);
        bt_menu_demo_extra = findViewById(R.id.bt_menu_demo_extra);
        bt_menu_demo_url = findViewById(R.id.bt_menu_demo_url);

        bt_menu_spinner.setOnClickListener(this);
        bt_menu_picasso.setOnClickListener(this);
        bt_menu_demo_extra.setOnClickListener(this);
        bt_menu_demo_url.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == bt_menu_spinner) {
            Intent intent = new Intent(this, SpinnerActivity.class);
            startActivity(intent);
            return;
        }
        if(v == bt_menu_picasso) {
            Intent intent = new Intent(this, PicassoActivity.class);
            startActivity(intent);
            return;
        }
        if(v == bt_menu_demo_extra) {
            Intent intent = new Intent(this, DemoExtraActivity.class);
            intent.putExtra("message", "This is a message from MenuActivity");
            startActivityForResult(intent, 0);
            return;
        }

        //protected void onActivityResult(int requestCode, int resultCode, intent data){

        //};
        if(v == bt_menu_demo_url) {
            Uri uri = Uri.parse("https://www.midigitalschool.com");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
            return;
        }

    }
}
