package com.seb.fomularioempleado;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.ib.custom.toast.CustomToastView;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText txtNombre;
    private EditText txtApellido;
    private EditText txtEdad;
    private EditText txtCargo;
    private EditText txtSalario;
    private EditText txtCorreo;
    private Button btnAgregar;
    private Button btnConsultar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtNombre= findViewById(R.id.txtNombre);
        txtApellido=findViewById(R.id.txtApellido);
        txtEdad=findViewById(R.id.txtEdad);
        txtCargo=findViewById(R.id.txtCargo);
        txtSalario=findViewById(R.id.txtSalario);
        txtCorreo=findViewById(R.id.txtCorreo);
        btnAgregar=findViewById(R.id.btnAgregar);
        btnConsultar=findViewById(R.id.btnConsultar);
        btnConsultar.setOnClickListener(this);
        btnAgregar.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnAgregar){
            String nombre = txtNombre.getText().toString();
            String apellido = txtApellido.getText().toString();
            //int edad = Integer.parseInt(txtEdad.getText().toString());
            String cargo = txtCargo.getText().toString();
            //int salario = Integer.parseInt(txtSalario.getText().toString());
            String email = txtCorreo.getText().toString();


            if (nombre.isEmpty()){
                CustomToastView.makeErrorToast(this, "Error al validar el Nombre", R.layout.custom_toast).show();
                return;
            }
            if (apellido.isEmpty()){
                CustomToastView.makeErrorToast(this, "Error al validar el Apellido", R.layout.custom_toast).show();
                return;
            }
            if (cargo.isEmpty()){
                CustomToastView.makeErrorToast(this, "Error al validar el Cargo", R.layout.custom_toast).show();
                return;
            }
            //if (salario < 1){
            //    CustomToastView.makeErrorToast(this, "Error al validar el Salario", R.layout.custom_toast).show();
            //    return;
            //}

            if (!isValidEmail(email)){
                CustomToastView.makeErrorToast(this, "Error al validar el Correo", R.layout.custom_toast).show();
                return;
            }

            //Intent myIntent = new Intent(this, CalculadoraImc.class);
            //myIntent.putExtra( "nameCalculator", name);
            //myIntent.putExtra("surnameCalculator", surname);
            //myIntent.putExtra("emailCalculator", email);
            //startActivity(myIntent);
        }
        if (v.getId() == R.id.btnConsultar){
            Intent consulta = new Intent(this, Consultar.class);
            startActivity(consulta);
        }

    }

    private  Boolean isValidEmail(String email){
        Pattern pattern = Patterns.EMAIL_ADDRESS;
        return  pattern.matcher(email).matches();
    }

}