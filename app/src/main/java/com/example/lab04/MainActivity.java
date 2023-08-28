package com.example.lab04;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar=findViewById(R.id.tb01);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.menu,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.home)
        {
            Toast.makeText(this,"Home",Toast.LENGTH_SHORT).show();
        }
        if(item.getItemId()==R.id.settings)
        {
            Toast.makeText(this,"Settings",Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(MainActivity.this,DrawerActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}