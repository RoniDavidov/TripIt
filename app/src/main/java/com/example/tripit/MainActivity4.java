package com.example.tripit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity4 extends AppCompatActivity implements View.OnClickListener {

    Button maim, lomaim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        maim=findViewById(R.id.water);
        maim.setOnClickListener(this);
         lomaim=findViewById(R.id.nowater);
        lomaim.setOnClickListener( this);




    }

    @Override
    public void onClick(View v) {
        if(v==maim)
        {
            Intent intent = new Intent(MainActivity4.this, MainActivity5.class);
            startActivity(intent);
        }
        if(v==lomaim)
        {
            Intent intent = new Intent(MainActivity4.this, MainActivity5.class);
            startActivity(intent);
        }

    }

}