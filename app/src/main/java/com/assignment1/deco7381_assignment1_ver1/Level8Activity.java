package com.assignment1.deco7381_assignment1_ver1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Level8Activity extends AppCompatActivity {

    private TextView level8Back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level8);
        level8Back = findViewById(R.id.level8_game_back);
        level8Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Level8Activity.this, LevelPageActivity.class);
                startActivity(intent);
            }
        });
    }
}