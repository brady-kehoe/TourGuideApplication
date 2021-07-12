package com.example.android.tourguideapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.android.tourguideapplication.Location;
import com.example.tourguideapplication.R;

import java.util.ArrayList;

public class AccommodationsFragment extends Fragment {

    public AccommodationsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.accommodations_layout, container, false);


    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location("Arichat", "Hotel", R.drawable.ic_launcher_foreground));
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);
        ListView listView = (ListView) getActivity().findViewById(R.id.accommodations_display);
        listView.setAdapter(adapter);
    }
}