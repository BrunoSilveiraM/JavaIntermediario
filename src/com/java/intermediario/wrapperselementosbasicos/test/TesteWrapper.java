package com.java.intermediario.wrapperselementosbasicos.test;

public class TesteWrapper {
    public static void main(String[] args) {
        /*
        classe que empacota o tipo primitivo short
        cria o objeto da maneira usual
         */
        Short num2 = new Short((short) 1);
        Short num3 = new Short("3"); // pode ser passado uma string no construtor
        System.out.println(num2); // imprime 1
        System.out.println(num3); // imprime 2
        Integer num1 = new Integer(100); // não é preciso casting
        Float num4 = new Float(52f); // usa "f" para forçar a conversão para float
        Character c1 = new Character('a');
        /*
        Em tempo de compilação qualquer valor que não seja um inteiro e que foi passado como String não
        vai ser reconhecido mas em tempo de execução será lançada a exceção NumberFormatException
         */
        Integer num5 = new Integer("525");
        //Exemplo de conversão
        Long num6 = num5.longValue();
        //transforma uma String em um valor numérico
        int num7 = Integer.parseInt("1002");

        Integer num8 = Integer.valueOf(1343); // transforma número em uma instância da classe Integer
        System.out.println(num8);
        Integer num9 = Integer.valueOf(1343);

        //Não se compara instâncias da classe Wrapper com "==" e sim com equals
        System.out.println(num8.equals(num9)); // imprime true

    }
}
