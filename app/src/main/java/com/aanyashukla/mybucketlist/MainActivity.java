package com.aanyashukla.mybucketlist;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUpClickListener();

    }

    private void setUpClickListener() {
        CardView thingsToDoCard = findViewById(R.id.card_view_things_to_do);
        CardView placesToGo = findViewById(R.id.card_view_places_to_go);

        thingsToDoCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ThingsToDoActivity.class);
                startActivity(intent);
            }
        });

        placesToGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PlacesToGoActivity.class);
                startActivity(intent);
            }
        });
    }
}