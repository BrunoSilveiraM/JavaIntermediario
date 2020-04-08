package com.java.intermediario.enums.test;

import com.java.intermediario.enums.classes.Operacoes;

public class TestCalculadora {
    public static void main(String[] args) {
        double x = 2, y = 5;
        for(Operacoes op : Operacoes.values()){
            System.out.println(x+op.toString()+y+" = "+op.executarOperacao(x,y));
        }
    }
}
