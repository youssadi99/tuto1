package com.youssadi.tp4;

public interface ListeNumTel {
    boolean ajouter(int index, NumTel num);
    boolean ajouterDebut(NumTel num);
    boolean ajouterFin(NumTel num);
    boolean contientNumero(int num);
    java.util.Iterator iterator();
    int nbNumeros();
    NumTel numero(int index);
    NumTel premierNumero();
    boolean retirer(int num);
    java.lang.String toString();
}
