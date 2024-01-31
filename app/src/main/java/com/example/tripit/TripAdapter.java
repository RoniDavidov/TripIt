package com.example.tripit;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class TripAdapter extends  ArrayAdapter<Trip> {
    Context context;
    List<Trip> listTrip;

    public TripAdapter( Context context, int resource, int textViewResourceId,  List<Trip> listTrip) {
        super(context, resource, textViewResourceId, listTrip);

        this.context = context;
        this.listTrip = listTrip;
    }


    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {

        LayoutInflater layoutInflater = ((Activity)context).getLayoutInflater();
        View view = layoutInflater.inflate(R.layout.custum_layout,parent,false);

        TextView name = (TextView)view.findViewById(R.id.name);
        TextView tior = (TextView)view.findViewById(R.id.tior);
        TextView num = (TextView)view.findViewById(R.id.num);
        ImageView ivProduct=(ImageView)view.findViewById(R.id.picture);
        Trip temp = listTrip.get(position);

        ivProduct.setImageBitmap(temp.getBitmap());
        name.setText(String.valueOf(temp.getName()));
        tior.setText(temp.getTior());
        num.setText(""+temp.getNum());


        return view;
    }
}
