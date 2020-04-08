package com.java.intermediario.expressoesregulares.classes;

/**
 * Separa valores de uma String de entrada por um padrão passado
 */
public class RegexPadroes {
    private final static int MAXCHAR = 20; // Máximo de de valores que podem ser armazenados
    public String regex;
    public String sepRgx;
    public String textoEntrada;

    public RegexPadroes(String textoEntrada){
        this.textoEntrada = textoEntrada;
    }

    /**
     * Separa valores valores que podem ser emails e valida esses valores
     * @param Regex - Padrão Regex que se deve extrair
     * @param sepRgx - Tipo de Separador -> Ex: Separa espaços ou vírgula
     * @return - retorna um vetor de strings com emails validados
     */
    public String separaValida(String Regex, String sepRgx) {
        this.regex = Regex;
        this.sepRgx = sepRgx;

        String[] str = new String[MAXCHAR];
        int i = 0;

        //Separa os valores que estão dividos por vírgula ou outro caractere
        for (String x : this.textoEntrada.split(this.sepRgx)){
            if(i > MAXCHAR){
                throw new IllegalArgumentException("Limite de caractere excedido");
            }
            if(x != null){
                str[i++] = x;
            }
        }

        String[] str2 = new String[i+1]; // string de vetor a retornar

        i = 0;
        /*
        for (String s : str) {
            if (s != null) {
                if (s.matches(this.Regex)) { //valida e-mail
                    str2[i++] = s;
                }
            }
        }
         */

        StringBuilder sb = new StringBuilder();

        for (String s : str) {
            if (s != null) {
                if (s.matches(this.regex)) { //valida e-mail
                    sb.append(s).append("\n");
                }
            }
        }

        return sb.toString();
    }
}
