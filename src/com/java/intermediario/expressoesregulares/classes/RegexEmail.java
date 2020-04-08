package com.java.intermediario.expressoesregulares.classes;

/**
 * Usa um objeto RegexPadroes para retornar emails validos.
 */
public class RegexEmail {
    private final static String EMAILREGEX = "([\\w\\.])+@([\\w])+(\\.[\\w]+)+";
    private final static String SEPARADOR = "([\\, \\s])+"; // padrão de separação entre valores
    public String texto; // Texto com valores

    private RegexPadroes pdrs;

    public RegexEmail(String texto) {
        this.texto = texto;
    }

    private void inicia() {
        pdrs = new RegexPadroes(this.texto);
    }

    public String valoresValidados(){
        this.inicia();
        return pdrs.separaValida(EMAILREGEX,SEPARADOR);
    }


}
