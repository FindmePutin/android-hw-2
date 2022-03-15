package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity2 extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView value = findViewById(R.id.name);
        TextView value2 = findViewById(R.id.age);
        TextView value3 = findViewById(R.id.job2);
        TextView value4 = findViewById(R.id.phone2);
        TextView value5 = findViewById(R.id.email2);

        Button Url = findViewById(R.id.button3);
        Bundle bundle = getIntent().getExtras();

        String Finally = bundle.getString("finaly");
        String Finally2 = bundle.getString("finaly2");
        String Finally3 = bundle.getString("finaly3");
        String Finally4 = bundle.getString("finaly4");
        String Finally5 = bundle.getString("finaly5");

          System.out.println("eslam" + Finally2);
        value.setText(Finally);
        value2.setText(Finally2);
        value3.setText(Finally3);
        value4.setText(Finally4);
        value5.setText(Finally5);

        Url.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Getintent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.thisworldthesedays.com/get-free-vbucks-for-free.html"));
               startActivity(Getintent);
            }
        });






    }




//    Button UrlOpen;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//       super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main2);
//
//        UrlOpen = (Button)findViewById(R.id.button3);
//
//        UrlOpen.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//
//                Intent Getintent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.thisworldthesedays.com/get-free-vbucks-for-free.html"));
//                startActivity(Getintent);
//
//            }
//        });
//
//    }
}