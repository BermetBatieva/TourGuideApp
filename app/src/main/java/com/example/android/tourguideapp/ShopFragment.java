package com.example.android.tourguideapp;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class ShopFragment extends Fragment {
    public ShopFragment(){

    }

    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);
        final ArrayList<Location> location = new ArrayList<Location>();
        location.add(new Location("ЦУМ", R.drawable.tsum, getString(R.string.tsum),getString(R.string.addresstsum),getString(R.string.phonetsum),"42.876260, 74.614568"));
        location.add(new Location("Бишкек парк", R.drawable.bish, getString(R.string.bish),getString(R.string.addressbish),getString(R.string.phonebish),"42.874775, 74.590483"));
        location.add(new Location("Азия Молл", R.drawable.asiamall, getString(R.string.asiamall),getString(R.string.addressasiamall),getString(R.string.phoneasiamall),"42.855592, 74.585055"));
        location.add(new Location("Дордой Плаза", R.drawable.dor, getString(R.string.dordoy),getString(R.string.addressdordoy),getString(R.string.phonedordoy),"42.874341, 74.618110"));
        location.add(new Location("Вефа Центр", R.drawable.vefa, getString(R.string.vefa),getString(R.string.addressvefa),getString(R.string.phonevefa),"42.857598, 74.609477"));
        location.add(new Location("ГУМ", R.drawable.gum, getString(R.string.gum),getString(R.string.addressgum),getString(R.string.phonegum),"42.875021,74.614290"));
        LocationAdapter adapter = new LocationAdapter(getActivity(), location);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}