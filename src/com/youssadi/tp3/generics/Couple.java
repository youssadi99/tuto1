package com.youssadi.tp3.generics;

public class Couple <T>{
    private T x, y ; // les deux éléments du couple
    public Couple (T premier, T second) {
        x = premier ; y = second ;
    }
    public void affiche () {
        System.out.println ("premiere valeur : " + x
            + " - deuxieme valeur : " + y ) ;
    }
}

