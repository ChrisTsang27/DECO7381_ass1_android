package com.assignment1.deco7381_assignment1_ver1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LevelPageActivity extends AppCompatActivity {

    private Button level1Btn;
    private Button level2Btn;
    private Button level3Btn;
    private Button level4Btn;
    private Button level5Btn;
    private Button level6Btn;
    private Button level7Btn;
    private Button level8Btn;
    private TextView levelPageBackBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_page);
        level1Btn = findViewById(R.id.level1_btn);
        level1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LevelPageActivity.this, Level1Activity.class);
                startActivity(intent);
            }
        });
        level2Btn = findViewById(R.id.level2_btn);
        level2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LevelPageActivity.this, Level2Activity.class);
                startActivity(intent);
            }
        });
        level3Btn = findViewById(R.id.level3_btn);
        level3Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LevelPageActivity.this, Level3Activity.class);
                startActivity(intent);
            }
        });
        level4Btn = findViewById(R.id.level4_btn);
        level4Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LevelPageActivity.this, Level4Activity.class);
                startActivity(intent);
            }
        });
        level5Btn = findViewById(R.id.level5_btn);
        level5Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LevelPageActivity.this, Level4Activity.class);
                startActivity(intent);
            }
        });
        level6Btn = findViewById(R.id.level6_btn);
        level6Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LevelPageActivity.this, Level6Activity.class);
                startActivity(intent);
            }
        });
        level7Btn = findViewById(R.id.level7_btn);
        level7Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LevelPageActivity.this, Level7Activity.class);
                startActivity(intent);
            }
        });
        level8Btn = findViewById(R.id.level8_btn);
        level8Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LevelPageActivity.this, Level8Activity.class);
                startActivity(intent);
            }
        });
        levelPageBackBtn = findViewById(R.id.level_page_back_btn);
        levelPageBackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LevelPageActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}