package com.java.intermediario.threads.test;

import com.java.intermediario.threads.classes.BateVolta;
import com.java.intermediario.threads.classes.ThreadBateVolta;

public class TesteBateVolta {
    public static void main(String[] args) {
        BateVolta batevolta = new BateVolta(); // classe com método compartilhado.
        ThreadBateVolta bate = new ThreadBateVolta("Bate",batevolta);
        ThreadBateVolta volta = new ThreadBateVolta("Volta", batevolta);
        // Faz duas threads serem executadas sincronizadamente
        // synchronized faz métodos compartilhados serem usados de forma sincronizada
        try{
            bate.t.join();
            volta.t.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Programa Encerrado");
    }
}
