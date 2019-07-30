package com.example.earthquake;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class EarthquakeAdapter extends ArrayAdapter<earthquake> {


    public EarthquakeAdapter(Context context, List<earthquake> earthquakes) {
        super(context, 0, earthquakes);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.earthquake_list_item, parent, false);
        }


        earthquake currentEarthquake = getItem(position);


        TextView magnitudeView = (TextView) listItemView.findViewById(R.id.magnitude);


        magnitudeView.setText(currentEarthquake.getMagnitude());


        TextView locationView = (TextView) listItemView.findViewById(R.id.location);

        locationView.setText(currentEarthquake.getLocation());
        TextView timeView = (TextView) listItemView.findViewById(R.id.date);
        timeView.setText(currentEarthquake.getDate());

        return listItemView;
    }


}
