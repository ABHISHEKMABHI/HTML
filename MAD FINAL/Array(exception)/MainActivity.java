package com.example.arrayexception;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        list=findViewById(R.id.listvw);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try{
            String[] her={"abhi","aswin","rojin"};
            ArrayAdapter adap=new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,her);
            list.setAdapter(adap);
        }
        catch(Exception e){
            Toast.makeText(this,e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
}