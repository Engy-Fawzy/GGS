package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SecondHotels extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_hotels);
    }public void openhotel1 (View View){
        Intent Hotel1 = new Intent(SecondHotels.this, MainActivity3.class);
        startActivity(Hotel1);
    }
    public void openhotel2 (View View) {
        Intent Hotel2 = new Intent(SecondHotels.this, MainActivity3.class);
        startActivity(Hotel2);
    }
    public void openhotel3 (View View){
        Intent Hotel3 = new Intent(SecondHotels.this, MainActivity3.class);
        startActivity(Hotel3);
    }
    public void back (View View){
        Intent back = new Intent(SecondHotels.this, FirstActivity.class);
        startActivity(back);
    }

}