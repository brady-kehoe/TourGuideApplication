package com.example.android.tourguideapplication;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import org.w3c.dom.Attr;

public class FragmentAdapter extends FragmentStateAdapter {
    public FragmentAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
       switch (position)
        {
            case 1 :
                return new EatDrinkFragment();
            case 2 :
                return new HomeFragment();
            case 3 :
                return new EventsFragment();
            case 4 :
                return new AccommodationsFragment();
        }

        return new AttractionsFragment();
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
