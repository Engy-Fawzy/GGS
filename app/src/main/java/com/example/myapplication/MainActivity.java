package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int price = 1000;

    public void submitOrder(View View) {

        CheckBox food1checkbox = (CheckBox) findViewById(R.id.food1_checkbox);
        boolean food1 = food1checkbox.isChecked();
        CheckBox food2checkbox = (CheckBox) findViewById(R.id.food2_checkbox);
        boolean food2 = food2checkbox.isChecked();
        CheckBox food3checkbox = (CheckBox) findViewById(R.id.food3_checkbox);
        boolean food3 = food3checkbox.isChecked();
        displayPrice(price);

    }

    public void F1(View View) {
        price = 1500;

    }
    public void F2(View View) {
        price = 2000 ;

    }
    public void F3(View View) {
        price = 2500;

    }
    private void displayPrice ( int number){
        TextView priceTextView= findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));

    }

}
