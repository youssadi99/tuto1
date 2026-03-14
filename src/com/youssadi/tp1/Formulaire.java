package com.youssadi.tp1;

public class Formulaire {
    // Classe interne
    public class Champ {
        private String nom;
        private String valeur;
        private RegleValidation[] regles;
        public Champ(String nom, String valeur, RegleValidation... regles) {

        }
        // Retourne null si valide, sinon le premier message d'erreur trouvé
        public String valider() {
        return null;
        }
    }
// Dans Formulaire : créer 3 champs et afficher les erreurs ou "Formulaire valide"
    public void verifier(String nom, String email, String mdp) {

    }
}
