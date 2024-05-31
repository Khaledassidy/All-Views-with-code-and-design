package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class NumberPicker extends AppCompatActivity {

    android.widget.NumberPicker numberPicker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.numberpicker);
        numberPicker=findViewById(R.id.numberpicker);

        //keef bet3mela ma3o by coding
        numberPicker.setMaxValue(100);//heek 3atyto 2a3la ra2m b lista ya3ne enta masaln 3am ta3mel wa7de ta3et l age fa 7addt eno 2a3la age lal user momken ykoun 100
        numberPicker.setMinValue(10);//w 2awt value b lista 10 2awta 3omr ykoun 10
        //fa heek sar masmo7le yemshe mn 10 la 100


        //tyeb keef bade 2a3ref ra2m le 5taro l user mn 5elele l listener
        //fe no3 tene mn listener bt5lene 2a3ref wa2t l user ya3mel scroll eno l user tele3 2aw nezel l state ta3eto  numberPicker.setOnScrollListener


        //bhyde listner wa2t y8ayer l value 7a ta3mel call w yeb3tlk ma3a 3 parameter
        numberPicker.setOnValueChangedListener(new android.widget.NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(android.widget.NumberPicker picker, int oldVal, int newVal) {
                //wa2t t8ayer l value ta3et number picker 7a yeb3at 3 parameter ma3oun
                //NumberPicker picker:number picker b7at zeto
                //int oldVal:l old value le keen ma7tot
                // int newVal:l new value le na2a l user

                Toast.makeText(getBaseContext(), "old vlaue:"+oldVal+" new vlaue "+newVal, Toast.LENGTH_SHORT).show();
            }
        });



    }
}