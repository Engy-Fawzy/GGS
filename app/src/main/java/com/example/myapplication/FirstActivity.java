package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }
    public void  dosearch (View View) {
        Intent search = new Intent ( FirstActivity.this, MainActivity2.class);
        startActivity(search);
    }
    public void  Place1 (View View) {
        Intent textView15 = new Intent ( FirstActivity.this, MainActivity2.class);
        startActivity(textView15);
    }
    public void  Place2 (View View) {
        Intent textView16 = new Intent ( FirstActivity.this, SecondHotels.class);
        startActivity(textView16);
    }
    public void  Place3 (View View) {
        Intent textView17 = new Intent ( FirstActivity.this, SecondHotels.class);
        startActivity(textView17);
    }
    public void  Place4 (View View) {
        Intent textView18 = new Intent ( FirstActivity.this, SecondHotels.class);
        startActivity(textView18);
    }
    public void  Place5 (View View) {
        Intent textView19 = new Intent ( FirstActivity.this, SecondHotels.class);
        startActivity(textView19);
    }
}