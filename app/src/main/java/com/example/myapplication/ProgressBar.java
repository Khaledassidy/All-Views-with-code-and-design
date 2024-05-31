package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProgressBar extends AppCompatActivity {

    android.widget.ProgressBar progressBar_circular,progressBar_horizantal;
    Button button_progress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.progressbar);

        //inflate
        progressBar_circular=findViewById(R.id.loading);
        progressBar_horizantal=findViewById(R.id.loading_horizantal);
        button_progress=findViewById(R.id.button_progress);


        //bade et3mela ma3 5as2so lal progress bar
        progressBar_circular.setMax(100);//houn 3am 3adel l max ta3el l progress
        progressBar_circular.setProgress(30);//houn 3am 3adel l progress ta3el l progress bar
        progressBar_circular.incrementProgressBy(10);//houn 3am n2ol eno zeed l progress 10




        //application eno kel ma ekbous 3al button tzeed l progress bar l horizantal kel mara 10 w 7a 7et l progress bar in vivisble w bas ekbous 3al button kamen l progress bar l curcular tseer visible
        progressBar_circular.setVisibility(View.INVISIBLE);


        button_progress.setOnClickListener(v->{
            //5ale l progress bar loading visisble
            progressBar_circular.setVisibility(View.VISIBLE);

            //5ale l progress bar l horizantal tzeed kel shway b 10
            progressBar_horizantal.incrementProgressBy(10);
        });


    }
}