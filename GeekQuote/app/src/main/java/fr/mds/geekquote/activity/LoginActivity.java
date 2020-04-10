package fr.mds.geekquote.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;

import fr.mds.geekquote.R;

public class LoginActivity extends Activity implements View.OnClickListener {

    private EditText username;
    private EditText password;
    private Button login;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = findViewById(R.id.et_login_nickname);
        password = findViewById(R.id.et_login_password);
        login = findViewById(R.id.bt_login);
        login.setOnClickListener(this);
        }
    @Override
    public void onClick(View v) {
        if(username.getText().toString().equals("Geek") && password.getText().toString().equals("Quote")){
            Intent intent = new Intent(LoginActivity.this, QuoteListActivity.class);
            startActivity(intent);
            finish();
        }else{
            Toast.makeText(getApplicationContext(), "Wrong Nickname or Password", Toast.LENGTH_SHORT).show();
        }
    }
}
