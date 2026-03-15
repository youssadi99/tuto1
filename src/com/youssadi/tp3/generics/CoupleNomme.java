package com.youssadi.tp3.generics;

public class CoupleNomme<T> extends Couple<T> {
    private String nom;
    public CoupleNomme(T x, T y , String nm ) {
        super(x, y);
        this.nom = nm;
    }
    @Override
    public void affiche() {
        System.out.println("nom : " + nom);
        super.affiche();
    }
}
