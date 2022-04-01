package com.example.multipleintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        Button btn3 = (Button)findViewById(R.id.btn3);
        Button nxt3 = (Button)findViewById(R.id.nxt3);
        Button prev2 = (Button)findViewById(R.id.pre2);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.netflix.com/"));
                startActivity(i);
            }
        });
        nxt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Activity3.this,MainActivity.class);
                startActivity(i);
            }
        });
        prev2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Activity3.this,Activity2.class);
                startActivity(i);
            }
        });
    }
}