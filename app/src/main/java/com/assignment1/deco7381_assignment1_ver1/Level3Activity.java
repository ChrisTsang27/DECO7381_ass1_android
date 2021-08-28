package com.assignment1.deco7381_assignment1_ver1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Level3Activity extends AppCompatActivity {

    private TextView level3Back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level3);
        level3Back = findViewById(R.id.level3_game_back);
        level3Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Level3Activity.this, LevelPageActivity.class);
                startActivity(intent);
            }
        });
    }
}