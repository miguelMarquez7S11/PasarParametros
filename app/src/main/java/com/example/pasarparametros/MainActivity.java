package com.example.pasarparametros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = (EditText) findViewById(R.id.caja);
    }

    public void EnviarParametros(View v)
    {
        Intent pantalla = new Intent(this,pantalla2.class);
        pantalla.putExtra("pnombre", nombre.getText().toString());
        startActivity(pantalla);
        finish();
    }
}
