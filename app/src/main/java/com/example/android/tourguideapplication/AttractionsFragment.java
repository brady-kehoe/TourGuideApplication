package com.example.android.tourguideapplication;


import android.os.Bundle;



import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import com.example.android.tourguideapplication.Location;
import com.example.tourguideapplication.R;

import java.util.ArrayList;

public class AttractionsFragment extends Fragment {

    public AttractionsFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.attractions_layout, container, false);



    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location("The Cabot Trail", "One of the most well known views in all of Cape Breton, mixed with beautiful coastal and valley sceneries. ", R.drawable.attractions_cabot_trail));
        locations.add(new Location("Fortress of Louisbourg", "A fortress surrounded by walls created back in the 1700's. Reformatted and kept for the sake of educating its visitors about life 300 years ago.", R.drawable.attractions_louisbourg));
        locations.add(new Location("Highlands National Park", "Surrounded by the Cabot Trail, the Highlands National Park is home to many wildlife and the like. In the park's southeastern corner holds the Ingonish Beach, lining the Atlantic Ocean.", R.drawable.attractions_highlands_park));
        locations.add(new Location("The Lighthouses of Isle Madame", "Home of the most historic lighthouses of Canada, Isle Madame is surrounded by many beacons that are easily accessible for visitors and tourists.", R.drawable.attractions_lighthouse));
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);
        ListView listView = (ListView) getActivity().findViewById(R.id.attractions_display);
        listView.setAdapter(adapter);
    }
}