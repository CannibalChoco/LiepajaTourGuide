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
public class ActiveLeisureFragment extends Fragment {


    public ActiveLeisureFragment() {
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
        attractions.add(new Attraction(R.string.tarzan, R.string.tarzan_description,
                R.drawable.tarzan));
        attractions.add(new Attraction(R.string.karosta_prison, R.string.karosta_prison_description,
                R.drawable.karosta_prison));
        attractions.add(new Attraction(R.string.children_playground,
                R.string.children_playground_description, R.drawable.children_layground));
        attractions.add(new Attraction(R.string.archery_range, R.string.arechery_range_description,
                R.drawable.archery_liepaja));
        attractions.add(new Attraction(R.string.windsurfing_club,
                R.string.windsurfing_club_description, R.drawable.windsurfing));
        attractions.add(new Attraction(R.string.bb_wakepark, R.string.bb_wakepark_description,
                R.drawable.bb_wakepark));
        attractions.add(new Attraction(R.string.boat_rental, R.string.boat_rental_description,
                R.drawable.boat_rental));
        attractions.add(new Attraction(R.string.quest_house, R.string.quest_house_description,
                R.drawable.quest_house));
        attractions.add(new Attraction(R.string.ship_and_catamaran_rent,
                R.string.ship_and_catamaran_rent_description, R.drawable.cetri_veji));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
