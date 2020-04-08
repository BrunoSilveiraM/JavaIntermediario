package com.java.intermediario.classesutilitarias.test;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigNumberDecimalTest {
    public static void main(String[] args) {
        double a = 0.03;
        double b = 0.04;
        double c = b - a;
        System.out.println(c); // resultado = 0.010000000000000002, não condizendo com o esperado

        BigDecimal _a = new BigDecimal("0.03"); // existe uma variedade de construtores
        BigDecimal _b = new BigDecimal("0.04");
        BigDecimal _c = _b.subtract(_a); // existem outros métodos com outras operações
        System.out.println(_c); // resultado = 0.01

        BigDecimal bd1 = new BigDecimal("1234567890.0987654321");
        BigDecimal bd2 = new BigDecimal("987654321.9876543210");
        System.out.println(bd1.add(bd2)); // resulta em um número grande e não ocorre a "volta"
        System.out.println(bd1.multiply(bd2));
        System.out.println(bd1.divide(new BigDecimal(2)));

        BigInteger bi = new BigInteger("100000000000");
        System.out.println(bi);

    }
}
