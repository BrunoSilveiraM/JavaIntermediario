package com.java.intermediario.wrapperselementosbasicos.test;

public class ExemploVarargs {
    public static void main(String[] args) {
        System.out.println(soma(1,2,3));
    }
    static int soma (Integer ... vetor){
        int soma = 0;
        for(Integer vet : vetor){
            soma+=vet;
        }
        return soma;
    }
}
