package com.example.higa3.raspberrypictl;


import android.content.Intent;

public class TvActivity extends MainExtends {
    public TvActivity(){
        super(R.layout.activity_tv);
    }
    @Override
    public void Move(){
        startActivity(new Intent(TvActivity.this,TvActivity.class));
    }
}
