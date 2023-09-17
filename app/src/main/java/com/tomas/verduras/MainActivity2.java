package com.tomas.verduras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private EditText n1;
    private EditText n2;

    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        this.n1 = findViewById(R.id.EdiTextn1);
        this.n2 = findViewById(R.id.EdiTextn2);
        this.resultado = findViewById(R.id.TextViewresultado);

    }
    //Metodo para el IMGButton anterior
    public  void Anterior(View view){
        Intent anterior = new Intent(this, MainActivity.class);
        startActivities(new Intent[]{anterior});
    }

    //Metodo del Button Limpiar


    //Metodo del Button calcular

    public  void  onClick(View view){
        if (view.getId() == R.id.BTNcalcular) {
            resultado.setText("" + calcular());
        }
    }

    public  double calcular(){
        double resultado = Double.parseDouble(this.n1.getText().toString().trim()) * Double.parseDouble(this.n2.getText().toString().trim());

        return resultado;
    }
    public  void Calcular(View view){
        Intent calcular = new Intent(this, MainActivity3.class);
        startActivities(new Intent[]{calcular});

    }
}