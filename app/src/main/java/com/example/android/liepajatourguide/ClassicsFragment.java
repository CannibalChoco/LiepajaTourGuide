package com.example.android.liepajatourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ClassicsFragment extends Fragment {


    public ClassicsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        /**
         * Create a list of attractions in Active Leisure category
         */
        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction(R.string.great_amber, R.string.great_amber_description,
                R.drawable.great_amber));
        attractions.add(new Attraction(R.string.musicians_alley, R.string.great_amber_description,
                R.drawable.musicians_alley));
        attractions.add(new Attraction(R.string.rose_square, R.string.rose_square_description,
                R.drawable.rose_square));
        attractions.add(new Attraction(R.string.anthem_characters, R.string.anthem_characters_description,
                R.drawable.anthem_characters));
        attractions.add(new Attraction(R.string.applied_arts_center, R.string.applied_arts_center_description,
                R.drawable.applied_atrs));
        attractions.add(new Attraction(R.string.house_of_craftsmen, R.string.house_of_craftsmen_description,
                R.drawable.house_of_craftsmen));
        attractions.add(new Attraction(R.string.peter_market, R.string.peter_market_description,
                R.drawable.peters_market));
        attractions.add(new Attraction(R.string.occupation_museum, R.string.occupation_museum_description,
                R.drawable.occupation_museum));
        attractions.add(new Attraction(R.string.liepaja_museum, R.string.liepaja_museum_description,
                R.drawable.liepaja_museum));


        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
