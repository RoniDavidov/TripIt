package com.example.tripit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity implements View.OnClickListener {
    Button tsafon, merkaz,darom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        tsafon=findViewById(R.id.tsafon);
        tsafon.setOnClickListener((View.OnClickListener) this);
        merkaz=findViewById(R.id.merkaz);
        merkaz.setOnClickListener((View.OnClickListener) this);

        darom=findViewById(R.id.darom);
        darom.setOnClickListener((View.OnClickListener) this);



    }

    @Override
    public void onClick(View v) {
        if(v==tsafon)
        {
            Intent intent1 = new Intent(MainActivity3.this, MainActivity4.class);
            startActivity(intent1);
        }
        if(v==merkaz)
        {
            Intent intent1 = new Intent(MainActivity3.this, MainActivity4.class);
            startActivity(intent1);
        }
        if(v==darom)
        {
            Intent intent1 = new Intent(MainActivity3.this, MainActivity4.class);
            startActivity(intent1);
        }
    }
}