package com.youssadi.tp1;

public class Tri {
    public static void main(String[] args) {
        TrieCritere critere_alhpa = new TrieCritere() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        };
        String[] tableau={"Orange", "Bleu", "Rouge", "Vert"};
        trierTableau(tableau, critere_alhpa);
        System.out.println("Tri alphabétique croissant");
        for(String s : tableau) {
            System.out.println(s);
        }
        System.out.println("Tri alphabétique decroissant");
        trierTableau(tableau, new TrieCritere() {
            @Override
            public int compare(String s1, String s2) {
                return s2.compareTo(s1);
            }
        });
        for(String s : tableau) {
            System.out.println(s);
        }
        trierTableau(tableau, new TrieCritere() {
            @Override
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        });
        System.out.println("Tri par longueur");
        for(String s : tableau) {
            System.out.println(s);
        }

    }
    public static void trierTableau(String[] tableau, TrieCritere critere){
        for(int i=0; i<tableau.length-1; i++){
                    for(int j=i+1; j<tableau.length; j++){
                        if(critere.compare(tableau[i], tableau[j]) > 0){
                            String temp = tableau[i];
                            tableau[i] = tableau[j];
                            tableau[j] = temp;
                        }
                    }
        }

    }
}


