package com.example.android.tourguideapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class CultureFragment extends Fragment {
    public CultureFragment(){
    }

    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);
        final ArrayList<Location> location = new ArrayList<Location>();
        location.add(new Location("Театр оперы и балета ",R.drawable.operbalet, getString(R.string.operbalet), getString(R.string.addressoper), getString(R.string.phoneoper),"42.878133,74.612777"));
        location.add(new Location("Филармония",R.drawable.filar, getString(R.string.filar), getString(R.string.addressfilar), getString(R.string.phonefilar),"42.878028,74.587688"));
        location.add(new Location("Русский театр драмы",R.drawable.rus, getString(R.string.rus), getString(R.string.addressrus), getString(R.string.phonerus),"42.877640,74.608976"));
        location.add(new Location("Музей Г.Айтиева",R.drawable.gapar, getString(R.string.gapar), getString(R.string.addressgap), getString(R.string.phonegap),"42.878745,74.610872"));
        LocationAdapter adapter = new LocationAdapter(getActivity(), location);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
