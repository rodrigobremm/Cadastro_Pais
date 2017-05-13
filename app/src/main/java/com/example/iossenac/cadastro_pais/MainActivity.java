package com.example.iossenac.cadastro_pais;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<String> paises = new ArrayList<>();
    private ArrayAdapter<String> adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        paises.add("Argentina");
        paises.add("Brasil");
        paises.add("Uruguai");
        paises.add("Estados Unidos");

        adaptador = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,paises);

        ListView listView = (ListView) findViewById(R.id.listaPaises);
        listView.setAdapter(adaptador);
    }

public void cadastrarPais (View v) {
    EditText textoPais = (EditText) findViewById(R.id.textoPais);

    paises.add(textoPais.getText().toString());
    textoPais.setText("");


    adaptador.notifyDataSetChanged();

}

}