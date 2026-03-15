package com.youssadi.tp4;

public class Main {
    public static void main(String[] args) {
        MAnnuaire annuaire = new MAnnuaire();
        ListeNumTel listeNumTel1 = new ListNumImpl();
        listeNumTel1.ajouterDebut(new NumTel(123456789, Code.POSTE_FIXE_PROFESSIONNEL));
        listeNumTel1.ajouterDebut(new NumTel(145678111, Code.PORTABLE));
        annuaire.ajouterEntree(new Personne("DURAND", "Sophie", Civilite.Mlle), listeNumTel1);

        ListeNumTel listeNumTel2 = new ListNumImpl();
        listeNumTel1.ajouterDebut(new NumTel(666666666, Code.POSTE_FIXE_PROFESSIONNEL));
        listeNumTel1.ajouterDebut(new NumTel(677788880, Code.POSTE_FIXE_DOMICILE));
        annuaire.ajouterEntree(new Personne("DUPONT", "Jean", Civilite.M), listeNumTel2);

        ListeNumTel listeNumTel3 = new ListNumImpl();
        listeNumTel1.ajouterDebut(new NumTel(322222222, Code.POSTE_FIXE_PROFESSIONNEL));
        listeNumTel1.ajouterDebut (new NumTel(156322555, Code.POSTE_FIXE_DOMICILE));
        annuaire.ajouterEntree(new Personne("DUSCHMOL", "Louis", Civilite.M), listeNumTel3);

        annuaire.afficher();
    }
}
