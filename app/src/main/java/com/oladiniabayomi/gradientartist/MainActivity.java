package com.oladiniabayomi.gradientartist;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;


import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.oladiniabayomi.gradientartists.GradientArtistBasic;
//import com.oladiniabayomi.gradientartists.GradientArtistBasic;

public class MainActivity extends AppCompatActivity {

    GradientArtistBasic gradient;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

            }
        });

        gradient = (GradientArtistBasic) findViewById(R.id.gradientImage);
        gradient.setUrlImage("https://img1.etsystatic.com/002/0/6449624/il_fullxfull.382134677_so6e.jpg",R.drawable.weather,
                R.drawable.weather, ImageView.ScaleType.CENTER_CROP);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }




}
