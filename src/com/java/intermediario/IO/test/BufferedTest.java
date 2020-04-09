package com.java.intermediario.IO.test;

import java.io.*;

/**
 * Usa as classes BufferedReader
 */
public class BufferedTest {
    public static void main(String[] args) {
        File file = new File("text.txt");
        /* Inicializa Buffered's com a criação de Writrer's
           no construtor */
        try(BufferedWriter bW = new BufferedWriter(new FileWriter(file));
            BufferedReader bR = new BufferedReader(new FileReader(file))){

            bW.write("Usando BufferedReader");
            /* Encontra caractere especial do Sistema
               Operacional que pula a linha. */
            bW.newLine();
            bW.write("Nova Linha!!!");
            bW.flush();
            bW.close();

            String str = null;

            /*
            Método readLine ler uma linha completa e retorna
            uma String, a leitura tem seu fim quando readLine
            retornar null.

            Ocorre a atribuição no while. */
            while((str = bR.readLine()) != null){
                // Imprime enquanto não for nulo.
                System.out.println(str);
            }
            bR.close(); // Sempre preciso fechar

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

