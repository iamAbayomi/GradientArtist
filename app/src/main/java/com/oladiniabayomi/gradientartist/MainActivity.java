package com.oladiniabayomi.gradientartist;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Build;
import android.os.Bundle;


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

       // FloatingActionButton fab = findViewById(R.id.fab);

    }




}
