package com.java.intermediario.wrapperselementosbasicos.test;

public class TesteAutoBoxing {
    public static void main(String[] args) {
        //autoboxing
        Short num1 = 1; // não chama o construtor da classe, faz a atribuição diretamente.
        Short num5 = 3;
        Long num2 = 20l; //  o que ocorre dentro da linguagem --> new Long(20l);
        //auto un-boxing
        short num13 = num1;//transforma objeto num1 em tipo primitivo short
        short num3 = num1.shortValue(); // o que ocorre por trás da linha acima
        // É possível incrementar valores do tipo Wrapper
        num1++; // autoboxing em expressões
        System.out.println(num1);//imprime 2
        //auto unboxing num13 --> autoboxing num13 / num 3 --> num6
        Integer num6 = num13 / num3;
        //Short num7 = num13 / num3; // gera erro porque a divisão de Short gera inteiro.
        //Mal uso de Wrapper
        Double a,b,c;
        a = 10.0;
        b = 5.0;
        c = 3.0;
        Double media = (a + b + c) / 3;
        System.out.println(media);
    }
}
