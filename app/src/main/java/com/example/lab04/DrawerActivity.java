package com.example.lab04;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class DrawerActivity extends AppCompatActivity {
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawer);

        toolbar=findViewById(R.id.tb01);
        setSupportActionBar(toolbar);

        ActionBar actionbar=getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);

    }
}