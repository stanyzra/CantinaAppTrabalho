package com.example.aluno.cantinaapptrabalho;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class ListProdActivity extends AppCompatActivity {

    private TextView textProdutos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_prod);

        List<Produto> produtos = Produto.listAll(Produto.class);
        ListView listaProdutos = (ListView) findViewById(R.id.listProdutos);

        String texto = "";

         ArrayAdapter<Produto> adapter = new ArrayAdapter<Produto>(this, android.R.layout.simple_list_item_1, produtos);

            listaProdutos.setAdapter(adapter);



        //textProdutos.setText(texto);
    }
}