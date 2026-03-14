enum Animal {
    CHIEN("Mammifère") {
        @Override
        public String sonEmis() {
            return "Woof!";
        }
        @Override
        public int getNombrePattes() {
            return 4;
        }
    },
    POISSON("Poisson") {
        @Override
        public String sonEmis() {
            return "Bloup!";
        }
        @Override
        public int getNombrePattes() {
            return 0;
        }
    },
    OISEAU("Oiseau") {
        @Override
        public String sonEmis() {
            return "Cui-cui!";
        }

        @Override
        public int getNombrePattes() {
            return 2;
        }
    };

    private String classe;
    // Constructeur
    Animal(String classe) {
        this.classe = classe;
    }
    // Méthodes abstraites
    public abstract String sonEmis();
    public abstract int getNombrePattes();

    // Méthode concrète
    public String getClasse() {
        return classe;
    }
    public void afficherDescription() {
        System.out.println(this +
                " (" + classe + ") - " +
                getNombrePattes() + " pattes, son: "
                + sonEmis());
    }
}

// Classe de test
public class TestAnimal {
    public static void main(String[] args) {
        for (Animal animal : Animal.values()) {
            animal.afficherDescription();
        }

        // Comportement spécifique
        Animal monAnimal = Animal.CHIEN;
        System.out.println("\n" + monAnimal +
                " fait: " + monAnimal.sonEmis());
    }
}
