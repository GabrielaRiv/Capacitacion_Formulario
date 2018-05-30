package com.example.gabriela.Formulario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MostrarDatos extends AppCompatActivity {

    //Declaracion de elementos
    TextView mostrarNombre, mostrarApellido, mostrarCorreo, mostrarContra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_datos);

        //inicializacion de elementos
        mostrarNombre =(TextView) findViewById(R.id.mostrarNombre);
        mostrarApellido = (TextView) findViewById(R.id.mostrarApellido);
        mostrarCorreo = (TextView) findViewById(R.id.mostrarCorreo);
        mostrarContra = (TextView) findViewById(R.id.mostrarContra);

        //obteniendo el intent y los datos por medio del bundle
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        //validacion y obtencion de los datos
        if (extras != null){
            String name = extras.getString("nombre");
            mostrarNombre.setText(name);
            String lastname = extras.getString("apellido");
            mostrarApellido.setText(lastname);
            String correo = extras.getString("correo");
            mostrarCorreo.setText(correo);
            String contra = extras.getString("contra");
            mostrarContra.setText(contra);
        }
    }
}
