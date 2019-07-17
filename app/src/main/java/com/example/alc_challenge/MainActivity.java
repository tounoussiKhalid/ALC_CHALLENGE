package com.example.alc_challenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button profileBtn ;
    private Button aboutAlcBtn ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        profileBtn = findViewById(R.id.btnMyProfile);
        aboutAlcBtn = findViewById(R.id.btnAboutAlc) ;

        profileBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                 openProfileActivity();
            }
        });
        aboutAlcBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAboutAlcActivity();
            }
        });
    }

    public void openProfileActivity(){
        Intent intent = new Intent(this,MyProfile.class);
        startActivity(intent);
    }

    public void openAboutAlcActivity(){
        Intent intent = new Intent(this,AlcAboutActivity.class);
        startActivity(intent);
    }
}
