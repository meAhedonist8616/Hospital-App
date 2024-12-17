package com.example.hospitalapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SignUpActivity extends AppCompatActivity {

    EditText et1,et2,et3,et4,et5,et6,et7;
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sign_up);

        et1=(EditText) findViewById(R.id.name);
        et2=(EditText) findViewById(R.id.addr);
        et3=(EditText) findViewById(R.id.pincode);
        et4=(EditText) findViewById(R.id.mobnum);
        et5=(EditText) findViewById(R.id.uname2);
        et6=(EditText) findViewById(R.id.pass2);
        et7=(EditText) findViewById(R.id.confrmpass2);
        b1=(Button) findViewById(R.id.signbut);
        b2=(Button) findViewById(R.id.backtologbut);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(ob);
            }
        });
    }
}