package com.java.intermediario.IO.test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/** Testa a classe FileWriter e FileReader*/
public class FileWriterReaderTest {
    public static void main(String[] args) {
        File file = new File("Arquivo.txt");
        String strNome = "Substring Substring";

        //Usando try-with-resources
        try(FileWriter fW = new FileWriter(file);
            FileReader fR = new FileReader(file)) {

            fW.write("Usando try-with-resources\n"+
                    "Nova linha");
            fW.flush();
            fW.close();

            char[] chArr = new char[500];

            int sizeCh = fR.read(chArr);

            System.out.println("Tamanho : " + sizeCh);

            for (char c : chArr) {
                if (c != '\u0000') // Evita espaços não ocupados
                    System.out.print(c);
            }
            fR.close(); // Sempre preciso fechar

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
