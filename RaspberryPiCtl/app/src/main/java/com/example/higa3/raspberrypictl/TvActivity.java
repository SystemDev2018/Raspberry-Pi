package com.example.higa3.raspberrypictl;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class TvActivity extends MainExtends
        implements NavigationView.OnNavigationItemSelectedListener {

    public TvActivity(){
        super(R.layout.activity_main);
    }
    @Override
    public void Move(){
        startActivity(new Intent(TvActivity.this,TvActivity.class));
    }
}
