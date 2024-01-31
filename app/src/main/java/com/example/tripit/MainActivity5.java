package com.example.tripit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity5 extends AppCompatActivity implements View.OnClickListener {

    Button camping, locamping;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        camping=findViewById(R.id.camping);
        locamping=findViewById(R.id.locamping);
        camping.setOnClickListener( this);
        locamping.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

            Intent intent = new Intent(MainActivity5.this, MainActivity_Trips.class);
            startActivity(intent);



    }
}