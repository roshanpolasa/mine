package com.example.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class Fragment1 extends Fragment {
    ImageView view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ImageView imageView=view.findViewById(R.id.imageView);
        Picasso.with(getContext()).load("https://www.sideshowtoy.com/wp-content/uploads/2018/03/marvel-hulk-avengers-assemble-statue-sideshow-silo-200356.png").into(imageView);
        return inflater.inflate(R.layout.fragment_fragment1, container, false);
    }


}
