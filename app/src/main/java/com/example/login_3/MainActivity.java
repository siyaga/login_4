package com.example.login_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button_login;
    Button button_sign;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_login = (Button) findViewById(R.id.btn_s_login);
        button_sign = (Button) findViewById(R.id.btn_s_sign);

        button_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent slogin = new Intent(getApplicationContext(),LoginActivity.class);
                startActivity(slogin);
            }
        });
        button_sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ssign = new Intent(getApplicationContext(),RegisterActivity.class);
                startActivity(ssign);
            }
        });

    }
}
