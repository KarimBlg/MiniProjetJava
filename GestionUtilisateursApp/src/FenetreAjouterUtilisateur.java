import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Interface graphique pour ajouter un utilisateur
public class FenetreAjouterUtilisateur {
    private JFrame frame;
    private JTextField textFieldNom;
    private JTextField textFieldEmail;
    private JButton buttonAjouter;
    private GestionUtilisateurs gestionUtilisateurs;

    public FenetreAjouterUtilisateur(GestionUtilisateurs gestionUtilisateurs) {
        // Initialisation de la fenêtre
        frame = new JFrame("Ajouter un utilisateur");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(300, 200);

        // Initialisation des champs de texte
        textFieldNom = new JTextField();
        textFieldNom.setBounds(50, 50, 200, 30);

        textFieldEmail = new JTextField();
        textFieldEmail.setBounds(50, 100, 200, 30);

        // Initialisation du bouton Ajouter
        buttonAjouter = new JButton("Ajouter");
        buttonAjouter.setBounds(100, 150, 100, 30);

        // Ajout des composants à la fenêtre
        frame.getContentPane().setLayout(null);
        frame.getContentPane().add(textFieldNom);
        frame.getContentPane().add(textFieldEmail);
        frame.getContentPane().add(buttonAjouter);

        // Référence à la gestion des utilisateurs
        this.gestionUtilisateurs = gestionUtilisateurs;

        // Ajout d'un écouteur d'événement au bouton Ajouter
        buttonAjouter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nom = textFieldNom.getText();
                String email = textFieldEmail.getText();

                Utilisateur utilisateur = new Utilisateur(nom, email);
                gestionUtilisateurs.ajouterUtilisateur(utilisateur);

                JOptionPane.showMessageDialog(frame, "Utilisateur ajouté avec succès");

                // Réinitialisation des champs de texte
                textFieldNom.setText("");
                textFieldEmail.setText("");
            }
        });
    }

    public void afficher() {
        // Affichage de la fenêtre
        frame.setVisible(true);
    }
}

