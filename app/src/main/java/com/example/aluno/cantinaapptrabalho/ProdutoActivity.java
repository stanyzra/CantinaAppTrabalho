package com.example.aluno.cantinaapptrabalho;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class ProdutoActivity extends AppCompatActivity {
    Button p1,p2,p3,p4,p5,p6,p7,p8,p9, button_troco, button_reset;
    TextView listP, text_price, text_troco;
    EditText edit_troco;

    private Double [] value = new Double[10]; //quantidade de botoes
    private double final_price = 0, troco = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produto);
        listP= (TextView) findViewById(R.id.listP);
        text_price = (TextView) findViewById(R.id.text_price);
        text_troco = (TextView) findViewById(R.id.text_troco);
        edit_troco = (EditText) findViewById(R.id.edit_troco);
        button_troco = (Button) findViewById(R.id.button_troco);
        button_reset = (Button) findViewById(R.id.button_reset);
        p1 = (Button) findViewById(R.id.p1);
        p2 = (Button) findViewById(R.id.p2);
        p3 = (Button) findViewById(R.id.p3);
        p4 = (Button) findViewById(R.id.p4);
        p5 = (Button) findViewById(R.id.p5);
        p6 = (Button) findViewById(R.id.p6);
        p7 = (Button) findViewById(R.id.p7);
        p8 = (Button) findViewById(R.id.p8);
        p9 = (Button) findViewById(R.id.p9);

        value[1]=5.00;
        p1.setText("COMBO SALG + REFRI"+" - R$ "+String.format("%.2f", value[1]).replace('.', ','));
        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final_price+=value[1];
                text_price.setText(String.format("R$ %.2f", final_price).replace('.', ','));
                listP.setText(listP.getText()+""+p1.getText()+"\n");
            }
        });

        value[2]=3.80;
        p2.setText("Salgado"+" - R$ "+String.format("%.2f", value[2]).replace('.', ','));
        p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final_price+=value[2];
                text_price.setText(String.format("R$ %.2f", final_price).replace('.', ','));
                listP.setText(listP.getText()+""+p2.getText()+"\n");
            }
        });

        value[3]=1.50;
        p3.setText("Refrigerante"+" - R$ "+String.format("%.2f", value[3]).replace('.', ','));
        p3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final_price+=value[3];
                text_price.setText(String.format("R$ %.2f", final_price).replace('.', ','));
                listP.setText(listP.getText()+""+p3.getText()+"\n");
            }
        });

        value[4]=2.00;
        p4.setText("Bolo"+" - R$ "+String.format("%.2f", value[4]).replace('.', ','));
        p4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final_price+=value[4];
                text_price.setText(String.format("R$ %.2f", final_price).replace('.', ','));
                listP.setText(listP.getText()+""+p4.getText()+"\n");
            }
        });

        value[5]=1.00;
        p5.setText("Café"+" - R$ "+String.format("%.2f", value[5]).replace('.', ','));
        p5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final_price+=value[5];
                text_price.setText(String.format("R$ %.2f", final_price).replace('.', ','));
                listP.setText(listP.getText()+""+p5.getText()+"\n");
            }
        });

        value[6]=0.75;
        p6.setText("Paçoca"+" - R$ "+String.format("%.2f", value[6]).replace('.', ','));
        p6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final_price+=value[6];
                text_price.setText(String.format("R$ %.2f", final_price).replace('.', ','));
                listP.setText(listP.getText()+""+p6.getText()+"\n");
            }
        });

        value[7]=2.50;
        p7.setText("Cappuccino"+" - R$ "+String.format("%.2f", value[7]).replace('.', ','));
        p7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final_price+=value[7];
                text_price.setText(String.format("R$ %.2f", final_price).replace('.', ','));
                listP.setText(listP.getText()+""+p7.getText()+"\n");
            }
        });

        value[8]=1.00;
        p8.setText("Brigadeiro"+" - R$ "+String.format("%.2f", value[8]).replace('.', ','));
        p8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final_price+=value[8];
                text_price.setText(String.format("R$ %.2f", final_price).replace('.', ','));
                listP.setText(listP.getText()+""+p8.getText()+"\n");
            }
        });

        value[9]=1.00;
        p9.setText("Lanche Natural"+" - R$ "+String.format("%.2f", value[9]).replace('.', ','));
        p9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final_price+=value[9];
                text_price.setText(String.format("R$ %.2f", final_price).replace('.', ','));
                listP.setText(listP.getText()+""+p9.getText()+"\n");
            }
        });

        button_troco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edit_troco.getText().toString().matches("")) {
                    text_troco.setText("Insira o valor");
                }else{
                    Double troco = Double.parseDouble(edit_troco.getText().toString())-final_price;
                    text_troco.setText(String.format("R$ %.2f", troco).replace('.', ','));
                }
            }
        });

        button_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final_price=0;
                listP.setText("");
                text_price.setText("");
                text_troco.setText("");
                edit_troco.setText("");
            }
        });
    }

}
