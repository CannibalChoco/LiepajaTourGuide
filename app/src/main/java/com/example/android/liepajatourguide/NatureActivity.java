package com.example.android.liepajatourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Emils on 25.05.2017.
 */

public class NatureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        /**
         * Create a list of attractions in Active Leisure category
         */
        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction(R.string.liepaja_lake, R.string.liepaja_lake_description, R.drawable.liepaja_lake));
        attractions.add(new Attraction(R.string.liepaja_beach, R.string.liepaja_beach_description, R.drawable.liepaja_beach));
        attractions.add(new Attraction(R.string.seaside_park, R.string.seaside_park_description, R.drawable.seaside_park));
        attractions.add(new Attraction(R.string.raina_park, R.string.raina_park_description, R.drawable.raina_park));
        attractions.add(new Attraction(R.string.southern_breakwater, R.string.southern_breakwater_description, R.drawable.southern_breakwater));
        attractions.add(new Attraction(R.string.northern_breakwater, R.string.northern_breakwater_description, R.drawable.northern_breakwater));
        attractions.add(new Attraction(R.string.seaside_park_velo_track, R.string.seaside_park_velo_track_description, R.drawable.velo_track2));


        AttractionAdapter adapter = new AttractionAdapter(this, attractions);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
