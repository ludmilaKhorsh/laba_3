package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
public void onCorgiButtonClick(View view) {
    TextView breed = findViewById(R.id.breed);
    breed.setText("Корги");
    }
    public void onboxerButtonClick(View view) {
        TextView breed = findViewById(R.id.breed);
        breed.setText("Боксёр");
    }
    public void ondalmatianButtonClick(View view) {
        TextView breed = findViewById(R.id.breed);
        breed.setText("Долматинец");
    }
    public void onhaskiButtonClick(View view) {
        TextView breed = findViewById(R.id.breed);
        breed.setText("Хаски");
    }
}