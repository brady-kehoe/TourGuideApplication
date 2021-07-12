package com.example.android.tourguideapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.tourguideapplication.Location;
import com.example.tourguideapplication.R;

import java.util.ArrayList;

public class LocationAdapter extends ArrayAdapter<Location> {

    public LocationAdapter(Context context, ArrayList<Location> songs) {
        super(context, 0, songs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.location_layout, parent, false);
        }
        Location currentSong = getItem(position);
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title_view);
        titleTextView.setText(currentSong.getLocationTitle());
        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.description_view);
        descriptionTextView.setText(currentSong.getLocationDescription());
        ImageView coverImageView = (ImageView) listItemView.findViewById(R.id.image_view);
        coverImageView.setImageResource(currentSong.getLocationImageId());
        return listItemView;


    }
}