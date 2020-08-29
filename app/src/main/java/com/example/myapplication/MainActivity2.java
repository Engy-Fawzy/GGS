package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void openhotel1 (View View){
        Intent Hotel1 = new Intent(MainActivity2.this, MainActivity.class);
        startActivity(Hotel1);
    }
    public void openhotel2 (View View) {
        Intent Hotel2 = new Intent(MainActivity2.this, MainActivity3.class);
        startActivity(Hotel2);
    }
        public void openhotel3 (View View){
            Intent Hotel3 = new Intent(MainActivity2.this, MainActivity3.class);
            startActivity(Hotel3);
        }
    public void back (View View){
        Intent back = new Intent(MainActivity2.this, FirstActivity.class);
        startActivity(back);
    }

        }
