package com.example.android.liepajatourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

import static android.R.attr.category;

/**
 * A simple {@link Fragment} subclass.
 */
public class NatureFragment extends Fragment {


    public NatureFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        // Create a list of attractions in Active Leisure category
        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction(R.string.liepaja_lake, R.string.liepaja_lake_description,
                R.drawable.liepaja_lake));
        attractions.add(new Attraction(R.string.liepaja_beach, R.string.liepaja_beach_description,
                R.drawable.liepaja_beach));
        attractions.add(new Attraction(R.string.seaside_park, R.string.seaside_park_description,
                R.drawable.seaside_park));
        attractions.add(new Attraction(R.string.raina_park, R.string.raina_park_description,
                R.drawable.raina_park));
        attractions.add(new Attraction(R.string.southern_breakwater,
                R.string.southern_breakwater_description, R.drawable.southern_breakwater));
        attractions.add(new Attraction(R.string.northern_breakwater,
                R.string.northern_breakwater_description, R.drawable.northern_breakwater));
        attractions.add(new Attraction(R.string.seaside_park_velo_track,
                R.string.seaside_park_velo_track_description, R.drawable.velo_track2));

        // set the adapter on listview
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
