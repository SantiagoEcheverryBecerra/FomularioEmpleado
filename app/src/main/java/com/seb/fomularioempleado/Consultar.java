package com.seb.fomularioempleado;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Consultar extends AppCompatActivity implements View.OnClickListener {

    private Button btnEdad;
    private Button btnSalario;
    private Button btnSalarioGlobal;
    private Button btnSalarioCargo;
    private Button btnPersonasCargo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consultar);
        btnEdad = findViewById(R.id.btnEdad);
        btnSalario = findViewById(R.id.btnSalario);
        btnSalarioGlobal = findViewById(R.id.btnSalarioGlobal);
        btnSalarioCargo = findViewById(R.id.btnSalarioCargo);
        btnPersonasCargo = findViewById(R.id.btnPersonasCargo);

        btnEdad.setOnClickListener(this);
        btnSalario.setOnClickListener(this);
        btnSalarioGlobal.setOnClickListener(this);
        btnSalarioCargo.setOnClickListener(this);
        btnPersonasCargo.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnEdad) {

        }
        if (v.getId() == R.id.btnSalario) {

        }
        if (v.getId() == R.id.btnSalarioGlobal) {

        }
        if (v.getId() == R.id.btnSalarioCargo) {

        }
        if (v.getId() == R.id.btnPersonasCargo) {

        }
    }
}