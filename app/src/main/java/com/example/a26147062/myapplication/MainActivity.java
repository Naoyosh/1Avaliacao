package com.example.a26147062.myapplication;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText valor;
    private RadioGroup radioGroupo;
    private RadioButton porcento40;
    private RadioButton porcento45;
    private RadioButton porcento50;
    private Button calcular;
    private double aumento;
    double resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        valor = findViewById(R.id.idValor);
        radioGroupo = findViewById(R.id.idRadioGr);
        porcento40 = findViewById(R.id.idRadio1);
        porcento45 = findViewById(R.id.idRadio2);
        porcento50 = findViewById(R.id.idRadio3);

        calcular.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(getApplicationContext(),ResultadoSalario.class);

            resultado = Double.parseDouble(valor.getText().toString());

            if(porcento40.isChecked()){
                aumento = (40/100)*resultado;
                i.putExtra("valor","O salário a 40% é: "+(aumento+resultado));

            } else if(porcento45.isChecked()){
                aumento = (45/100)*resultado;
                i.putExtra("valor","O salário a 45% é: "+(aumento+resultado));

            }else if(porcento50.isChecked()){
                aumento = (50/100)*resultado;
                i.putExtra("valor","O salário a 50% é: "+(aumento+resultado));
            }
            startActivity(i);
            }
        });
    }}