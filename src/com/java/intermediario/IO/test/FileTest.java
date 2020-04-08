package com.java.intermediario.IO.test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest {
    public static void main(String[] args) {
        // Apenas o nome o arquivo é criado dentro do projeto
        // e para criar em um diretório é preciso especificar o diretório
        File file = new File("Arquivo.txt");

        try {
            System.out.println(file.createNewFile());
            System.out.println("Permissão de leitura : " + file.canRead());
            System.out.println("Diretório : "+ file.getPath());
            System.out.println("Diretório Completo : " + file.getAbsolutePath());
            System.out.println("Diretório ? " + file.isDirectory());
            System.out.println("Oculto : " + file.isHidden());
            //Retorna em long converte com a classe Date
            System.out.println("Ultima vez modificado : " + new Date(file.lastModified()));
            boolean exists = file.exists();
            if(exists){
                System.out.println("Deletado : "+ file.delete());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
