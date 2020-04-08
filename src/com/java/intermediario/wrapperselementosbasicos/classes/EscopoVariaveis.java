package com.java.intermediario.wrapperselementosbasicos.classes;

public class EscopoVariaveis {
    private int valor;

    public int getValor() {
        return valor;
    }
    //A cor do Intellij indica que o atributo da classe está sendo modificado
    public void setValor(int valor) {
        this.valor = valor;
    }
    // A cor do IntelliJ indica que o parâmetro está sendo modificado
    public int calculaValor(int valor) {
        valor = valor + 10;
        return valor;
    }

    public int teste(){
        int valor = 5;
        if(true){
            valor--;
        }
        return valor;
    }
}
