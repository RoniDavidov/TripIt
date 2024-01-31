package com.example.tripit;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity_Trips extends AppCompatActivity {
    ListView lv;
    ArrayList<Trip> tripList;
    TripAdapter TripAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_trips);
        Bitmap waterN1 = BitmapFactory.decodeResource(getResources(), R.drawable.img_4);
        Bitmap waterN2 = BitmapFactory.decodeResource(getResources(), R.drawable.img_5);
        Bitmap waterN3 = BitmapFactory.decodeResource(getResources(), R.drawable.img_6);
        Bitmap waterN4 = BitmapFactory.decodeResource(getResources(), R.drawable.img_7);
        Bitmap waterN5 = BitmapFactory.decodeResource(getResources(), R.drawable.img_8);
        Bitmap waterN6 = BitmapFactory.decodeResource(getResources(), R.drawable.img_9);
        Bitmap waterN7 = BitmapFactory.decodeResource(getResources(), R.drawable.img_10);
        Bitmap waterN8 = BitmapFactory.decodeResource(getResources(), R.drawable.img_11);
        Bitmap waterN9 = BitmapFactory.decodeResource(getResources(), R.drawable.img_12);


        Trip wn1 = new Trip("המפל הנסתר בכפר נחום - עין איוב - עין שבע","טבריה",waterN1, 1/3);
        Trip wn2 = new Trip("עין ג'ונס","רמת הגולן",waterN2,1);
        Trip wn3 = new Trip("האסי-החוף הירוק","הגלבוע ועמק המעיינות",waterN3,1);
        Trip wn4 = new Trip("גשר קנטרה","הגלבוע",waterN4,1);
        Trip wn5 = new Trip("האגם הנעלם-נחל אורן","חיפה והר הכרמל",waterN5,1);
        Trip wn6 = new Trip("מעיין אלרועי","חיפה והר הכרמל",waterN6,1);
        Trip wn7 = new Trip("עין צור","חוף הכרמל",waterN7,1);
        Trip wn8 = new Trip("המפלים הלבנים ליד עין צבי","הגלבוע ",waterN8,1);
        Trip wn9 = new Trip("הירדנית","גליל תחתון",waterN9,1);

        tripList = new ArrayList<Trip>();
        tripList.add(wn1);tripList.add(wn2);tripList.add(wn3);
        tripList.add(wn4);tripList.add(wn5);tripList.add(wn6);
        tripList.add(wn7);tripList.add(wn8);tripList.add(wn9);

        //phase 3 - create adapter
        TripAdapter  = new TripAdapter(this, 0, 0, tripList);
        //phase 4 reference to listview
        lv=(ListView)findViewById(R.id.lv);
        lv.setAdapter(TripAdapter);


    }
}