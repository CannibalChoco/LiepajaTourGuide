package com.example.android.liepajatourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Emils on 25.05.2017.
 */

public class ActiveLeisureActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

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

        AttractionAdapter adapter = new AttractionAdapter(this, attractions);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
