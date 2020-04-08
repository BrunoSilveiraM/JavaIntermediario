package com.java.intermediario.expressoesregulares.classes;

/**
 * Usa a classe RegexPadroes para retornar Datas válidas
 */
public class RegexData {
    private final static String DATA = "\\d{2}/\\d{2}/\\d{2,4}";
    private final static String SEPARADOR = "[, \\s]";
    private String texto;

    RegexPadroes pdrs;

    public RegexData(String texto){
        this.texto = texto;
    }

    public String separaValida() {
        pdrs = new RegexPadroes(this.texto);
        return pdrs.separaValida(DATA,SEPARADOR);
    }
}
