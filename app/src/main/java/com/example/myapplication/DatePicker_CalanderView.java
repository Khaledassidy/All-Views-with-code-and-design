package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.Toast;

public class DatePicker_CalanderView extends AppCompatActivity {

    DatePicker datePicker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.datepicker_calanderview);
        datePicker=findViewById(R.id.datepicker);

        //hala2 heed date picker l user bye5tar date le bado yeh

        //feek tet7akam fee mn houn coding masaln mtl heek

        //datePicker.setMaxDate();//akabr date t7ot b2albo adesh
        //datePicker.setMinDate();//as8ar date t7ot b2albo adesh
        //bel calander view feek t7ot date le badak 2awl ma yefta7 l app ykoun ne7na mnesta3ml l calander a7san




        //keef badak ta3ref l user sho 7adad b este3ml listner 2aw badak bas y7aded date ta3mel action b 2st3mel lisner

        //ya3ne wa2t l user y8ayer date nafez l code w byeb3at ma3o 4 parameter bas y8ayer date
         datePicker.setOnDateChangedListener(new DatePicker.OnDateChangedListener() {
             @Override
             public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                 //ya3ne wa2t l user y8ayer date nafez l code w byeb3at ma3o 4 parameter bas y8ayer date
                 //wa2t yseer fe ta8yerr bya3mel call lal function w byeb3talk hawde l 4
                 //int year:byeb3talk l year l user le na2ee
                // int monthOfYear:byeb3talk l month l user le na2ee
                 // int dayOfMonth:byeb3talk l day l user le na2ee

                 Toast.makeText(getBaseContext(), "year: "+year+" month: "+(monthOfYear+1)+" day: "+dayOfMonth, Toast.LENGTH_SHORT).show();
                 //bas l meshkle eno l sysyem b3oud shahr mn 0 ya3ne iza kenet 3ala shahr 9 7a yeetb3lk shahr 8 l2no be3oud mn 0 fa la t7ola 3ade 7ot (monthOfYear+1)
             }
         });

        //date picker 2aw l calander befdhne maslan bade 2a3ml program eno bas tekbous 3al date m3ayan bjebalk kel l courses le byen3ato bheed date fa enta btrou7 btjeboun mn database
    }
}