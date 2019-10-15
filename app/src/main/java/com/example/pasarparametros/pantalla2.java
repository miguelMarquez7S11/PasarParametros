package com.example.pasarparametros;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class pantalla2 extends AppCompatActivity {

    TextView nombre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);

        Bundle parametro = getIntent().getExtras();
        nombre = (TextView) findViewById(R.id.txtSaludo);
        nombre.setText("Binvenido sea usted: " + parametro.getString("pnombre"));
    }
}
