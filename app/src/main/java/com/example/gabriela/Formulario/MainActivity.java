package com.example.gabriela.Formulario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //Declaracion de elementos
    EditText nombre, apellido, email, contraseña;
    Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //inicializando elementos
        nombre = (EditText) findViewById(R.id.nombre);
        apellido =  (EditText)findViewById(R.id.apellido);
        email = (EditText) findViewById(R.id.email);
        contraseña = (EditText) findViewById(R.id.contraseña);
        boton = (Button) findViewById(R.id.boton);
    }
    //metodo para enviar datos por medio del boton
    public void sendFeedback(View v){
        //declaracion de variables
        String name = nombre.getText().toString();
        String lastname = apellido.getText().toString();
        String correo = email.getText().toString();
        String contra = contraseña.getText().toString();
        //creacion del intent
        Intent intent = new Intent(MainActivity.this, MostrarDatos.class);
        //envio de datos
        intent.putExtra("nombre", name);
        intent.putExtra("apellido", lastname);
        intent.putExtra("correo", correo);
        intent.putExtra("contra", contra);
        startActivity(intent);
    }
}