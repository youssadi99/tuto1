//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
interface Affichable {
    public void affiche();
}
public class Main {
    public static void main(String[] args) {
        Affichable a;
        a = new Affichable() {
            public void affiche() {
                System.out.println("Je suis un anonyme implementant Affichable");
            }
        };
        a.affiche();
    }
}
