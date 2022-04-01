package com.example.multipleintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Button btn2 = (Button)findViewById(R.id.btn2);
        Button nxt2 = (Button)findViewById(R.id.nxt2);
        Button prev = (Button)findViewById(R.id.pre1);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.crazygames.com/"));
                startActivity(i);
            }
        });
        nxt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Activity2.this,Activity3.class);
                startActivity(i);
            }
        });
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Activity2.this,MainActivity.class);
                startActivity(i);
            }
        });
    }
}
