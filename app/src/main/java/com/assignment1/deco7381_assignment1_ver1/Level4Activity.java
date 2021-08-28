package com.assignment1.deco7381_assignment1_ver1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Level4Activity extends AppCompatActivity {

    private TextView level4Back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level4);
        level4Back = findViewById(R.id.level4_game_back);
        level4Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Level4Activity.this, LevelPageActivity.class);
                startActivity(intent);
            }
        });
    }
}