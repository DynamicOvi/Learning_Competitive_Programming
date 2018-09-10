package com.example.ovi.problemsolvingusingc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class TopicGreedy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic_greedy);
        TextView greedy = findViewById(R.id.greedy);
        greedy.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
