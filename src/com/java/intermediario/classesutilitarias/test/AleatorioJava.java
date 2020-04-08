package com.java.intermediario.classesutilitarias.test;

import java.util.Random;

public class AleatorioJava {
    public static void main(String[] args) {
        // esse método funciona muito bem para números como 10,100,1000...
        System.out.println(Math.random()); // gera número aleatório
        System.out.println(Math.floor(Math.random() * 10)); // número aleatório de 0 a 10, floor arredonda
        // para números como por exemplo 1 a 5 é melhor utilizar a classe Random
        Random aleatorio = new Random();
        /*
        obtem um número aleatório que é inteiro, existe para vários tipos e diferentes métodos com diferentes
        propóstiso
         */
        System.out.println(aleatorio.nextInt()); // gera o que o inteiro pode guardar
        System.out.println(aleatorio.nextInt(100)); // gera de 0 a 99
        System.out.println(aleatorio.nextInt(5 + 1)); // inclui o 5
    }
}
