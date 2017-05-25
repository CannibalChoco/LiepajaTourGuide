package com.example.android.liepajatourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView classicsView = (TextView) findViewById(R.id.category_classics);
        classicsView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent classicsIntent = new Intent(MainActivity.this, ClassicsActivity.class);
                startActivity(classicsIntent);
            }
        });

        TextView activeLeisureView = (TextView) findViewById(R.id.category_active_leisure);
        activeLeisureView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activeLeisureIntent = new Intent(MainActivity.this, ActiveLeisureActivity.class);
                startActivity(activeLeisureIntent);
            }
        });

        TextView natureView = (TextView) findViewById(R.id.category_nature);
        natureView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent natureIntent = new Intent(MainActivity.this, NatureActivity.class);
                startActivity(natureIntent);
            }
        });

        TextView hotelsView = (TextView) findViewById(R.id.category_hotels);
        hotelsView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hotelsIntent = new Intent(MainActivity.this, HotelsActivity.class);
                startActivity(hotelsIntent);
            }
        });

        TextView diningView = (TextView) findViewById(R.id.category_dining);
        diningView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent diningIntent = new Intent(MainActivity.this, DiningActivity.class);
                startActivity(diningIntent);
            }
        });
     }
}
