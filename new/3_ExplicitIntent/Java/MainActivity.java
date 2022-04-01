package com.example.explicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText Usr,Pss;
    Button log;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Usr=findViewById(R.id.user);
        Pss=findViewById(R.id.pass);
        log=(Button) findViewById(R.id.bttn);

        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Usr.getText().toString().equals("minal") && Pss.getText().toString().equals("murali"))
                {
                    Intent i=new Intent(MainActivity.this,home.class);
                    startActivity(i);
                }else
                {
                    Toast.makeText(MainActivity.this,"Invalid",Toast.LENGTH_LONG).show();
                }

            }
        });
    }

}