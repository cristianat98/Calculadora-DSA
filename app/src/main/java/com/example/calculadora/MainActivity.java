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

    //List<Double> numeros = new ArrayList<Double>();
    double num1, num2;
    String pantalla = "";
    TextView op, res;
    int i = 0;
    int operacion = 0;

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
        String numero = pantalla.substring(i, pantalla.length());
        if (i == 0)
            num1 = Double.parseDouble(numero);

        else{
            num2 = Double.parseDouble(numero);
            num1= num1+num2;
        }

        pantalla = pantalla + "+";
        op.setText(pantalla);
        i = pantalla.length();
        String pan = num1 +"";
        res.setText(pan);
        operacion = 1;
    }

    public void btresta (View v) {
        String numero = pantalla.substring(i, pantalla.length());
        if (i == 0)
            num1 = Double.parseDouble(numero);

        else {
            num2 = Double.parseDouble(numero);
            num1 = num1 - num2;
        }

        pantalla = pantalla + "-";
        op.setText(pantalla);
        i = pantalla.length();
        String pan = num1 + "";
        res.setText(pan);
        operacion = 2;
    }

    public void btmul (View v){
        String numero = pantalla.substring(i, pantalla.length());
        if (i == 0)
            num1 = Double.parseDouble(numero);

        else{
            num2 = Double.parseDouble(numero);
            num1= num1*num2;
        }

        pantalla = pantalla + "*";
        op.setText(pantalla);
        i = pantalla.length();
        String pan = num1 +"";
        res.setText(pan);
        operacion = 3;
    }

    public void btdiv (View v){
        String numero = pantalla.substring(i, pantalla.length());
        if (i == 0)
            num1 = Double.parseDouble(numero);

        else{
            num2 = Double.parseDouble(numero);
            num1= num1/num2;
        }

        pantalla = pantalla + "/";
        op.setText(pantalla);
        i = pantalla.length();
        String pan = num1 +"";
        res.setText(pan);
        operacion = 4;
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
        i = 0;
    }

    public void btd (View v){
        pantalla = pantalla.substring(0, pantalla.length()-1);
        op.setText(pantalla);
        res.setText("");
    }

    public void btigual (View v){
        String numero = pantalla.substring(i, pantalla.length());
        num2 = Double.parseDouble(numero);
        if (operacion ==1)
            num1= num1+num2;
        else if (operacion ==2)
            num1 = num1-num2;
        else if (operacion ==3)
            num1= num1+num2;
        else if (operacion==4)
            num1= num1/num2;

        operacion = 0;
        pantalla = pantalla + "=";
        op.setText(pantalla);
        i = pantalla.length();
        String pan = num1 +"";
        res.setText(pan);
        operacion = 0;
    }
}
