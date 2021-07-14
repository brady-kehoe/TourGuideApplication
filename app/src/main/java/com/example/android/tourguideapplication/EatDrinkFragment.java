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
        locations.add(new Location("The Rusty Anchor", "A casual seafood restaurant with beautiful views, with an overlook of Pleasant Bay, situated on the Cabot Trail. It is a restaurant focused on seafood and shellfish caught locally.", R.drawable.eat_drink_rusty_anchor));
        locations.add(new Location("Beggar's Banquet", "Based on holding traditional banquets for the poor in the 18th century. The hosts and hostesses tell stories of the life 300 years ago, to give more to the unique dining experience", R.drawable.eat_drink_beggars_banquet));
        locations.add(new Location("Le Gabriel Restaurant", "Known for its Acadian classic dishes, served in a lighthouse shaped entrance building, with a spacious interior designed with a lounge for live music.", R.drawable.eat_drink_le_gabriel));
        locations.add(new Location("The Bitehouse", "A 10 seated restaurant created and doubled as a farmhouse. Meals are grown and harvested in their own backyard. All the food is grown or caught locally, to give more of a cozy atmosphere.", R.drawable.eat_drink_bitehouse));
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);
        ListView listView = (ListView) getActivity().findViewById(R.id.eat_drink_display);
        listView.setAdapter(adapter);

    }
}