package com.youssadi.tp3.generics;

public class MainPoint {
    public static void main(String[] args) {
        CoupleNomme<Double> coupleNomme = new CoupleNomme<>(1.2, 3.5, "A");
        coupleNomme.affiche();
        PointNomme p = new PointNomme(2,3, "B");
        p.affiche();

    }
}
