package com.example.ovi.problemsolvingusingc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Topics = findViewById(R.id.Topics); //Initializing program Button.
        Topics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(),ProgrammingTopics.class);
                startActivity(startIntent);
            }
        });

        Button Contest = findViewById(R.id.Contest);
        Contest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(),contestSites.class);
                startActivity(startIntent);
            }
        });

        Button Links = findViewById(R.id.Links);
        Links.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(),UsefulLinks.class);
                startActivity(startIntent);
            }
        });

        Button DeveloperID = findViewById(R.id.DeveloperID);
        DeveloperID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(),Developer.class);
                startActivity(startIntent);
            }
        });
    }
}

