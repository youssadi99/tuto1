package com.youssadi.tp4;
enum Civilite{
    M, Mlle, Mme
}
public class Personne {
    private String nom;
    private String prenom;
    private Civilite civilite;

    public Personne(String nom, String prenom, Civilite civilite) {
        this.nom = nom;
        this.prenom = prenom;
        this.civilite = civilite;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Civilite getCivilite() {
        return civilite;
    }

    public void setCivilite(Civilite civilite) {
        this.civilite = civilite;
    }
}
