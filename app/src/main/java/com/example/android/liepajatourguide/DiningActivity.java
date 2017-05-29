package com.example.android.liepajatourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Emils on 25.05.2017.
 */

public class DiningActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        /**
         * Create a list of attractions in Active Leisure category
         */
        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction(R.string.reastaurant_piano, R.string.reastaurant_piano_description,
                R.drawable.restaurant_piano));
        attractions.add(new Attraction(R.string.house_of_food, R.string.house_of_food_description,
                R.drawable.house_of_food));
        attractions.add(new Attraction(R.string.restaurant_libava, R.string.restaurant_libava_description,
                R.drawable.restaurant_libava));
        attractions.add(new Attraction(R.string.restaurant_oskars, R.string.restaurant_oskars_description,
                R.drawable.restaurant_oskars));
        attractions.add(new Attraction(R.string.restaurant_upe, R.string.restaurant_upe_description,
                R.drawable.restaurant_upe));
        attractions.add(new Attraction(R.string.restaurant_pastnieka_maja,
                R.string.restaurant_pastnieka_maja_description, R.drawable.restaurant_pastnieka_maja));
        attractions.add(new Attraction(R.string.restaurant_olive, R.string.restaurant_olive_description,
                R.drawable.restaurant_olive));

        AttractionAdapter adapter = new AttractionAdapter(this, attractions);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
