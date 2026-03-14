public class TestCouleurAvance {
    public static void main(String[] args) {
        // Ajout d'une méthode pour afficher les couleurs primaires seulement
        System.out.println("=== Couleurs primaires seulement ===");
        for (Couleur c : Couleur.values()) {
            if (c.isPrimary()) {
                System.out.println(c);
            }
        }
        // Calcul de la luminosité (exemple d'utilisation des getters)
        System.out.println("\n=== Luminosité des couleurs ===");
        for (Couleur c : Couleur.values()) {
            double luminosite = 0.2126 * c.red + 0.7152 * c.green + 0.0722 * c.blue;
            System.out.println(c + ": " + luminosite);
        }
    }
}
enum Couleur {
        ROUGE(255, 0, 0, true),
        VERT(0, 255, 0, true),
        BLEU(0, 0, 255, true);
        int red, green, blue;
        private boolean primary;
        private Couleur(int red, int green, int blue, boolean primary) {
            this.red = red;
            this.green = green;
            this.blue = blue;
            this.primary = primary;
        }
        //getters and setters
        public boolean isPrimary() {
            return primary;
        }
        public int getRed() {
            return red;
        }

        public void setRed(int red) {
            this.red = red;
        }

        public int getGreen() {
            return green;
        }

        public void setGreen(int green) {
            this.green = green;
        }

        public int getBlue() {
            return blue;
        }

        public void setBlue(int blue) {
            this.blue = blue;
        }
        public void setPrimary(boolean primary) {
            this.primary = primary;
        }
}

