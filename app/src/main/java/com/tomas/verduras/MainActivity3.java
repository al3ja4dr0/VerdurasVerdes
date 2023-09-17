package com.tomas.verduras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


    }
    //Metodo del botton volver
    public void Volver(View view){
        Intent volver = new Intent(this, MainActivity2.class);
        startActivities(new Intent[]{volver});
    }

    //Metodo del IMGbutton Inicio
    public  void Inicio(View view){
        Intent inicio = new Intent(this, MainActivity.class);
        startActivities(new Intent[]{inicio});
    }
}