package com.example.lab04;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class BottomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom);
        BottomNavigationView bot=findViewById(R.id.bottomNavigationView);
        bot.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    int id=item.getItemId();
                    if(id==R.id.home) {
                        load(new HomeFragment(),true);
                    } else if(id==R.id.about) {
                        load(new AboutFragment(),false);
                    } else {
                        load(new SettingsFragment(),false);
                    }
                return true;
            }
        });
        bot.setSelectedItemId(R.id.home);

    }
    public void load(Fragment fragment,Boolean f){
        FragmentTransaction fg=getSupportFragmentManager().beginTransaction();
        if(f) {
            fg.replace(R.id.frame,fragment);
        } else {
            fg.add(R.id.frame,fragment);
        }
        fg.commit();
    }
}