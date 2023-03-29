package com.example.snakedetectionsystem;

import android.content.Context;
import android.icu.text.Transliterator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class DoctorAdapter extends ArrayAdapter<Doctor> {

    private Context mContext;
    private int mResource;


    public DoctorAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Doctor> objects) {
        super(context, resource, objects);
        this.mContext = context;
        this.mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup Doctor) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);

        convertView = layoutInflater.inflate(mResource, Doctor, false);

        ImageView imageView = convertView.findViewById(R.id.image);
        TextView textName = convertView.findViewById(R.id.textName);
        TextView textDetails = convertView.findViewById(R.id.textSub1);
        TextView textContacts = convertView.findViewById(R.id.textSub2);


        imageView.setImageResource(getItem(position).getImage());
        textName.setText(getItem(position).getName());
        textDetails.setText(getItem(position).getDetails());
        textContacts.setText(getItem(position).getContacts());

        return  convertView;
    }
}
