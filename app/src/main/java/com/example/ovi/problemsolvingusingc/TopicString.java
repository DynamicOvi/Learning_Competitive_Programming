package com.example.ovi.problemsolvingusingc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class TopicString extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic_string);
        TextView str= findViewById(R.id.str);
        str.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
