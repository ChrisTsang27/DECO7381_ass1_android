package com.assignment1.deco7381_assignment1_ver1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Level1Activity extends AppCompatActivity {

    private TextView level1Back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1);
        level1Back = findViewById(R.id.level1_game_back);
        level1Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Level1Activity.this, LevelPageActivity.class);
                startActivity(intent);
            }
        });
    }
}