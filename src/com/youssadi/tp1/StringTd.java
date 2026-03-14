package com.youssadi.tp1;
public class StringTd {
    public static void main(String[] args) {
        String chaine = "Never odd or even";
        String[] mots = chaine.split(" ");
        System.out.println("le nombr de mots est : " + mots.length);

        // 1. Utiliser split() pour diviser la phrase en mots
        //String[] mots = phrase.split("\\s+");
        int nombreMots = mots.length;
        System.out.println("Nombre de mots : " + nombreMots);
        String[] motsInverses = new String[nombreMots];
        for (int i = 0; i < nombreMots; i++) {
            StringBuilder sb = new StringBuilder(mots[i]);
            motsInverses[i] = sb.reverse().toString();
            System.out.println("Mot original : '" + mots[i] + "' -> inversé : '" + motsInverses[i] + "'");
        }
        StringBuilder phraseInversee = new StringBuilder();
        for (int i = 0; i < nombreMots; i++) {
            phraseInversee.append(motsInverses[i]);
            if (i < nombreMots - 1) {
                phraseInversee.append(" "); // Ajouter un espace entre les mots
            }
        }
        System.out.println("Phrase avec mots inversés : " + phraseInversee.toString());

        // 5. Vérifier si la phrase initiale est un palindrome
        boolean estPalindrome = estPalindrome(chaine);
        System.out.println("La phrase initiale est-elle un palindrome ? " + estPalindrome);
    }
    public static boolean estPalindrome(String phrase) {
        // Supprimer tous les espaces et convertir en minuscules
        String phraseNettoyee = phrase.replaceAll("\\s+", "").toLowerCase();

        // Créer une version inversée avec StringBuilder
        StringBuilder sb = new StringBuilder(phraseNettoyee);
        String phraseInversee = sb.reverse().toString();

        // Comparer
        return phraseNettoyee.equals(phraseInversee);
    }
}
