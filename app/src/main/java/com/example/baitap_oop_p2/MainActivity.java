package com.example.baitap_oop_p2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Rectangle rectangle = new Rectangle(4.5,5.5);
        rectangle.getInformation();
    }
}
