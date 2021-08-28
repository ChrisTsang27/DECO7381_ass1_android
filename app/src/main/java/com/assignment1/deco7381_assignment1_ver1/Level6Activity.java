package com.assignment1.deco7381_assignment1_ver1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Level6Activity extends AppCompatActivity {

    private TextView level6Back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level6);
        level6Back = findViewById(R.id.level6_game_back);
        level6Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Level6Activity.this, LevelPageActivity.class);
                startActivity(intent);
            }
        });
    }
}