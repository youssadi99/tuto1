package com.youssadi.tp3.generics;

public class PointNomme extends Couple<Integer> {
    private String nom;
    public PointNomme(Integer x, Integer y, String nom) {
        super(x, y);
        this.nom = nom;
    }
    public void affiche() {
        System.out.println("Point : " + nom);
        super.affiche();
    }
}
