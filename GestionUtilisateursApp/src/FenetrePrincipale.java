import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Interface graphique principale
public class FenetrePrincipale {
    private JFrame frame;
    private JButton buttonAjouter;
    private JButton buttonAfficher;
    private GestionUtilisateurs gestionUtilisateurs;

    public FenetrePrincipale() {
        // Initialisation de la fenêtre
        frame = new JFrame("Gestion des utilisateurs");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Initialisation des boutons
        buttonAjouter = new JButton("Ajouter utilisateur");
        buttonAjouter.setBounds(50, 50, 200, 30);

        buttonAfficher = new JButton("Afficher utilisateurs");
        buttonAfficher.setBounds(50, 100, 200, 30);

        // Ajout des boutons à la fenêtre
        frame.getContentPane().setLayout(null);
        frame.getContentPane().add(buttonAjouter);
        frame.getContentPane().add(buttonAfficher);

        // Initialisation de la gestion des utilisateurs
        gestionUtilisateurs = new GestionUtilisateurs();

        // Ajout d'un écouteur d'événement au bouton Ajouter
        buttonAjouter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FenetreAjouterUtilisateur fenetreAjouter = new FenetreAjouterUtilisateur(gestionUtilisateurs);
                fenetreAjouter.afficher();
            }
        });

        // Ajout d'un écouteur d'événement au bouton Afficher
        buttonAfficher.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FenetreAfficherUtilisateurs fenetreAfficher = new FenetreAfficherUtilisateurs(gestionUtilisateurs);
                fenetreAfficher.afficher();
            }
        });
    }

    public void afficher() {
        // Affichage de la fenêtre
        frame.setVisible(true);
    }
}
