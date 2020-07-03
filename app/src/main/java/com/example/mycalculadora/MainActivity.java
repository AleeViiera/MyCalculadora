package com.example.mycalculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private String numero = "";
    private double num1 =0;
    private double num2 =0;
    private String symbol = "";

    private TextView solucion;
    private Button num_cero, num_uno, num_dos, num_tres, num_cuatro, num_cinco, num_seis, num_siete, num_ocho, num_nueve;
    private Button suma, resta, mult, div, igual, borrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        solucion = findViewById(R.id.solucion);

        num_cero = findViewById(R.id.num_cero);
        num_uno = findViewById(R.id.num_uno);
        num_dos = findViewById(R.id.num_dos);
        num_tres = findViewById(R.id.num_tres);
        num_cuatro = findViewById(R.id.num_cuatro);
        num_cinco = findViewById(R.id.num_cinco);
        num_seis = findViewById(R.id.num_seis);
        num_siete = findViewById(R.id.num_siete);
        num_ocho = findViewById(R.id.num_ocho);
        num_nueve = findViewById(R.id.num_nueve);

        suma = findViewById(R.id.suma);
        resta = findViewById(R.id.resta);
        mult = findViewById(R.id.mult);
        div = findViewById(R.id.div);
        igual = findViewById(R.id.igual);
        borrar = findViewById(R.id.borrar);

        num_cero.setOnClickListener(this);
        num_uno.setOnClickListener(this);
        num_dos.setOnClickListener(this);
        num_tres.setOnClickListener(this);
        num_cuatro.setOnClickListener(this);
        num_cinco.setOnClickListener(this);
        num_seis.setOnClickListener(this);
        num_siete.setOnClickListener(this);
        num_ocho.setOnClickListener(this);
        num_nueve.setOnClickListener(this);

        suma.setOnClickListener(this);
        resta.setOnClickListener(this);
        mult.setOnClickListener(this);
        div.setOnClickListener(this);
        igual.setOnClickListener(this);
        borrar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch(v.getId()){
            case R.id.num_cero:
                numero = numero +"0";
                solucion.setText(numero);
                break;
            case R.id.num_uno:
                numero = numero +"1";
                solucion.setText(numero);
                break;
            case R.id.num_dos:
                numero = numero +"2";
                solucion.setText(numero);
                break;
            case R.id.num_tres:
                numero = numero +"3";
                solucion.setText(numero);
                break;
            case R.id.num_cuatro:
                numero = numero +"4";
                solucion.setText(numero);
                break;
            case R.id.num_cinco:
                numero = numero +"0";
                solucion.setText(numero);
                break;
            case R.id.num_seis:
                numero = numero +"6";
                solucion.setText(numero);
                break;
            case R.id.num_siete:
                numero = numero +"7";
                solucion.setText(numero);
                break;
            case R.id.num_ocho:
                numero = numero +"8";
                solucion.setText(numero);
                break;
            case R.id.num_nueve:
                numero = numero +"9";
                solucion.setText(numero);
                break;

            case R.id.suma:
                symbol = "+";
                num1 = Integer.parseInt(numero);
                numero = "";
                break;
            case R.id.resta:
                symbol = "-";
                num1 = Integer.parseInt(numero);
                numero = "";
                break;
            case R.id.div:
                symbol = "/";
                num1 = Integer.parseInt(numero);
                numero = "";
                break;
            case R.id.mult:
                symbol = "X";
                num1 = Integer.parseInt(numero);
                numero = "";
                break;


            case R.id.igual:
                num2 = Integer.parseInt(numero);

                switch (symbol){
                    case "-":
                        solucion.setText("solucion" + (num1 - num2));
                        break;
                    case "+":
                        solucion.setText("solucion" + (num1 + num2));
                        break;
                    case "/":
                        solucion.setText("solucion" + (num1 / num2));
                        break;
                    case "X":
                        solucion.setText("solucion" + (num1 * num2));
                        break;

                }
                numero = "";
                num1 = 0;
                num2 = 0;

                break;

            case R.id.borrar:
                symbol = "";
                numero = "";
                num1 = 0;
                num2 = 0;
                solucion.setText("0");
                break;

        }

    }
}
