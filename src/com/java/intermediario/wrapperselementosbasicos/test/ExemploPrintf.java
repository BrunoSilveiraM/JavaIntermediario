package com.java.intermediario.wrapperselementosbasicos.test;

public class ExemploPrintf {
    public static void main(String[] args) {
        int valor = 325987;
        //Separa por vírgula
        System.out.printf("%,d", valor);
        System.out.println();
        int valor2 = -322698;
        System.out.printf("%d",valor2);
        System.out.println();
        double valor3 = 50.315;
        System.out.printf("%10.2f",valor3); // imprime com arredondando para para 50,32
        System.out.println();
        System.out.printf("%.4f", valor3); // arredonda com 4 casas decimais
    }
}
