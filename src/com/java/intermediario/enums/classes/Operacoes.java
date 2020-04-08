package com.java.intermediario.enums.classes;

public enum Operacoes {
    SOMA('+'){
        @Override
        public double executarOperacao(double x, double y) {
            return x + y;
        }
    }, SUBTRAI('-'){
        @Override
        public double executarOperacao(double x, double y) {
            return x - y;
        }
    }, MULTIPLICA('*'){
        @Override
        public double executarOperacao(double x, double y) {
            return x * y;
        }
    }, DIVIDE('/'){
        @Override
        public double executarOperacao(double x, double y) {
            return x / y;
        }
    };

    private char simbolo;

    Operacoes(char simbolo){
        this.simbolo = simbolo;
    }

    public String toString(){
        return ""+this.simbolo;
    }

    public abstract double executarOperacao(double x, double y);
}
