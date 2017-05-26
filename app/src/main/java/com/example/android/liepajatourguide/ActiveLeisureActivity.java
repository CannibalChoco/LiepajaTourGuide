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
        attractions.add(new Attraction("Tarzan", "Tarzan's Obstacle Park consists of 5 tracks and" +
                "76 different obstacles placed in trees up to 15 meters above the ground. It will be" +
                "interesting for both children and adults, since the tracks are tailored to" +
                "different interests."));
        attractions.add(new Attraction("Karosta Prison", "Guided tours in Karosta Prison and museum," +
                "show Behind Bars, accommodation and Extreme Night in prison. Different activities" +
                "in Northern Forts like guided tour, Spy game Escape from USSR and Labyrinth of Senses."));
        attractions.add(new Attraction("Children Playground", "Every Sunday from June 1st till" +
                "September 1st at midday 12:00 leisure activities, puppet theatre or cirkus" +
                "performances for children."));
        attractions.add(new Attraction("\"Archery Liepaja\" 3D archery range", "There are up to 20" +
                "different 3D animal targets in our 3D archery range, which are placed so that " +
                "anyone would be able to shoot."));
        attractions.add(new Attraction("Windsurfing Club \"Rietumkrasts\"", "Recreation on the water" +
                " - windsurfing, kite-surfing, water-skiing, bladders, water-motorbikes, motorboats. " +
                "Rentals and lessons. Portable kitchen, sauna, tent places."));
        attractions.add(new Attraction("Active Leisure Park \"BB wakepark\"", "In summer, “BB " +
                "wakepark” has the variety of offers as wakeboarding track and equipment rentals, " +
                "SUP board and boats rental, and for the full relaxation, sauna and hot-tub " +
                "services."));
        attractions.add(new Attraction("Boat rental \"Niknās laivas\"", "Furious and comfortable " +
                "boat rental for trips in Liepāja Trade Canal and Lake, as well as in rivers of " +
                "Kurzeme."));
        attractions.add(new Attraction("Quest House", "Quest House – is a unique adventure – offers " +
                "you an interesting team game for groups of 2-4 people. You get locked in a room, in" +
                " order to escape you should examine all hides, using hints and clues solve all " +
                "riddles, applying your logics and savvy."));
        attractions.add(new Attraction("Ship Četri vēji and catamaran rent", "Boat trips in Liepāja " +
                "port area and the sea. Boarding at the yacht port in Liepāja promenade. Fishing in " +
                "the sea and long boat trips."));

        AttractionAdapter adapter = new AttractionAdapter(this, attractions);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
