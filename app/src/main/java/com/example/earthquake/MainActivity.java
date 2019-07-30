package com.example.earthquake;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create a fake list of earthquake locations.
        ArrayList<earthquake> earthquakes = new ArrayList<>();
        earthquakes.add(new earthquake("7.6","Bagh AJK","Oct 8 2005"));
        earthquakes.add(new earthquake("7.6","MZD AJK","Oct 8 2005"));
        earthquakes.add(new earthquake("7.6","Balakot ","Oct 8 2005"));


        // Find a reference to the {@link ListView} in the layout
        ListView earthquakeListView = (ListView) findViewById(R.id.list);
        EarthquakeAdapter adapter=new EarthquakeAdapter(this,earthquakes);
        earthquakeListView.setAdapter(adapter);
    }
}