package com.example.saudacaota;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView tvSaudacao;
    Button btnRealizarSaudacao;

    EditText edtNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        tvSaudacao = (TextView) findViewById(R.id.lblSaudacao);
        //tvSaudacao.setText("Seja Bem-Vindo ao curso de PDM!");
        btnRealizarSaudacao = (Button) findViewById(R.id.cmdRealizarSaudacao);
        edtNome = (EditText) findViewById(R.id.txtNome);

        btnRealizarSaudacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome, saudacao;
                nome = edtNome.getText().toString();
                saudacao = nome + ", seja Bem-Vindo ao Curso de PDM!";
                tvSaudacao.setText(saudacao);
            }
        });



    }
}