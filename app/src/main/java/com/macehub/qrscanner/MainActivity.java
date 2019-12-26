package com.macehub.qrscanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText EmailEdt;
    EditText PassEdt;
    Button LoginBtn;
    String email,pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EmailEdt = findViewById(R.id.login_user);
        PassEdt = findViewById(R.id.login_password);
        LoginBtn = findViewById(R.id.login_btn);

        LoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                email=EmailEdt.getText().toString();
                pass=PassEdt.getText().toString();

                if((email.equals("Feny@mace.in"))&&(pass.equals("1234mace"))){

                    startActivity(new Intent(MainActivity.this, ScannedBarcodeActivity.class));
                    
                }

            }
        });

    }
}
