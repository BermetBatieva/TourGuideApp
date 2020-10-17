package com.example.android.tourguideapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class RestaurantsFragment extends Fragment {
    public RestaurantsFragment(){

    }

    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);
        final ArrayList<Location> location = new ArrayList<Location>();
        location.add(new Location("Первый Сырный ресторан", R.drawable.ressyr, getString(R.string.syr),getString(R.string.addresssyr),getString(R.string.phonesyr),"42.842509, 74.621175"));
        location.add(new Location("Нават", R.drawable.resnavat, getString(R.string.navat), getString(R.string.addressnavat), getString(R.string.phonenavat),"42,8281248, 74,6038500"));
        location.add(new Location("Фрунзе", R.drawable.resfrunze, getString(R.string.resfrunze),getString(R.string.addressfr),getString(R.string.phonefr),"42,878941, 74,607026"));
        location.add(new Location("Фурусато", R.drawable.furusato, getString(R.string.resfuru),getString(R.string.addressfuru),getString(R.string.phonefuru),"42,866999, 74,601211"));
        location.add(new Location("Барашек", R.drawable.barash, getString(R.string.resbar),getString(R.string.addressbar),getString(R.string.phonebar),"42,818436, 74,624446"));
        LocationAdapter adapter = new LocationAdapter(getActivity(), location);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}