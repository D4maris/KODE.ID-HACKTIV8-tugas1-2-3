package com.example.assignment.Assignment_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.assignment.R;

public class MainActivity extends AppCompatActivity {
    private int mCounter = 0;
    Button buttonplus;
    TextView textcount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonplus = findViewById(R.id.buttonplus);
        textcount = findViewById(R.id.textcount);

        buttonplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCounter ++;
                textcount.setText(Integer.toString(mCounter));
            }
        });

    }
}