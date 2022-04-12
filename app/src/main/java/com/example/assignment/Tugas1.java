package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatEditText;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;

import com.example.assignment.R;

//private static final String TAG = "Tugas1";

public class Tugas1 extends AppCompatActivity {

    private SharedPreferences mPreferences;
    private SharedPreferences.Editor mEditor;

    private AppCompatEditText text1;
    private AppCompatButton btn1;
    private AppCompatCheckBox box1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tugas1);

        text1 = findViewById(R.id.text1);
        btn1 = findViewById(R.id.btn1);
        box1 = findViewById(R.id.box1);

        mPreferences = PreferenceManager.getDefaultSharedPreferences(this);
//        mPreferences = getSharedPreferences("Mydatabase",Context.MODE_PRIVATE);
        mEditor = mPreferences.edit();

        checkSharedPreference();
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (box1.isChecked()){
                    mEditor.putString(getString(R.string.checkbox),"true");
                    mEditor.commit();

                    String name = text1.getText().toString();
                    mEditor.putString(getString(R.string.name), "name");
                    mEditor.commit();
                }else {
                    mEditor.putString(getString(R.string.checkbox),"false");

                    mEditor.commit();

                    mEditor.putString(getString(R.string.name),"");
                    mEditor.commit();

                }
            }
        });
    }

        private void checkSharedPreference(){
            String checkbox = mPreferences.getString(getString(R.string.checkbox),"false");
            String name = mPreferences.getString(getString(R.string.name),"");


            text1.setText(name);

            if (checkbox.equals("true")){
                box1.setChecked(true);
            }else {
                box1.setChecked(false);
            }

        }


    }
