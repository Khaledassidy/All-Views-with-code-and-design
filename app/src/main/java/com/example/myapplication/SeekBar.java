package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SeekBar extends AppCompatActivity {

    android.widget.SeekBar seekBar_continous,seekBar_discrete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.seekbar);

        //inflate
        seekBar_continous=findViewById(R.id.seekbar_program_continous);
        seekBar_discrete=findViewById(R.id.seekbar_proram_discrete);


        seekBar_continous.setMax(100);//8ayer l max ta3el l seek bar
        seekBar_continous.setProgress(40);//8ayer l progress ta3el seek bar
        seekBar_continous.setVisibility(View.VISIBLE);//8ayer l visiblity


        //keef bade 2a3ref eno lama l user yemshe bel seek bar la no2ta mo3ayane a3mel action
        //exmple wake3e eno la mashe l seek bar la no2ta mo3yane nazel l vedio

        //keef fene 2a3ref eno wesel la hay no2ta besta3mel listner

        seekBar_continous.setOnSeekBarChangeListener(new android.widget.SeekBar.OnSeekBarChangeListener() {


            //iza mnla7ez heed seek bar bye5telef 3an l be2e elo 3 function
            //ya3ne bas tes7ab seek bar tmshe fe 3ana 3 function momken ya3mlo call

            //haw l 3 function be5lone et7akam b life cycle ta3et seek bar

            //kel haw l function byeb3tlk l seek bar bas yen3amloun call
            @Override
            public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
                //hayde btestad3a 2awal wa7de bas tet8ayar kemet l progresss

                //int progress:byeb3tlk adesh saret l progress b2alb seek bar,ya3ne la n2ol enta mshet bel seek bar la7ed ma sar 50% abl ma tshel edak 3an l mouse b sawene btle2e ba3tlak 50%

                Toast.makeText(getApplicationContext(), "the progress is"+progress, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
                //hayde btestad3a wa2t 2awl ma 2ed2ar no2ta ta3et l seek bar

                Toast.makeText(getBaseContext(), "Start", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
                //hayde btestad3a wa2t etrek de2ra ta3et seek bar 2awl ma etrek de2ra

                Toast.makeText(getBaseContext(), "Stop", Toast.LENGTH_SHORT).show();

            }
        });

    }
}