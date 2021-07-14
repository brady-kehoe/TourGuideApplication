package com.example.android.tourguideapplication;


import android.os.Bundle;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

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
        locations.add(new Location("Keltic Lodge", "The Resort to suit any cost budget, with many different styles of rooms, suites, and more. Regarded as the premier resort in the Maritimes.", R.drawable.accommodations_keltic_lodge));
        locations.add(new Location("Hampton Inn", "The perfect hotel for easy access to the city's Waterfront attractions. Just a five minute drive from both the water and the highway.", R.drawable.accommodations_hampton_inn));
        locations.add(new Location("The Lakes Campground", "The Campground that is surrounded by Lake O'Law, one of the only lakes safe for swimming due to its steady flow of cold water from the mountains.", R.drawable.accommodations_lakes_campground));
        locations.add(new Location("Baddeck Cabot Trail Campground", "Neighbour to the well known Cabot Trail, a beautiful campground with a heated pool, and that cozy woods-life feel.", R.drawable.accommodations_baddeck_campground));
        locations.add(new Location("Battery Provincial Park Campground", "Nestled next to the Bras D'Or Lake, and the Canal leading up to it, the Provincial Park is in a great secluded area, nearby to the rest of the town of St. Peter's.", R.drawable.accommodations_battery_park));
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);
        ListView listView = (ListView) getActivity().findViewById(R.id.accommodations_display);
        listView.setAdapter(adapter);
    }
}