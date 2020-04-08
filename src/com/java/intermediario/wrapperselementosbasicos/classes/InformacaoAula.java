package com.java.intermediario.wrapperselementosbasicos.classes;

public @interface InformacaoAula {
    String autor();

    int aulaNumero();
    //Os valores após default representam valores padrões da anotação.
    String blog() default "https://loiane.com";

    String site() default "https://loiane.training";
}
