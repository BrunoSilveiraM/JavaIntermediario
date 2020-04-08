package com.java.intermediario.enums.classes;

public enum DiaSemana {
    // valores possíveis que o atributo tipos da semana podem ter
    // esses valores são passados dentro de Enum, então o construtor já é chamado na definição do enum
    // por isso não é usado new com Enum
    SEGUNDA(1),TERCA(2),QUARTA(3),QUINTA(4),SEXTA(5),SABADO(6),
    DOMINGO(7);

    private int valor; // atributo
    // Para enumerador o modificador de acesso é o padrão
    DiaSemana(int valor){ // construtor
        this.valor = valor;
    }

    public int getValor() { // método
        return valor;
    }
}
