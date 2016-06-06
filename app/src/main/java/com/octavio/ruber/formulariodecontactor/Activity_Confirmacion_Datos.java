package com.octavio.ruber.formulariodecontactor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity_Confirmacion_Datos extends AppCompatActivity {
    int dia, mes, ano;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity__confirmacion__datos);

        Bundle parametro1=getIntent().getExtras();
        String nombre=parametro1.getString(getResources().getString(R.string.nombre_completo)); //nombre
        final TextView tvNombre=(TextView)findViewById(R.id.tvNombre);
        tvNombre.setText(nombre);

        int dia=parametro1.getInt(getResources().getString(R.string.dia));
        int mes=parametro1.getInt(getResources().getString(R.string.mes));
        int ano=parametro1.getInt(getResources().getString(R.string.ano));
        TextView tvFecha=(TextView)findViewById(R.id.tvFecha);
        tvFecha.setText("Fecha de Nacimiento:"+" "+dia+"/"+mes+"/"+ano);

        String telefono=parametro1.getString(getResources().getString(R.string.telefono));//telefono
        TextView tvTelefono=(TextView)findViewById(R.id.tvTelefono);
        tvTelefono.setText("Tel: "+" "+telefono);

        String mail=parametro1.getString(getResources().getString(R.string.mail));//email;
        TextView tvEmail=(TextView)findViewById(R.id.tvEmail);
        tvEmail.setText("Email: "+mail);

        String descripcion =parametro1.getString(getResources().getString(R.string.descripcion));//descripcion
        TextView tvDescripcion=(TextView)findViewById(R.id.tvDescripcion);
        tvDescripcion.setText("Descripcionm: "+descripcion);

        Button boton2=(Button)findViewById(R.id.btEditar);
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        }
        );


    }
}
