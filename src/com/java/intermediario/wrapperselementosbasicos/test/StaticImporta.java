package com.java.intermediario.wrapperselementosbasicos.test;
import static java.lang.Math.pow; // importa pacote para usar a função diretamente
//Esse tipo de import abaixo não é o mais elegante o mais apropriado é importar funções

public class StaticImporta {
    public static void main(String[] args) {
        double a = 2;
        double b = 3;
        double c = 4;
        //Todos os métodos da classe Math são estático, pois não é preciso instanciar a classe Math
        //para utilizá-los, não é preciso importar , pois ele faz parte do pacote java.lang
        System.out.println(Math.pow(2,3));
        System.out.println(pow(2,3)); // usa função diretamente
    }
}
