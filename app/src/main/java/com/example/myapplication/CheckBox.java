package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Toast;

public class CheckBox extends AppCompatActivity {

    android.widget.CheckBox swimming,fotball,basket;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.checkbox);

        //inflate
        swimming=findViewById(R.id.swimming);
        fotball=findViewById(R.id.fotball);
        basket=findViewById(R.id.basket);

        //feek bade 2a3ref eno l checkbox button mad8ot 3lee?
        //keef bade 2a3ref iza l 3onsour mad8ot 3lee
        //exmple swimming eza mad8ot 3lyha bsta3mel l ischecked function btred boolean is radet true ya3ne ma8dot 3lee iza false mano mad8ot 3lee
        //exmple:swimming.isChecked()


        //fa hala2 b7ot if kena makbos 3ala l swimming tale3 toast swimming,iza fotball tale3 toast fotball,iza basket tale3 toast basket
        /*if(swimming.isChecked()==true){
            Toast.makeText(this, "swimming", Toast.LENGTH_SHORT).show();
        } else if (fotball.isChecked()==true) {
            Toast.makeText(this,"fotball",Toast.LENGTH_SHORT).show();
        } else if (basket.isChecked()==true) {
            Toast.makeText(this,"basket",Toast.LENGTH_SHORT).show();

        }
        */




        //bas hala2 houn bas 3mlna check iza mad8ot 3ala hay l button wala la2 bas ana iza bade 2a3mel she action bas yenkabas 3lee
        //bade esta3mel listner

        //ya3ne bas okbous 3al swimming bas tet8yar 7alet l checked ya3ne is checked wala mana checked
        //ya3ne lama tet8yar 7alet l checked taba3 heed l 3onsour rou7 nafez l code heda ya3ne bas ta3mel checked 7a ynafez l code w bas tsheel l checked 7a ynafez l code
        //aye sha8le bada entezr la tnafez sha8le 3atoul sta3mel listener

        swimming.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                //boolean isChecked:heed l parameter byeb3tlk 7alet heed l 3onsour iza chcecked wala la2

                //fa hala2 bade ef7as is keen checked rou7 tba3 toast eno swimming checked iza la2 rou7 tba3 toust eno mano checked
                //bas 2awl ma efta7 l application ma yetba3 she hay l function btestad3a bas yseer fe ta8your bel checked

                if(isChecked==true){
                    Toast.makeText(getBaseContext(), "swimming checked", Toast.LENGTH_SHORT).show();

                }
                else{
                    Toast.makeText(getBaseContext(), "swimming notchecked", Toast.LENGTH_SHORT).show();

                }
            }
        });


        //lamda expression
        fotball.setOnCheckedChangeListener((v,w)->{
            if(w==true){
                Toast.makeText(getBaseContext(), "fotball checked", Toast.LENGTH_SHORT).show();

            }
            else{
                Toast.makeText(getBaseContext(), "fotball notchecked", Toast.LENGTH_SHORT).show();

            }
        });




    }
}