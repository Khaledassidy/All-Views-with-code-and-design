package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;


public class List_View extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);
        listView=findViewById(R.id.listview);

        //iza bade bas ekbous 3ala wa7de mn data 2a3ref esma lal kabst 2aw l postion
        //postion howe l 7asab keef 3abytoun bl string ya3ne 2awl wa7de lebanon postion 0
        //bas ne7na ma badna n3abe heek n3bae btare2a tenye
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), ""+position, Toast.LENGTH_SHORT).show();
            }
        });
    }
}