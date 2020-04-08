package com.java.intermediario.threads.classes;

public class MinhaThreadSoma implements Runnable{
    private String nome;
    private double[] nums;
    /*
    Static torna a classe compartilhada entre duas ou mais threads, assim duas ou mais threads podem acessar a mesma
    instância da classe que é onde pode ocorrer o problema do método ou recurso não está sincronizado.
    Todas as instâncias de MinhaThreadSoma compartilham a Calculadora, então é um recurso compartilhado.
     */
    private static Calculadora calc = new Calculadora();

    public MinhaThreadSoma(String nome, double ... nums){
        this.nome = nome;
        this.nums = nums;
        new Thread(this,nome).start();
    }

    @Override
    public void run() {
        System.out.println(this.nome + " iniciada ");
        double soma = calc.somaArray(this.nums);
        System.out.println("Resultado da soma da thread "+this.nome+" = "+soma);
        System.out.println(this.nome + " terminada ");
    }
}
