package com.java.intermediario.assertions.test;

public class AssertTest {
    public static void main(String[] args) {
        diasDaSemana(7);
    }

    private static void calculaSalario(double salario){
        // comumente utilizado na fase de desenvolvimento
        // indica que não está preparado para esse tipo de erro, elimina o if-else
        assert (salario > 0): "O salário não deve ser menor do que zero, valor do argumento salário : "+salario;
        // realiza cálculo
    }

    private static void diasDaSemana(int dia){
        switch (dia){
            case 1: break;
            case 2: break;
            case 3: break;
            case 4: break;
            case 5: break;
            case 6: break;
            case 7: break;
            default: assert false;
        }
    }
}
