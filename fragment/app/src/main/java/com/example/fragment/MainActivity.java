package com.example.fragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // FragmentManager fragmentManager=getSupportFragmentManager();
        //FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        //Fragment1 fragment1=new Fragment1();
        //Fragment2 fragment2=new Fragment2();
        // Create and set Android Fragment as default.
        Fragment Fragment1 = new Fragment1();
        this.setDefaultFragment(Fragment1);
       //Fragment1
        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment androidFragment = new Fragment1();
                replaceFragment(androidFragment);
            }
        });

        // Click this button to display fragment2.
        Button windowsButton = findViewById(R.id.button2);
        windowsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment Fragment2 = new Fragment2();
                replaceFragment(Fragment2);
            }
        });

        // Click this button to display fragment3.
        Button iosButton = findViewById(R.id.button3);
        iosButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment Fragment3 = new Fragment3();
                replaceFragment(Fragment3);
            }
        });

    }

    private void setDefaultFragment(Fragment defaultFragment)
    {
        this.replaceFragment(defaultFragment);
    }


    public void replaceFragment(Fragment destFragment)
    {
        FragmentManager fragmentManager = this.getSupportFragmentManager();

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.replace(R.id.frame1, destFragment);

        fragmentTransaction.commit();
    }


    }
