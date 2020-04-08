package com.java.intermediario.expressoesregulares.test;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ScannerTest {
    public static void main(String[] args) {
        //Por padrão scanner tem como delimitador o espaço
        Scanner scanner = new Scanner("Usr1 Usr3 Usr4");
        // scanner.useDelimiter() Altera delimitador padrão

        /*
        Verifica se existe uma próxima posição através do delimitador
         */
        while(scanner.hasNext()){ // hasNext não muda o índice
            System.out.println(scanner.next()); // scanner.next muda o índice
        }

        Scanner scanner2 = new Scanner("ABCDE2 12364 true BCAOIWUIW 569897 AOOJOSAI 847984 false");

        while(scanner2.hasNext()) {
            if(scanner2.hasNextInt()){
                int n = scanner2.nextInt();
                System.out.println("int : "+ n);
            }
            else if(scanner2.hasNextBoolean()){
                boolean bool = scanner2.nextBoolean();
                System.out.println("boolean : " + bool);
            } else {
                System.out.println("string : " + scanner2.next());
            }
        }
    }
}
