package com.example.aluno.cantinaapptrabalho;

import com.orm.SugarRecord;

/**
 * Created by aluno on 12/11/18.
 */


public class Produto extends SugarRecord{
    private String nome;
    private double valor;

    public Produto() {
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return  "nome='" + nome + '\'' +
                ", preço=" + valor;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
