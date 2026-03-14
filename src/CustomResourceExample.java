import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CustomResourceExample {
    public static void main(String[] args) {
        try (CustomResource resource1 = new CustomResource("R1");
             CustomResource resource2 = new CustomResource("R2")) {

            resource1.doSomething();
            resource2.doSomething();

        } // Les deux ressources sont automatiquement fermées
    }
}
