package com.macehub.qrscanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

public class VerifyActivity extends AppCompatActivity {

    TextView NameTxt,EmailTxt,BatchTxt,PhoneTxt,SpouseTxt,ChildrenTxt,KidsTxt,ShirtTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);

        NameTxt = findViewById(R.id.bkgname);
        EmailTxt = findViewById(R.id.bkgemail);
        BatchTxt = findViewById(R.id.bkgbatch);
        PhoneTxt = findViewById(R.id.bkgphone);
        SpouseTxt = findViewById(R.id.bkgspouse);
        ChildrenTxt = findViewById(R.id.bkgchildren);
        KidsTxt = findViewById(R.id.bkgkids);
        ShirtTxt = findViewById(R.id.bkgshirt);


        Intent intent = getIntent();
        JSONObject obj = new JSONObject();
        try {
            obj = new JSONObject(getIntent().getStringExtra("ITEM_EXTRA"));

            Toast.makeText(this, "ID " + obj.getString("id"), Toast.LENGTH_SHORT).show();
            NameTxt.setText(obj.getString("fullname"));
            EmailTxt.setText(obj.getString("email"));
            BatchTxt.setText(obj.getString("batch"));
            PhoneTxt.setText(obj.getString("phone"));
            SpouseTxt.setText(obj.getString("spouse"));
            ChildrenTxt.setText(obj.getString("children"));
            KidsTxt.setText(obj.getString("kids"));
            ShirtTxt.setText(obj.getString("shirt"));


        } catch (JSONException e) {
            e.printStackTrace();

            Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
        }

        String message = intent.getStringExtra("ID");
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

    }
}
