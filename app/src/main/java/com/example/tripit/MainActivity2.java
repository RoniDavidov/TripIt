package com.example.tripit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {
    SharedPreferences sp;
    Button b;
    EditText username2, passsword2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        b = findViewById(R.id.btlogin2);
        b.setOnClickListener(this);
        username2 = findViewById(R.id.username2);
        username2.setOnClickListener(this);
        passsword2 = findViewById(R.id.passsword2);
        passsword2.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if (v == b) {
            if (username2.getText().toString().length() > 0 && passsword2.getText().toString().length() > 0) {

               // SharedPreferences.Editor editor = sp.edit();

                //editor.putString("username", username2.getText().toString());

              //  editor.putString("password", passsword2.getText().toString());

               // editor.commit();
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);

                startActivity(intent);

            } else Toast.makeText(this, "תמלא סיסמא ושם משתמש", Toast.LENGTH_LONG).show();
        }

    }

}