package com.java.intermediario.wrapperselementosbasicos.test;

import com.java.intermediario.wrapperselementosbasicos.classes.InformacaoAula;
/*
Em algumas anotações não é necessário passar nada, porém nessa é precisa passar os valores de autor e aulaNumero.
 */
@InformacaoAula(
        autor = "Loiane",
        aulaNumero = 65,
        //também é possível sobrescrever os valores padrões
        blog = "loiane.com/java"
)
public class TesteAnotacao {
}
