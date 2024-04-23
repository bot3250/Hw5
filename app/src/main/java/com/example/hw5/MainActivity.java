package com.example.hw5;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Game> games = new ArrayList<Game>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        RecyclerView recyclerView = findViewById(R.id.list);
        StateAdapter adapter = new StateAdapter(this, games);
        recyclerView.setAdapter(adapter);
    }

    private void init(){
        games.add(new Game("1", "CS2", R.drawable.cs2));
        games.add(new Game("2", "Dota", R.drawable.dota));
        games.add(new Game("3", "Standoff2", R.drawable.standoff2));
        games.add(new Game("4", "Brawl Stars", R.drawable.brawlstart));
        games.add(new Game("5", "Rust", R.drawable.rust));
    }
}