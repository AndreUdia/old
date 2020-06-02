package com.landix.ldxps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class MainActivity extends AppCompatActivity {

    private Spinner spinnerVendedores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Propriedades do Spinner para seleção dos vendedores em Home

        List<Vendedor> arr_vendedores = new ArrayList<>();
        Vendedor um = new Vendedor("um", 1, transformarData("10/05/2010"));
        Vendedor dois = new Vendedor("dois", 2, transformarData("10/08/2000"));
        Vendedor tres = new Vendedor("tres", 3, transformarData("01/05/2003"));
        Vendedor quatro = new Vendedor("quatro", 4, transformarData("08/09/2001"));
        arr_vendedores.add(um);
        arr_vendedores.add(dois);
        arr_vendedores.add(tres);
        arr_vendedores.add(quatro);

        // Dados do adaptador para exibição de itens no Spinner
        ArrayAdapter<Vendedor> adapter_vendedores = new ArrayAdapter<>(this,
                android.R. layout.simple_spinner_item, arr_vendedores);
        adapter_vendedores.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinnerVendedores = findViewById(R.id.home_spinner_ven);

        spinnerVendedores.setAdapter( adapter_vendedores );

        for (int i=0; i<arr_vendedores.size(); i++  ) {
            System.out.println(arr_vendedores.get(i).getCodigoVendedor());
        }

    }

    public void editarVendedor(View view) {
        Vendedor vendedorSelecionado = (Vendedor) spinnerVendedores.getSelectedItem();
        mostrarDadosVendedor(vendedorSelecionado);
    }

    private void mostrarDadosVendedor(Vendedor vendedor) {
        String nomeVendedor = vendedor.getNomeVendedor();
        UUID codigoVendedor = vendedor.getCodigoVendedor();
        Integer tabelaPrecosPadrao = vendedor.getTabelaPrecosPadrao();
        Date dataNascimentoVendedor = vendedor.getDataNascimentoVendedor();

        String dadosVendedor = "Nome: " + nomeVendedor
                                + "\nUUID: " + codigoVendedor
                                + "\nTabela: " + tabelaPrecosPadrao
                                + "\nDataNascimento: " + dataNascimentoVendedor;

        Toast.makeText(this, dadosVendedor, Toast.LENGTH_LONG).show();
    }

    private Date transformarData(String dataEmString) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date data = null;
        try {
            data = sdf.parse(dataEmString);
        } catch (ParseException e) {
            System.err.println("Erro ao transformar a data");
        }
        return  data;
    }
}
