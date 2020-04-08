package com.java.intermediario.wrapperselementosbasicos.test;

import com.java.intermediario.wrapperselementosbasicos.classes.EscopoVariaveis;

public class EscopoVariaveisTeste {
    public static void main(String[] args) {
        EscopoVariaveis e1 = new EscopoVariaveis();
        e1.setValor(10);
        System.out.println(e1.getValor());//imprime 10
        System.out.println(e1.calculaValor(20)); // imprime 30
        System.out.println(e1.getValor());//continua 10
        System.out.println(e1.teste());//imprime 4
        System.out.println(e1.getValor());//continua 10
    }
}
