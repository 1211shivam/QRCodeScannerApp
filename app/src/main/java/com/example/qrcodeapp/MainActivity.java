package com.example.qrcodeapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button scanButton = findViewById(R.id.button_scan);
        Button generateButton = findViewById(R.id.button_generate);

        scanButton.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, ScanActivity.class)));
        generateButton.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, GenerateActivity.class)));
    }
}
