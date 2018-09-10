package com.example.ovi.problemsolvingusingc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

public class STL extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stl);

        TextView biginnerLinks = findViewById(R.id.biginnerLinks);
        biginnerLinks.setMovementMethod(LinkMovementMethod.getInstance());

        TextView complexityLinks = findViewById(R.id.compxityLinks);
        complexityLinks.setMovementMethod(LinkMovementMethod.getInstance());

        TextView stlLinks = findViewById(R.id.stlLinks);
        stlLinks.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
