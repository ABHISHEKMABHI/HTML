package com.example.exampractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText email,password;
    Button Button;
    String email2,password2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email=findViewById(R.id.email);
        password=findViewById(R.id.password);
        Button=findViewById(R.id.button);
        Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this, "saved sucessfully", Toast.LENGTH_SHORT).show();
                email2=email.getText().toString();
                password2=password.getText().toString();
                SharedPreferences pref=getSharedPreferences("exampractice", Context.MODE_PRIVATE);
                SharedPreferences.Editor myedit= pref.edit();

                myedit.putString("email",email2);
                myedit.apply();

                //read from shared preference

            //    pref.getString("email",null);







               if(email2.equals("abhi@gmail.com")&&password2.equals("admin@12")){
                   Intent i=new Intent(MainActivity.this,ActivityHome.class);
                   i.putExtra("key1",email2);
                   startActivity(i);
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Login failed", Toast.LENGTH_SHORT).show();
                }
            }







        });

    }
}