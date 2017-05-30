package com.example.android.liepajatourguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AttractionAdapter extends ArrayAdapter {

    public AttractionAdapter(Activity context, ArrayList<Attraction> attractions) {
        super(context, 0, attractions);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // get the Attraction object located at this position in the list
        Attraction currentAttraction = (Attraction) getItem(position);

        // set name
        TextView name = (TextView) listItemView.findViewById(R.id.name);
        name.setText(currentAttraction.getNameResourceId());

        // set description
        TextView description = (TextView) listItemView.findViewById(R.id.description);
        description.setText(currentAttraction.getDescriptionResourceId());

        // set image
        ImageView image = (ImageView) listItemView.findViewById(R.id.image);
        image.setImageResource(currentAttraction.getImageResourceId());

        return listItemView;
    }
}
