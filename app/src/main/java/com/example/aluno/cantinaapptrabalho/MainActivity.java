package com.example.aluno.cantinaapptrabalho;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.orm.SchemaGenerator;
import com.orm.SugarContext;
import com.orm.SugarDb;

public class MainActivity extends AppCompatActivity {

    Button vendaButton;
    Button prodButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //SugarContext.init(getApplicationContext());
        //SchemaGenerator schemaGenerator = new SchemaGenerator(this);
        //schemaGenerator.createDatabase(new SugarDb(this).getDB());

        vendaButton = (Button) findViewById(R.id.vendaButton);
        prodButton = (Button) findViewById(R.id.prodButton);
        vendaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ProdutoActivity.class));
            }
        });
        prodButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ListProdActivity.class));
            }
        });
    }
}
