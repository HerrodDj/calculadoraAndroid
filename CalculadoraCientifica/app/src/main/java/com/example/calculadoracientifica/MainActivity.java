package com.example.calculadoracientifica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.calculadoracientifica.model.Calculadora;


public class MainActivity extends AppCompatActivity implements View.OnClickListener  {

    private Calculadora calculadora;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button0;

    private Button dividir;
    private Button multiplicar ;
    private Button suma ;
    private Button resta ;
    private Button raiz ;
    private Button porcentaje ;
    private Button sin;
    private Button cos;
    private Button tan;
    private Button csc;
    private Button sec;
    private Button cot;

    private Button potencia ;
    private  Button factorial;
    private Button igual;


    private Button del;
    private Button c;

    private TextView source;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculadora);
        source = findViewById(R.id.source);

        calculadora= new Calculadora();

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button0 = findViewById(R.id.button0);

        dividir = findViewById(R.id.dividir);
        multiplicar = findViewById(R.id.multiplicar);
        suma = findViewById(R.id.suma);
        resta = findViewById(R.id.resta);
        raiz = findViewById(R.id.raiz);
        porcentaje = findViewById(R.id.porcentaje);
        sin = findViewById(R.id.SIN);
        cos = findViewById(R.id.COS);
        tan = findViewById(R.id.TAN);
        csc = findViewById(R.id.CSC);
        sec = findViewById(R.id.SEC);
        cot = findViewById(R.id.COT);

        potencia = findViewById(R.id.potencia);
        factorial = findViewById(R.id.factorial);
        igual= findViewById(R.id.equal);

        c = findViewById(R.id.C);
        del = findViewById(R.id.DEL);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button0.setOnClickListener(this);
        dividir.setOnClickListener(this);
        multiplicar.setOnClickListener(this);
        suma.setOnClickListener(this);
        resta.setOnClickListener(this);
        raiz.setOnClickListener(this);
        porcentaje.setOnClickListener(this);
        sin.setOnClickListener(this);
        cos.setOnClickListener(this);
        tan.setOnClickListener(this);
        csc.setOnClickListener(this);
        sec.setOnClickListener(this);
        cot.setOnClickListener(this);
        factorial.setOnClickListener(this);
        potencia.setOnClickListener(this);
        igual.setOnClickListener(this);
        c.setOnClickListener(this);
        del.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        if(source.getText().toString().equals("0")){
            source.setText("");
        }
        switch (v.getId()) {
            case R.id.button1:
                Toast.makeText(this, "Button 1 clicked", Toast.LENGTH_SHORT).show();
                source.setText(source.getText().toString() + "1");
                break;
            case R.id.button2:
                Toast.makeText(this, "Button 2 clicked", Toast.LENGTH_SHORT).show();
                source.setText(source.getText().toString() + "2");
                break;
            case R.id.button3:
                Toast.makeText(this, "Button 3 clicked", Toast.LENGTH_SHORT).show();
                source.setText(source.getText().toString() + "3");
                break;
            case R.id.button4:
                Toast.makeText(this, "Button 4 clicked", Toast.LENGTH_SHORT).show();
                source.setText(source.getText().toString() + "4");
                break;
            case R.id.button5:
                Toast.makeText(this, "Button 5 clicked", Toast.LENGTH_SHORT).show();
                source.setText(source.getText().toString() + "5");
                break;
            case R.id.button6:
                Toast.makeText(this, "Button 6 clicked", Toast.LENGTH_SHORT).show();
                source.setText(source.getText().toString() + "6");
                break;
            case R.id.button7:
                Toast.makeText(this, "Button 7 clicked", Toast.LENGTH_SHORT).show();
                source.setText(source.getText().toString() + "7");
                break;
            case R.id.button8:
                Toast.makeText(this, "Button 8 clicked", Toast.LENGTH_SHORT).show();
                source.setText(source.getText().toString() + "8");
                break;
            case R.id.button9:
                Toast.makeText(this, "Button 9 clicked", Toast.LENGTH_SHORT).show();
                source.setText(source.getText().toString() + "9");
                break;
            case R.id.button0:
                Toast.makeText(this, "Button 0 clicked", Toast.LENGTH_SHORT).show();
                source.setText(source.getText().toString() + "0");
                break;
            case R.id.dividir:
                calculadora.setValue1(Double.parseDouble(source.getText().toString()));
                Toast.makeText(this, "Button / clicked", Toast.LENGTH_SHORT).show();
                source.setText("");
                calculadora.setOperacion("/");
                break;
            case R.id.multiplicar:
                calculadora.setValue1(Double.parseDouble(source.getText().toString()));
                Toast.makeText(this, "Button * clicked", Toast.LENGTH_SHORT).show();
                source.setText("");
                calculadora.setOperacion("*");
                break;
            case R.id.suma:
                calculadora.setValue1(Double.parseDouble(source.getText().toString()));
                Toast.makeText(this, "Button + clicked", Toast.LENGTH_SHORT).show();
                source.setText("");
                calculadora.setOperacion("+");
                break;
            case R.id.resta:
                calculadora.setValue1(Double.parseDouble(source.getText().toString()));
                Toast.makeText(this, "Button - clicked", Toast.LENGTH_SHORT).show();
                source.setText("");
                calculadora.setOperacion("-");
                break;
            case R.id.raiz:
                calculadora.setValue1(Double.parseDouble(source.getText().toString()));
                Toast.makeText(this, "Button raiz clicked", Toast.LENGTH_SHORT).show();
                calculadora.setOperacion("raiz");
                source.setText(String.valueOf(calculadora.calcular()));
                break;
            case R.id.porcentaje:
                calculadora.setValue1(Double.parseDouble(source.getText().toString()));
                Toast.makeText(this, "Button % clicked", Toast.LENGTH_SHORT).show();
                calculadora.setOperacion("%");
                source.setText("");
                break;
            case R.id.COS:
                calculadora.setValue1(Double.parseDouble(source.getText().toString()));
                Toast.makeText(this, "Button COS clicked", Toast.LENGTH_SHORT).show();
                source.setText(source.getText().toString() + "COS");
                calculadora.setOperacion("COS");
                source.setText(String.valueOf(calculadora.calcular()));
                break;
            case R.id.SIN:
                calculadora.setValue1(Double.parseDouble(source.getText().toString()));
                Toast.makeText(this, "Button SIN clicked", Toast.LENGTH_SHORT).show();
                source.setText(source.getText().toString() + "SIN");
                calculadora.setOperacion("SIN");
                source.setText(String.valueOf(calculadora.calcular()));
                break;
            case R.id.TAN:
                calculadora.setValue1(Double.parseDouble(source.getText().toString()));
                Toast.makeText(this, "Button TAN clicked", Toast.LENGTH_SHORT).show();
                source.setText(source.getText().toString() + "TAN(");
                calculadora.setOperacion("TAN");
                source.setText(String.valueOf(calculadora.calcular()));
                break;
            case R.id.CSC:
                calculadora.setValue1(Double.parseDouble(source.getText().toString()));
                Toast.makeText(this, "Button CSC clicked", Toast.LENGTH_SHORT).show();
                source.setText(source.getText().toString() + "CSC");
                calculadora.setOperacion("CSC");
                source.setText(String.valueOf(calculadora.calcular()));
                break;
            case R.id.SEC:
                calculadora.setValue1(Double.parseDouble(source.getText().toString()));
                Toast.makeText(this, "Button SEC clicked", Toast.LENGTH_SHORT).show();
                source.setText(source.getText().toString() + "SEC");
                calculadora.setOperacion("SEC");
                source.setText(String.valueOf(calculadora.calcular()));
                break;
            case R.id.COT:
                calculadora.setValue1(Double.parseDouble(source.getText().toString()));
                Toast.makeText(this, "Button COT clicked", Toast.LENGTH_SHORT).show();
                source.setText(source.getText().toString() + "COT");
                calculadora.setOperacion("COT");
                source.setText(String.valueOf(calculadora.calcular()));
                break;
            case R.id.DEL:
                Toast.makeText(this, "Button DEL clicked", Toast.LENGTH_SHORT).show();
                source.setText("0");
                calculadora.setOperacion("");
                calculadora.setValue1(0);
                calculadora.setValue2(0);
                break;
            case R.id.C:
                Toast.makeText(this, "Button C clicked", Toast.LENGTH_SHORT).show();
                source.setText("0");
                break;

            case R.id.equal:
                calculadora.setValue2(Double.parseDouble(source.getText().toString()));
                Toast.makeText(this, "Button = clicked", Toast.LENGTH_SHORT).show();
                source.setText(String.valueOf(calculadora.calcular()));
                break;

        }

    }








}
