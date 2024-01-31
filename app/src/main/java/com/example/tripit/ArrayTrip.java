
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

public class ArrayTrip extends ArrayAdapter<Trip> {
    Context context;
    List<Trip> listTrip;

    public ArrayTrip(@NonNull Context context, int resource, int textViewResourceId, @NonNull List<Trip> objects) {
        super(context, resource);
        this.context = context;
        this.listTrip = listTrip;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = ((Activity) context).getLayoutInflater();
        View view = layoutInflater.inflate(R.layout.custum_layout, parent, false);

        TextView name = (TextView) view.findViewById(R.id.name);
        TextView tior = (TextView) view.findViewById(R.id.tior);
        TextView num = (TextView) view.findViewById(R.id.num);
        ImageView ivProduct = (ImageView) view.findViewById(R.id.picture);
        Trip temp = listTrip.get(position);


        return view;
    }
}