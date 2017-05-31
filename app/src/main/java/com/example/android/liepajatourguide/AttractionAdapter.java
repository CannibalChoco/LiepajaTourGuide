package com.example.android.liepajatourguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AttractionAdapter extends ArrayAdapter {

    public AttractionAdapter(Activity context, ArrayList<Attraction> attractions) {
        super(context, 0, attractions);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        ViewHolder holder; // to reference the child views for later actions

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate
                    (R.layout.list_item, parent, false);

            // cache view fields into the holder
            holder = new ViewHolder(listItemView);
            listItemView.setTag(holder);
        }else{
            holder = (ViewHolder) listItemView.getTag();
        }

        // get the Attraction object located at this position in the list
        Attraction currentAttraction = (Attraction) getItem(position);
        holder.name.setText(currentAttraction.getNameResourceId());
        holder.description.setText(currentAttraction.getDescriptionResourceId());
        holder.image.setImageResource(currentAttraction.getImageResourceId());

        return listItemView;
    }

    static class ViewHolder {
        @BindView(R.id.name) TextView name;
        @BindView(R.id.description) TextView description;
        @BindView(R.id.image) ImageView image;

        public ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
