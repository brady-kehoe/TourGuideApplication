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

public class EatDrinkFragment extends Fragment {

    public EatDrinkFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.eat_drink_layout, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location("Spud", "Fast food", R.drawable.ic_launcher_foreground));
        locations.add(new Location("Nest", "Restaurant and Bar", R.drawable.ic_launcher_foreground));
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);
        ListView listView = (ListView) getActivity().findViewById(R.id.eat_drink_display);
        listView.setAdapter(adapter);

    }
}