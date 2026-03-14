package com.youssadi.tp1;

public class Main {
    public static void main(String[] args) {
        Formulaire f = new Formulaire();
        f.verifier("Alice", "alice@mail.com", "Secret123"); // valide
        f.verifier("", "emailsansarobas", "faible"); // 3 erreurs
    }
}
