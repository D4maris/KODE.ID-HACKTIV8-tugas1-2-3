package com.example.assignment.Assignment_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;

import com.example.assignment.R;
import com.example.assignment.TUGAS3.Tugas33;
import com.example.assignment.Tugas1;

public class DirectionActivity extends AppCompatActivity {

    AppCompatButton tugas1btn,tugas2btn,tugas3btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_direction);

        tugas1btn = findViewById(R.id.tugas1btn);
        tugas2btn = findViewById(R.id.tugas2btn);
        tugas3btn = findViewById(R.id.tugas3btn);

        tugas1btn.setOnClickListener(v -> dotugas1());
        tugas2btn.setOnClickListener(v -> dotugas2());
        tugas3btn.setOnClickListener(v -> dotugas3());
    }

    private void dotugas1() {
        Intent intent = new Intent(this, Tugas1.class);
        startActivity(intent);
        finish();
    }
    private void dotugas2() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
    private void dotugas3() {
        Intent intent = new Intent(this, Tugas33.class);
        startActivity(intent);
        finish();
    }
}