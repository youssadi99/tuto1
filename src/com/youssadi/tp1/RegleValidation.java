package com.youssadi.tp1;

public enum RegleValidation {
    NOM_NON_VIDE("Le nom ne peut pas être vide") {
        @Override
        public boolean valider(String valeur) {
            return true;
        }
    },
    EMAIL_VALIDE("Email invalide") {
        @Override
        public boolean valider(String valeur) {
            return true;
        }
    },
    MOT_DE_PASSE_FORT("Mot de passe trop faible") {
        @Override
        public boolean valider(String valeur) {
            return true;
        }
    };
    private final String messageErreur;
    RegleValidation(String messageErreur) {
        this.messageErreur = messageErreur;
    }
    public String getMessageErreur() { return messageErreur; }
    public abstract boolean valider(String valeur);
}
