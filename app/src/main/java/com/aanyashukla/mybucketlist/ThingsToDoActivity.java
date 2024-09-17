package com.aanyashukla.mybucketlist;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class ThingsToDoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_things_to_do);
        setUpList();
    }

    private void setUpList() {
        BucketListEntry[] thingsToDo = {
                new BucketListEntry("Own a Library", "Will contain every fav book of mine as well as books i want to read", R.drawable.library, 5),
                new BucketListEntry("Experience the Northern Lights", "Somewhere in the Arctic Circle, probably Norway", R.drawable.northern_lights, 5),
                new BucketListEntry("Scuba Diving", "In Palau ,Oceania", R.drawable.scuba_diving, 4.5f),
                new BucketListEntry("Sky Diving", "Preferably somewhere with a nice view", R.drawable.sky_diving, 5),
                new BucketListEntry("Bungee Jumping", "At The Victoria Falls Bridge in Zimbabwe", R.drawable.bungee_jumping, 4)

        };

        RecyclerView recyclerView = findViewById(R.id.recycler_view_things_to_do);
        BucketListEntryAdapter adapter = new BucketListEntryAdapter(thingsToDo);
        recyclerView.setAdapter(adapter);

    }
}