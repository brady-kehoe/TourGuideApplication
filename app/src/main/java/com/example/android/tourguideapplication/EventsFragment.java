package com.example.android.tourguideapplication;


import android.os.Bundle;



import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import com.example.tourguideapplication.R;

import java.util.ArrayList;

public class EventsFragment extends Fragment {

    public EventsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.events_layout, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location("Festival Acadien de Petit-de-Grat", "A festival held yearly full of events such as the annual shark derby, a family and friend group softball tournament, and a parade to represent the acadian culture.", R.drawable.events_festival_acadien));
        locations.add(new Location("Highland Quest", "A popular All terrain vehicle adventure held annually for all to participate, travelling from Wreck Cove, all the way to Cheticamp. Many riders all across Atlantic Canada make their way to this yearly ATV run.", R.drawable.events_highland_quest));
        locations.add(new Location("Celtic Colours International Festival", "Celtic Colours is an international celebration of culture and music, played by some of the most well known Cape Breton artists. Held over several days, numerous concerts are to be taken place throughout each day", R.drawable.events_celtic_colours));
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);
        ListView listView = (ListView) getActivity().findViewById(R.id.events_display);
        listView.setAdapter(adapter);

    }
}