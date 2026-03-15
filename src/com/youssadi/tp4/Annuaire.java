package com.youssadi.tp4;

public interface Annuaire {
    void afficher();
    boolean ajouterEntree(Personne p, ListeNumTel noms);
    void ajouterNumeroDebut(Personne p, NumTel n);
    void ajouterNumeroFin(Personne p, NumTel n);
    ListeNumTel numeros(Personne p);
    java.util.Iterator personnes();
    NumTel premierNumero(Personne p);
    void supprimer(Personne p);
    void supprimer(Personne p, int n);
    java.lang.String toString();
}
