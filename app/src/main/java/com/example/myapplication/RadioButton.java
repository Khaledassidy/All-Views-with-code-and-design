package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Toast;

public class RadioButton extends AppCompatActivity {
//bt3ref bas radio button bas ma b3aref l radio group houn

    android.widget.RadioButton pizza,humbereger,sandwish;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.radiobutton);
        //inflate of radio button
        pizza=findViewById(R.id.pizza);
        humbereger=findViewById(R.id.humbereger);
        sandwish=findViewById(R.id.sandwish);


        //feek bade 2a3ref eno l radio button mad8ot 3lee?
        //keef bade 2a3ref iza l 3onsour mad8ot 3lee
        //exmple pizza eza mad8ot 3lyha bsta3mel l ischecked function btred boolean is radet true ya3ne ma8dot 3lee iza false mano mad8ot 3lee
        //exmple:pizza.isChecked()


        //fa hala2 b7ot if kena makbosen 3ala l pizza tale3 toast pizza,iza humbereger tale3 toast humbereger,iza sandwish tale3 toast sandwish
        /*if(pizza.isChecked()==true){
            Toast.makeText(this, "pizza", Toast.LENGTH_SHORT).show();
        } else if (humbereger.isChecked()==true) {
            Toast.makeText(this,"humberger",Toast.LENGTH_SHORT).show();
        } else if (sandwish.isChecked()==true) {
            Toast.makeText(this,"sandwish",Toast.LENGTH_SHORT).show();

        }
        */

        //bas hala2 houn bas 3mlna check iza mad8ot 3ala hay l button wala la2 bas ana iza bade 2a3mel she action bas yenkabas 3lee
        //bade esta3mel listner

        //ya3ne bas okbous 3al pizza bas tet8yar 7alet l checked ya3ne is checked wala mana checked
        //ya3ne lama tet8yar 7alet l checked taba3 heed l 3onsour rou7 nafez l code heda ya3ne bas ta3mel checked 7a ynafez l code w bas tsheel l checked 7a ynafez l code
        //aye sha8le bada entezr la tnafez sha8le 3atoul sta3mel listener

        pizza.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                //boolean isChecked:heed l parameter byeb3tlk 7alet heed l 3onsour iza chcecked wala la2

                //fa hala2 bade ef7as is keen checked rou7 tba3 toast eno pizza checked iza la2 rou7 tba3 toust eno mano checked
                //bas 2awl ma efta7 l application ma yetba3 she hay l function btestad3a bas yseer fe ta8your bel checked
                if(isChecked==true){
                    Toast.makeText(getBaseContext(), "pizza checked", Toast.LENGTH_SHORT).show();

                }
                else{
                    Toast.makeText(getBaseContext(), "pizza notchecked", Toast.LENGTH_SHORT).show();

                }
            }


        });

        //lamda expression
        humbereger.setOnCheckedChangeListener((v,w)->{
            if(w==true){
                Toast.makeText(getBaseContext(), "humberger checked", Toast.LENGTH_SHORT).show();

            }
            else{
                Toast.makeText(getBaseContext(), "humberger notchecked", Toast.LENGTH_SHORT).show();

            }
        });

    }
}