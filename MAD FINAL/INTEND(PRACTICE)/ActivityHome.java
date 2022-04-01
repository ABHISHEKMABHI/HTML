package com.example.exampractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityHome extends AppCompatActivity {
    TextView txtemail;
    String Receivedkey1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        txtemail=findViewById(R.id.txtemail);
        Receivedkey1=getIntent().getStringExtra("key1");
        txtemail.setText(Receivedkey1);
    }
}