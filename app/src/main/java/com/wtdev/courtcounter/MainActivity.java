package com.wtdev.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.wtdev.courtcounter.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        Button plus3A = findViewById(binding.btn3.getId());
        plus3A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ContadorA = (String) binding.lblCA.getText();
                int aumento = 3;
                Contadores contadores = new Contadores(aumento,ContadorA);
                String V = ""+contadores.Accion();
                binding.lblCA.setText(V);
            }
        });
        Button plus2A = findViewById(binding.btn2.getId());
        plus2A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ContadorA = (String) binding.lblCA.getText();
                int aumento = 2;
                Contadores contadores = new Contadores(aumento,ContadorA);
                String V = ""+contadores.Accion();
                binding.lblCA.setText(V);
            }
        });
        Button freeShotA = findViewById(binding.btnL.getId());
        freeShotA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ContadorA = (String) binding.lblCA.getText();
                int aumento = 1;
                Contadores contadores = new Contadores(aumento,ContadorA);
                String V = ""+contadores.Accion();
                binding.lblCA.setText(V);
            }
        });
        Button plus3B = findViewById(binding.btn3B.getId());
        plus3B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ContadorB = (String) binding.lblCB.getText();
                int aumento = 3;
                Contadores contadores = new Contadores(aumento,ContadorB);
                String V = ""+contadores.Accion();
                binding.lblCB.setText(V);
            }
        });
        Button plus2B = findViewById(binding.btn2B.getId());
        plus2B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ContadorB = (String) binding.lblCB.getText();
                int aumento = 2;
                Contadores contadores = new Contadores(aumento,ContadorB);
                String V = ""+contadores.Accion();
                binding.lblCB.setText(V);
            }
        });
        Button freeShotB = findViewById(binding.btnL2.getId());
        freeShotB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ContadorB = (String) binding.lblCB.getText();
                int aumento = 1;
                Contadores contadores = new Contadores(aumento,ContadorB);
                String V = ""+contadores.Accion();
                binding.lblCB.setText(V);
            }
        });
        Button reset = findViewById(binding.btnReset.getId());
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.lblCA.setText("0");
                binding.lblCB.setText("0");
            }
        });
    }
}