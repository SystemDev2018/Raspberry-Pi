package com.example.higa3.raspberrypictl;

import android.content.Intent;

public class MainActivity extends MainExtends {
    public MainActivity(){
        super(R.layout.activity_main);

    }
    @Override
    public void Move(){
        startActivity(new Intent(MainActivity.this,TvActivity.class));
    }
}
