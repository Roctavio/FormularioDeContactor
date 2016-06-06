package com.octavio.ruber.formulariodecontactor;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

public class MainActivity extends AppCompatActivity {
    DatePicker dp;
    int dia, mes, ano;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextInputLayout tilNombre= (TextInputLayout) findViewById(R.id.tilNombre);
        final TextInputLayout txilTelefono=(TextInputLayout) findViewById(R.id.txilTelefono);
        final TextInputLayout txilEmail=(TextInputLayout) findViewById(R.id.txilEmail);
        final TextInputLayout txilDescripcion=(TextInputLayout) findViewById(R.id.txilDescripcion);
        dp = (DatePicker)findViewById(R.id.dp);

        Button boton =(Button)findViewById(R.id.btnSiguiente);
        boton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                dia=dp.getDayOfMonth();
                mes=dp.getMonth();
                ano=dp.getYear();
                Intent intent=new Intent(MainActivity.this,Activity_Confirmacion_Datos.class);
                intent.putExtra(getResources().getString(R.string.nombre_completo),tilNombre.getEditText().getText().toString());
                intent.putExtra(getResources().getString(R.string.telefono),txilTelefono.getEditText().getText().toString());
                intent.putExtra(getResources().getString(R.string.mail),txilEmail.getEditText().getText().toString());
                intent.putExtra(getResources().getString(R.string.descripcion),txilDescripcion.getEditText().getText().toString());
                intent.putExtra(getResources().getString(R.string.dia),dia);
                intent.putExtra(getResources().getString(R.string.mes),mes);
                intent.putExtra(getResources().getString(R.string.ano),ano);
                startActivity(intent);
            }

        });
    }
}
