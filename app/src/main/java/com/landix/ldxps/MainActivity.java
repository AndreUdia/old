package com.landix.ldxps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner_vendedores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Propriedades do Spinner para seleção dos vendedores em Home

        ArrayList<String> arr_vendedores = new ArrayList<String>();
        arr_vendedores.add("TODOS");
        arr_vendedores.add("vendedor1");
        arr_vendedores.add("vendedor2");
        arr_vendedores.add("vendedor3");

        ArrayAdapter<String> adapter_vendedores = new ArrayAdapter<String>(this,
                android.R. layout.simple_spinner_dropdown_item, arr_vendedores);

        spinner_vendedores = (Spinner) findViewById(R.id.home_spinner_ven);

        spinner_vendedores.setAdapter( adapter_vendedores );

        //spinner_vendedores.setOnItemClickListener();
    }
}
