package com.example.test;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button bt=findViewById(R.id.button1);
       final ImageView img=findViewById(R.id.imageView);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String imageUri = "https://www.sideshowtoy.com/wp-content/uploads/2018/03/marvel-hulk-avengers-assemble-statue-sideshow-silo-200356.png";
                Picasso.with(getApplicationContext()).load(imageUri).into(img);
            }
       });
   }
}
