package com.facci.restaurantgz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivityGZ extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_gz);
    }
    public void click1(View V){
        Toast.makeText(MainActivityGZ.this,"Bandeja de mariscos",Toast.LENGTH_SHORT).show();

    }
    public void click2(View V){
        Toast.makeText(MainActivityGZ.this,"Caldo de gallina",Toast.LENGTH_SHORT).show();

    }
    public void click3(View V){

        Toast.makeText(MainActivityGZ.this,"Ceviche de camaron",Toast.LENGTH_SHORT).show();
    }
    public void click4(View V){

        Toast.makeText(MainActivityGZ.this,"Corviche",Toast.LENGTH_SHORT).show();
    }
    public void click5(View V){
        Toast.makeText(MainActivityGZ.this,"Pescado frito",Toast.LENGTH_SHORT).show();

    }
    public void click6(View V){

        Toast.makeText(MainActivityGZ.this,"Salprienta",Toast.LENGTH_SHORT).show();
    }
    public void click7(View V){

        Toast.makeText(MainActivityGZ.this,"Arroz con mariscos",Toast.LENGTH_SHORT).show();
    }
}
