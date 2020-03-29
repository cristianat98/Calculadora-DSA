package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

import java.util.*;

public class MainActivity extends AppCompatActivity {

    List<Double> numeros = new ArrayList<Double>();
    double resultado;
    String pantalla = "";
    TextView op, res;
    Button bt1;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        op = (TextView) findViewById(R.id.Operacion);
        res = (TextView) findViewById(R.id.Resultado);

    }

    public void bt0 (View v){
        pantalla = pantalla + "0";
        op.setText(pantalla);
    }

    public void bt1 (View v){
        pantalla = pantalla + "1";
        op.setText(pantalla);
    }

    public void bt2 (View v){
        pantalla = pantalla + "2";
        op.setText(pantalla);
    }

    public void bt3 (View v){
        pantalla = pantalla + "3";
        op.setText(pantalla);
    }

    public void bt4 (View v){
        pantalla = pantalla + "4";
        op.setText(pantalla);
    }

    public void bt5 (View v){
        pantalla = pantalla + "5";
        op.setText(pantalla);
    }

    public void bt6 (View v){
        pantalla = pantalla + "6";
        op.setText(pantalla);
    }

    public void bt7 (View v){
        pantalla = pantalla + "7";
        op.setText(pantalla);
    }

    public void bt8 (View v){
        pantalla = pantalla + "8";
        op.setText(pantalla);
    }

    public void bt9 (View v){
        pantalla = pantalla + "9";
        op.setText(pantalla);
    }

    public void btsuma (View v){
        pantalla = pantalla + "+";
        op.setText(pantalla);
    }

    public void btresta (View v){
        pantalla = pantalla + "-";
        op.setText(pantalla);
    }

    public void btmul (View v){
        pantalla = pantalla + "*";
        op.setText(pantalla);
    }

    public void btdiv (View v){
        pantalla = pantalla + "/";
        op.setText(pantalla);
    }

    public void btpar1 (View v){
        pantalla = pantalla + "(";
        op.setText(pantalla);
    }

    public void btpar2 (View v){
        pantalla = pantalla + ")";
        op.setText(pantalla);
    }

    public void btpun (View v){
        pantalla = pantalla + ".";
        op.setText(pantalla);
    }

    public void btcos (View v){
        pantalla = pantalla + "cos(";
        op.setText(pantalla);
    }

    public void btsen (View v){
        pantalla = pantalla + "sen(";
        op.setText(pantalla);
    }

    public void bttan (View v){
        pantalla = pantalla + "tan(";
        op.setText(pantalla);
    }

    public void btc (View v){
        pantalla = "";
        op.setText(pantalla);
    }

    public void btd (View v){
        String ultimo = pantalla.substring(pantalla.length()-1);
        pantalla = pantalla.replace(ultimo,"");
        op.setText(pantalla);
    }

    public void btigual (View v){
        pantalla = pantalla + "=";
        op.setText(pantalla);
    }
}
