package com.example.actividadgithub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class Github_act extends AppCompatActivity {
    private Spinner spin;
    private TextView text1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_github_act);

        spin = (Spinner)findViewById(R.id.spin);
        text1 = (TextView)findViewById(R.id.tv);

        ArrayList<String> listaJuegos = (ArrayList<String>) getIntent().getSerializableExtra("listajuegos");

        ArrayAdapter<String> adapt = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,listaJuegos);
        spin.setAdapter(adapt);


    }
    public void Mostrar(View v){

        String opcion = spin.getSelectedItem().toString();

        if (opcion.equals("Overwatch")){
            text1.setText("El valor de Overwatch es: $7.990");
        }
        if (opcion.equals("Call of Duty 3")){
            text1.setText("El valor de Call of Duty 3 es: $2.990");
        }
        if(opcion.equals("League of Legends")){
            text1.setText("El valor de League of Legends es: $15.990");
        }
        if(opcion.equals("Total War Rome 2")){
            text1.setText("El valor de Total War Rome 2 es: $12.990");
        }
        if(opcion.equals("Rocket League")){
            text1.setText("El valor de Rocket League es: $5.990");
        }
    }
}