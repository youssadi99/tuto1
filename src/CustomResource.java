// Création d'une ressource personnalisée
class CustomResource implements AutoCloseable {
    private String name;

    public CustomResource(String name) {
        this.name = name;
        System.out.println("Ouverture de la ressource: " + name);
    }
    public void doSomething() {
        System.out.println("Utilisation de la ressource: " + name);
    }
    @Override
    public void close() {
        System.out.println("Fermeture de la ressource: " + name);
    }
}

