package com.java.intermediario.expressoesregulares.classes;

/**
 * Encontra padrão de e-mail com regex
 */
public class RegexPadraoEmail {
    private final static int MAXCHAR = 20; // Máximo de emails que podem ser armazenados
    public String textoEntrada; // Texto com emails
    private String[] textoSaida; // Emails que serão entrados
    private String[] emailsValidos; // Vetor de Strings com emails validos
    private int qtdValoresPadrao; // Quantidade de valores padrão
    private final static String EMAILREGEX = "([\\w\\.])+@([\\w])+(\\.[\\w]+)+";
    private final static String SEPARADOR = "([\\, \\s])+"; // padrão de separação entre valores

    /**
     * Inicializa um texto de entrada
     * @param textoEntrada - texto com que o usuário deseja encontrar padrões
     */
    public RegexPadraoEmail(String textoEntrada) {
        this.textoEntrada = textoEntrada;
    }

    /**
     * Separa "," e espaço da String de entrada
     */
    private void padraoEmail() {
        this.textoSaida = new String[MAXCHAR];
        int i = 0;
        for (String valores : this.textoEntrada.split(SEPARADOR)){
            if(i > MAXCHAR){
                throw new IllegalArgumentException("Foi atingido o limite de caracteres");
            }
            if(valores != null){
                this.textoSaida[i++] = valores;
            }
        }
        this.qtdValoresPadrao = i;
    }


    /** Retorna o texto de entrada */
    public String getTextoEntrada() {
        return textoEntrada;
    }

    /** Retorna o máximo de caracteres que uma string pode ter*/
    public static int getMAXCHAR() {
        return MAXCHAR;
    }

    /** Inicializa apenas os emails validos*/
    public void validaEmails() {
        this.padraoEmail(); // Separa os valores do email
        int j = 0; // conta os emails validos

        this.emailsValidos = new String[this.qtdValoresPadrao + 1];

        for (int i = 0; i < this.textoSaida.length; i++){
            if(this.textoSaida[i] != null){ // evita NullPointerException
                if(this.textoSaida[i].matches(EMAILREGEX)){ // realiza a validação
                   this.emailsValidos[j++] = this.textoSaida[i];
                }
            }
        }
    }

    /**
     * Retorna um String com emaisValidos porém possui alguns valores nulos
     * @return - Retorna um vetor com emais válidos,
     * porém pode conter valores nulos não preenchidos.
     */
    public String[] getEmailsValidos(){
        return emailsValidos;
    }

}
