package com.example.android.liepajatourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HotelsFragment extends Fragment {


    public HotelsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        // Create a list of attractions in Active Leisure category
        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction(R.string.promenade_hotel,
                R.string.promenade_hotel_description, R.drawable.hotel_promenade));
        attractions.add(new Attraction(R.string.fontaine_royal,
                R.string.fontaine_royal_description, R.drawable.fontaine_royal));
        attractions.add(new Attraction(R.string.hotel_libava,
                R.string.hotel_libava_description, R.drawable.hotel_libava));
        attractions.add(new Attraction(R.string.hotel_amrita,
                R.string.hotel_amrita_description, R.drawable.hotel_amrita));
        attractions.add(new Attraction(R.string.hotel_liva,
                R.string.hotel_liva_description, R.drawable.hotel_liva));
        attractions.add(new Attraction(R.string.hotel_roze,
                R.string.hotel_roze_description, R.drawable.hotel_roze));
        attractions.add(new Attraction(R.string.hotel_fontaine,
                R.string.hotel_fontaine_description, R.drawable.hotel_fontaine));
        attractions.add(new Attraction(R.string.hotel_vilhelmine,
                R.string.hotel_vilhelmine_description, R.drawable.hotel_vilhelmine));
        attractions.add(new Attraction(R.string.hotel_ezera_maja,
                R.string.hotel_ezera_maja_description, R.drawable.ezera_maja));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
