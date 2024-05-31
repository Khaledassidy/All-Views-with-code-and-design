package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class RatingBar extends AppCompatActivity {

    android.widget.RatingBar ratingBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ratingbar);

        //inflate
        ratingBar=findViewById(R.id.ratingBar_progrm);

        //fene et3mela ma3 l attribute ta3elo by coding le houne metl l max,rating,visible...etc
        ratingBar.setNumStars(6);
        ratingBar.setRating(1);
        ratingBar.setVisibility(View.VISIBLE);
        ratingBar.setStepSize(1);

        //keef bade 2a3ref eno l user 7adad 4 nojoum 2aw 3 nokoum ya3ne keef bade 2a3ref adesh l user 7at njoum
        //akeed be2ste3mel l listner

        //eno lama yet8ayar rating ynafez l code le b2alb l onrating change listener
        ratingBar.setOnRatingBarChangeListener(new android.widget.RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(android.widget.RatingBar ratingBar, float rating, boolean fromUser) {
                //float rating:byeb3talk 3adad l rating le 7ata l user
                //float l2no yemken l user y7ot nous
                Toast.makeText(getBaseContext(), "the rating is: "+rating, Toast.LENGTH_LONG).show();
            }
        });

    }
}