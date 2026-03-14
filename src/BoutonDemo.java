import javax.swing.*;
import java.awt.event.*;
public class BoutonDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Test");
        JButton button = new JButton("Cliquez-moi");

        // Classe anonyme pour gérer le clic
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Bouton cliqué !");
                JOptionPane.showMessageDialog(null, "Bonjour !");
            }
        });

        frame.add(button);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
