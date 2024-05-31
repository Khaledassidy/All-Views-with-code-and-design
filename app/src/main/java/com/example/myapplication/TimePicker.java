package com.example.myapplication;

import android.os.Build;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

public class TimePicker extends AppCompatActivity {
    android.widget.TimePicker timePicker;
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.time_picker);

         timePicker = findViewById(R.id.time_picker_program);


        //hala2 heed date picker l user bye5tar time le bado yeh

        //feek tet7akam fee mn houn coding masaln mtl heek

        //timePicker.setHour(4);//l hour adesh bekoun 2awl ma nefta7 l app
        //timePicker.setMinute(50);//l minutes adesh bekoun 2awl ma nefta7 l app
        timePicker.setHour(4);
        timePicker.setMinute(50);



        //keef badak ta3ref l user sho 7adad wa2t b este3ml listner 2aw badak bas y7aded l se3a ta3mel action b 2st3mel lisner


        //ya3ne wa2t l user y8ayer hour nafez l code w byeb3at ma3o 2 parameter bas y8ayer date
        timePicker.setOnTimeChangedListener(new android.widget.TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(android.widget.TimePicker view, int hourOfDay, int minute) {

                //ya3ne wa2t l user y8ayer time nafez l code w byeb3at ma3o 2 parameter bas y8ayer date

                //int hourOfDay:adesh l hour le 7ato l user
                //int minute:adesh l minute le 7atoun l user

                Toast.makeText(getBaseContext(), "hour "+hourOfDay+" minute "+minute, Toast.LENGTH_SHORT).show();

            }
        });


    }
}