package com.oscarcelis.spinnerapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtLenguajes;
    private Spinner spnLenguajes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtLenguajes = findViewById(R.id.txtLenguajeSeleccionado);
        spnLenguajes = findViewById(R.id.spnLenguajes);

        ArrayAdapter<CharSequence> adaptador = ArrayAdapter.
                createFromResource(this, R.array.lenguajes_favoritos,
                        android.R.layout.simple_spinner_item);

        spnLenguajes.setAdapter(adaptador);

        spnLenguajes.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                txtLenguajes.setText("Has elegido "+parent.
                        getItemAtPosition(position).toString() +
                        " como lenguaje de programación favorito");
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
