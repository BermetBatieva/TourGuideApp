package com.example.android.tourguideapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class ParksFragment extends Fragment {
    public ParksFragment(){

    }

    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);
        final ArrayList<Location> location = new ArrayList<Location>();
        location.add(new Location("Парк Панфилова", R.drawable.panfil, getString(R.string.panfilov), getString(R.string.addresspan), getString(R.string.phonepanfilov),"42.878178,74.600564"));
        location.add(new Location("Дубовый парк", R.drawable.dub, getString(R.string.dub), getString(R.string.addressdub), getString(R.string.phonedub),"42.878023,74.607169"));
        location.add(new Location("Парк победы", R.drawable.pobeda, getString(R.string.pobeda), getString(R.string.addresspob), getString(R.string.phonepob),"42.826431,74.604214"));
        location.add(new Location("Парк Любви", R.drawable.lub, getString(R.string.lub), getString(R.string.addresslub), getString(R.string.phonelub),"42.832188,74.587030"));
        LocationAdapter adapter = new LocationAdapter(getActivity(), location);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}
