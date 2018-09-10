package com.example.ovi.problemsolvingusingc;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class contestSites extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contest_sites);

        Button link1 = findViewById(R.id.link1);
        link1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String lnk="http://codeforces.com/";
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
                String lnk="https://www.codechef.com/";
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
                String lnk="https://devskill.com/";
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
                String lnk="https://www.hackerrank.com/";
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
                String lnk="https://www.hackerearth.com/";
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
                String lnk="https://csacademy.com/";
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
                String lnk="http://atcoder.jp/";
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
                String lnk="https://uva.onlinejudge.org/";
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
                String lnk="https://www.urionlinejudge.com.br";
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
                String lnk="https://a2oj.com/";
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
                String lnk="http://www.lightoj.com/login_main.php";
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
                String lnk="https://www.spoj.com/";
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
                String lnk="http://acm.timus.ru/";
                Uri webaddress=Uri.parse(lnk);
                Intent gotolnk = new Intent(Intent.ACTION_VIEW, webaddress);
                if(gotolnk.resolveActivity(getPackageManager())!=null)
                    startActivity(gotolnk);
            }
        });

    }
}
