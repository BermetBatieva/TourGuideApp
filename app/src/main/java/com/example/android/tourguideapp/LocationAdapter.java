package com.example.android.tourguideapp;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class LocationAdapter extends ArrayAdapter<Location> {
    public LocationAdapter(Context context, ArrayList<Location> location) {
        super(context, 0, location);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        final Location currentLocation = getItem(position);

        TextView location_name = (TextView) listItemView.findViewById(R.id.location_name);
        location_name.setText(currentLocation.getName());

        ImageView image = (ImageView) listItemView.findViewById(R.id.image);
        Glide.with(image).load(currentLocation.getImageResourceId()).into(image);

        View textContainer = listItemView.findViewById(R.id.text_container);

        TextView description = (TextView) listItemView.findViewById(R.id.info);
        description.setText(currentLocation.getDescription());

        TextView address = (TextView) listItemView.findViewById(R.id.address);
        address.setText(currentLocation.getAddress());
        address.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String location = currentLocation.getCoordinate();
                Intent seeOnMap = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:" + location + "?18"));
                getContext().startActivity(seeOnMap);
            }
        });

        TextView number = (TextView) listItemView.findViewById(R.id.phone);
        View num = (View) listItemView.findViewById(R.id.number);
        if (currentLocation.hasNumber()) {
            number.setText(currentLocation.getNumber());
            number.setVisibility(View.VISIBLE);
            number.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String phoneNumber = currentLocation.getNumber();
                    Intent callIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + phoneNumber));
                    getContext().startActivity(callIntent);
                }
            });
        } else {
            num.setVisibility(View.GONE);
        }
        ImageView more = (ImageView) listItemView.findViewById(R.id.arrow);
        View info = (View) listItemView.findViewById(R.id.more);
        info.setVisibility(View.GONE);
        final View finalListItemView = listItemView;
        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View info = (View) finalListItemView.findViewById(R.id.more);
                if (info.getVisibility() == View.VISIBLE) {
                    info.setVisibility(View.GONE);
                } else if (info.getVisibility() == View.GONE) {
                    info.setVisibility(View.VISIBLE);
                }
            }
        });
        return listItemView;
    }

}
