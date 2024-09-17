package com.aanyashukla.mybucketlist;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

public class PlacesToGoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places_to_go);
        setUpList();

    }

    private void setUpList() {
        BucketListEntry[] placesToGo = {
                new BucketListEntry("South Korea", "It's a dream place! Would even settle down there if got a chance.", R.drawable.seoul_main, 5),
                new BucketListEntry("Japan", "Hot Springs, sushi, bullet train through mountains.", R.drawable.japan, 5),
                new BucketListEntry("Meghalaya", "Lush green landscapes, picturesque waterfalls, and winding rivers. It is a perfect serene escape into nature", R.drawable.meghalaya, 5),
                new BucketListEntry("Vietnam", "Con DAo Islands, Hanoi, Halong Bay", R.drawable.vietnam, 4),
                new BucketListEntry("Iceland", "Dynjandi waterfalls, nature reserves and Northern Lights", R.drawable.iceland, 4.5f)
        };

        RecyclerView recyclerView = findViewById(R.id.recycler_view_places_to_go);
        BucketListEntryAdapter adapter = new BucketListEntryAdapter(placesToGo);
        recyclerView.setAdapter(adapter);
    }
}