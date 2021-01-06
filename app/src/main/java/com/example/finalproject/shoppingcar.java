package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class shoppingcar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoppingcar);
        TextView tv_total = findViewById(R.id.tv_total);
        String total = new String();
        ArrayList<String> meal = new ArrayList<String>();
        Bundle bundle = this.getIntent().getExtras();
        if (bundle != null)
        {

            meal = bundle.getStringArrayList("0");
            for (int i = 0; i<meal.size(); i++)
            {
                total +=meal.get(i)+"\n";

            }
            System.out.println("------------------------");
            System.out.println(meal);
            System.out.println(total);
            tv_total.setText(total);

        }


    }
}