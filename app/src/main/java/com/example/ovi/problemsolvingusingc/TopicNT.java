package com.example.ovi.problemsolvingusingc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class TopicNT extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic_nt);

        TextView ntintro = findViewById(R.id.ntintro);
        ntintro.setMovementMethod(LinkMovementMethod.getInstance());

        TextView primeLinks = findViewById(R.id.primeLinks);
        primeLinks.setMovementMethod(LinkMovementMethod.getInstance());

        TextView divisor = findViewById(R.id.divisor);
        divisor.setMovementMethod(LinkMovementMethod.getInstance());

        TextView modular = findViewById(R.id.modular);
        modular.setMovementMethod(LinkMovementMethod.getInstance());

        TextView combinatorics = findViewById(R.id.combinatorics);
        combinatorics.setMovementMethod(LinkMovementMethod.getInstance());

        TextView Euclid = findViewById(R.id.Euclid);
        Euclid.setMovementMethod(LinkMovementMethod.getInstance());

        TextView prob = findViewById(R.id.prob);
        prob.setMovementMethod(LinkMovementMethod.getInstance());

        TextView nt_other = findViewById(R.id.nt_other);
        nt_other.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
