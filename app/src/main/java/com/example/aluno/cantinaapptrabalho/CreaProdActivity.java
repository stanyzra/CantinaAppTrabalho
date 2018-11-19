package com.example.aluno.cantinaapptrabalho;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CreaProdActivity extends AppCompatActivity {

    private EditText nome;
    private EditText valor;
    private Button salvar;
    private Button lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crea_prod);

        nome = (EditText) findViewById(R.id.editNome);
        valor = (EditText) findViewById(R.id.editNome);
        salvar = (Button) findViewById(R.id.buttonSalvar);
        lista = (Button) findViewById(R.id.buttonListar);

        salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Produto p = new Produto();

                    p.setNome( nome.getText().toString() );

                    p.setValor( Double.parseDouble( valor.getText().toString() ) );

                    p.save();

                    Toast.makeText(CreaProdActivity.this, p.getNome() + " Concluido!", Toast.LENGTH_SHORT).show();

                    nome.setText("");
                    valor.setText("");

                    nome.requestFocus();
                } catch (Exception e){
                    Toast.makeText(CreaProdActivity.this, "Preencha corretamente!", Toast.LENGTH_SHORT).show();
                }
            }
        });
        lista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CreaProdActivity.this, ListProdActivity.class));
            }
        });
    }
}
