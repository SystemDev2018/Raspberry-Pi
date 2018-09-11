//package com.example.kimura.a2018groupsystem;
//
//public class MainExtends extends MainActivity {
//    public MainExtends(){
//
//    }
//}
package com.example.higa3.raspberrypictl;

import android.app.Activity;
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
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class MainExtends extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    int view;
    Activity root;
    public MainExtends(int v){
        view=v;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(view);

        DrawerLayout layout = (DrawerLayout) findViewById(R.id.drawer_layout);
        for (int i = 0; i < 3; ++i) {
            View view = getLayoutInflater().inflate(R.layout.sub, null);
            layout.addView(view, 30, 100 * i);


            TextView text = (TextView) view.findViewById(R.id.text);
            text.setText("I'm android No." + i);
        }

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public void MoveTv() {
        startActivity(new Intent(root,TvActivity.class));
    }

    public void MoveAc() {
        startActivity(new Intent(root,AcActivity.class));
    }
    public void setRoot(Activity ac){
        root=ac;
    }
    int kim=0;
    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
            MoveAc();
        } else if (id == R.id.nav_gallery) {
           MoveTv();
        } else if (id == R.id.nav_slideshow) {


//            try {
//                InputStream in;
//                String kimura2;
//                in=openFileInput("C:\\Users\\kimura\\Documents\\GitHub\\Raspberry-Pi\\RaspberryPiCtl\\app\\src\\main\\res\\layout\\content_main.xml");
//                BufferedReader reader= new BufferedReader(new InputStreamReader(in,"UTF-8"));
//
//                OutputStream out;
//                out = openFileOutput("C:\\Users\\kimura\\Documents\\GitHub\\Raspberry-Pi\\RaspberryPiCtl\\app\\src\\main\\res\\layout\\content_main.xml",MODE_PRIVATE|MODE_APPEND);
//                PrintWriter writer = new PrintWriter(new OutputStreamWriter(out,"UTF-8"));
//
//                while( (kimura2 = reader.readLine()) != null ){
//                    writer.println(kimura2);
//                    if(kimura2.contains("app:layout_constraintTop_toTopOf=\"parent\" />")==true){
//                        writer.println( " <TextView android:layout_width=\"wrap_content\" " +
//                                "android:layout_height=\"wrap_content\" " +
//                                "android:text=\"Hello World!"+(kim++)+"\"" +
//                                "app:layout_constraintBottom_toBottomOf=\"parent\" " +
//                                "app:layout_constraintLeft_toLeftOf=\"parent\" " +
//                                "app:layout_constraintRight_toRightOf=\"parent\" " +
//                                "app:layout_constraintTop_toTopOf=\"parent\" />");
//                    }
//                }
//                writer.close();
//
//            } catch (FileNotFoundException e) {
//                e.printStackTrace();
//            } catch (UnsupportedEncodingException e) {
//                e.printStackTrace();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }

        }else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}


