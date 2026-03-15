package com.youssadi.tp3.generics;

public class MainTriplet {
    public static void main(String[] args) {
        Triplet<String> t = new Triplet<>("Hello", "World", "!");
        t.affiche();
        Triplet<Integer> t2 = new Triplet<>(1, 2, 3);
        t2.affiche();
        Triplet<Double> t3 = new Triplet<>(1.0, 2.0, 3.0);
        t3.affiche();
        TripletH<String, Integer, Double> t4 = new TripletH<>("Hello", 1, 1.0);
        t4.affiche();
        TripletH<Integer, Double, String> t5 = new TripletH<>(1, 1.0, "Hello");
        t5.affiche();
    }
}
