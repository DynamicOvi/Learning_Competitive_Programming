package com.example.ovi.problemsolvingusingc;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UsefulLinks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_useful_links);

        Button link1 = findViewById(R.id.link1);
        link1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String lnk="https://docs.google.com/viewer?a=v&pid=sites&srcid=ZGVmYXVsdGRvbWFpbnxzaGFudG84NnxneDplNjM5ZjhlYzYxMWY1N2Q";
                Uri webaddress=Uri.parse(lnk);
                Intent gotolnk = new Intent(Intent.ACTION_VIEW, webaddress);
                if(gotolnk.resolveActivity(getPackageManager())!=null)
                    startActivity(gotolnk);
            }
        });

        Button link2 = findViewById(R.id.link2);
        link2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String lnk="http://cpbook.subeen.com/";
                Uri webaddress=Uri.parse(lnk);
                Intent gotolnk = new Intent(Intent.ACTION_VIEW, webaddress);
                if(gotolnk.resolveActivity(getPackageManager())!=null)
                    startActivity(gotolnk);
            }
        });

        Button link3 = findViewById(R.id.link3);
        link3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String lnk="http://www.shafaetsplanet.com/planetcoding/";
                Uri webaddress=Uri.parse(lnk);
                Intent gotolnk = new Intent(Intent.ACTION_VIEW, webaddress);
                if(gotolnk.resolveActivity(getPackageManager())!=null)
                    startActivity(gotolnk);
            }
        });

        Button link4 = findViewById(R.id.link4);
        link4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String lnk="https://sites.google.com/site/smilitude/tutorials";
                Uri webaddress=Uri.parse(lnk);
                Intent gotolnk = new Intent(Intent.ACTION_VIEW, webaddress);
                if(gotolnk.resolveActivity(getPackageManager())!=null)
                    startActivity(gotolnk);
            }
        });

        Button link5 = findViewById(R.id.link5);
        link5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String lnk="http://zobayer.blogspot.com/";
                Uri webaddress=Uri.parse(lnk);
                Intent gotolnk = new Intent(Intent.ACTION_VIEW, webaddress);
                if(gotolnk.resolveActivity(getPackageManager())!=null)
                    startActivity(gotolnk);
            }
        });

        Button link6 = findViewById(R.id.link6);
        link6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String lnk="http://zobayer2009.wordpress.com/";
                Uri webaddress=Uri.parse(lnk);
                Intent gotolnk = new Intent(Intent.ACTION_VIEW, webaddress);
                if(gotolnk.resolveActivity(getPackageManager())!=null)
                    startActivity(gotolnk);
            }
        });

        Button link7 = findViewById(R.id.link7);
        link7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String lnk="http://one-problem-a-day.blogspot.com/";
                Uri webaddress=Uri.parse(lnk);
                Intent gotolnk = new Intent(Intent.ACTION_VIEW, webaddress);
                if(gotolnk.resolveActivity(getPackageManager())!=null)
                    startActivity(gotolnk);
            }
        });

        Button link8 = findViewById(R.id.link8);
        link8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String lnk="http://recurringblunders.blogspot.com/";
                Uri webaddress=Uri.parse(lnk);
                Intent gotolnk = new Intent(Intent.ACTION_VIEW, webaddress);
                if(gotolnk.resolveActivity(getPackageManager())!=null)
                    startActivity(gotolnk);
            }
        });

        Button link9 = findViewById(R.id.link9);
        link9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String lnk="http://hellohasan.com/";
                Uri webaddress=Uri.parse(lnk);
                Intent gotolnk = new Intent(Intent.ACTION_VIEW, webaddress);
                if(gotolnk.resolveActivity(getPackageManager())!=null)
                    startActivity(gotolnk);
            }
        });

        Button link10 = findViewById(R.id.link10);
        link10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String lnk="http://mukitmkbs.wordpress.com/";
                Uri webaddress=Uri.parse(lnk);
                Intent gotolnk = new Intent(Intent.ACTION_VIEW, webaddress);
                if(gotolnk.resolveActivity(getPackageManager())!=null)
                    startActivity(gotolnk);
            }
        });

        Button link11 = findViewById(R.id.link11);
        link11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String lnk="http://bidhanr.wordpress.com/";
                Uri webaddress=Uri.parse(lnk);
                Intent gotolnk = new Intent(Intent.ACTION_VIEW, webaddress);
                if(gotolnk.resolveActivity(getPackageManager())!=null)
                    startActivity(gotolnk);
            }
        });

        Button link12 = findViewById(R.id.link12);
        link12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String lnk="http://blog.faiyaz.info/";
                Uri webaddress=Uri.parse(lnk);
                Intent gotolnk = new Intent(Intent.ACTION_VIEW, webaddress);
                if(gotolnk.resolveActivity(getPackageManager())!=null)
                    startActivity(gotolnk);
            }
        });

        Button link13 = findViewById(R.id.link13);
        link13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String lnk="http://faiazerblog.blogspot.com/";
                Uri webaddress=Uri.parse(lnk);
                Intent gotolnk = new Intent(Intent.ACTION_VIEW, webaddress);
                if(gotolnk.resolveActivity(getPackageManager())!=null)
                    startActivity(gotolnk);
            }
        });

        Button link14 = findViewById(R.id.link14);
        link14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String lnk="http://problem-solving-notes.blogspot.com/";
                Uri webaddress=Uri.parse(lnk);
                Intent gotolnk = new Intent(Intent.ACTION_VIEW, webaddress);
                if(gotolnk.resolveActivity(getPackageManager())!=null)
                    startActivity(gotolnk);
            }
        });

        Button link15 = findViewById(R.id.link15);
        link15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String lnk="http://chorui12.blogspot.com/";
                Uri webaddress=Uri.parse(lnk);
                Intent gotolnk = new Intent(Intent.ACTION_VIEW, webaddress);
                if(gotolnk.resolveActivity(getPackageManager())!=null)
                    startActivity(gotolnk);
            }
        });

        Button link16 = findViewById(R.id.link16);
        link16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String lnk="http://tausiq.wordpress.com/";
                Uri webaddress=Uri.parse(lnk);
                Intent gotolnk = new Intent(Intent.ACTION_VIEW, webaddress);
                if(gotolnk.resolveActivity(getPackageManager())!=null)
                    startActivity(gotolnk);
            }
        });

        Button link17 = findViewById(R.id.link17);
        link17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String lnk="http://shakilcompetitiveprogramming.blogspot.com/";
                Uri webaddress=Uri.parse(lnk);
                Intent gotolnk = new Intent(Intent.ACTION_VIEW, webaddress);
                if(gotolnk.resolveActivity(getPackageManager())!=null)
                    startActivity(gotolnk);
            }
        });

        Button link18 = findViewById(R.id.link18);
        link18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String lnk="http://shikhorroy.wordpress.com/";
                Uri webaddress=Uri.parse(lnk);
                Intent gotolnk = new Intent(Intent.ACTION_VIEW, webaddress);
                if(gotolnk.resolveActivity(getPackageManager())!=null)
                    startActivity(gotolnk);
            }
        });
    }
}
