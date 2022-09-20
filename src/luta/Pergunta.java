/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luta;

import java.util.*;
public class Pergunta {
    public String enunciado;
    public Vector alternativas;
    public int correta;

    public Pergunta( String novoEnunciado ) {

        enunciado = novoEnunciado;
        alternativas = new Vector();
        correta = -1;
}
    public void definirAlternativa( String texto ) {
        int n = alternativas.size();
        assert( (0 <= n) && (n < 4) );
// @do:
        int ordem = n + 1;
        Alternativa nova = new Alternativa( "" + ordem + ") " + texto );
        alternativas.add( nova );
// @post: até 4 alternativas
        assert( (0 < alternativas.size()) && (alternativas.size() <= 4) );
}

       // Pergunta: definição da alternativa correta
    public void definirAlternativaCorreta( String texto ) {
// @pre: menos do que 4 alternativas
        int n = alternativas.size();
        assert( (0 <= n) && (n < 4) );
// @do:
        int ordem = n + 1;
        Alternativa nova = new Alternativa( "" + ordem + ") " + texto );
        alternativas.add( nova );
        correta = ordem;
// @post: até 4 alternativas, uma delas correta
        assert( (0 < alternativas.size()) && (alternativas.size() <= 4) );
        assert( ( 1 <= correta )&&(correta <= 4) );
}

        //Pergunta: método que mostra a pergunta
    public void mostrar() {
// @pre: tem 4 alternativas, uma delas correta
        assert( alternativas.size() == 4 );
        assert( ( 1 <= correta )&&(correta <= 4) );
// @do:
        System.out.println( enunciado );
        for( int i = 0; i < alternativas.size(); i++ ) {
        Alternativa a = (Alternativa)alternativas.get(i);
        a.mostrar();
}
}
        //Pergunta: analisar alternativa
    public void analisarAlternativa( int ordem ) {
// @pre: ordem corresponde a alguma alternativa
        assert( ( 1 <= ordem )&&(ordem <= 4) );
// @do:
        if( ordem == correta ) {
            System.out.println( "Resposta correta!" );
}
        else {
            System.out.println( "Resposta ERRADA!" );
}
}
               
}

