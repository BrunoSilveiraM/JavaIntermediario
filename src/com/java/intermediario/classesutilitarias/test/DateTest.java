package com.java.intermediario.classesutilitarias.test;

import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        Date hoje = new Date();
        //Exibe a quantidade de milisegunde desde 1970
        System.out.println(hoje.getTime());
        System.out.println(hoje.getDate());
    }
}
