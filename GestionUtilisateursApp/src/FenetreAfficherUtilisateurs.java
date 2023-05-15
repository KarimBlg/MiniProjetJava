import javax.swing.*;
import java.awt.*;
import java.util.List;

// Interface graphique pour afficher les utilisateurs
public class FenetreAfficherUtilisateurs {
    private JFrame frame;
    private JTextArea textAreaUtilisateurs;
    private GestionUtilisateurs gestionUtilisateurs;

    public FenetreAfficherUtilisateurs(GestionUtilisateurs gestionUtilisateurs) {
        // Initialisation de la fenêtre
        frame = new JFrame("Afficher les utilisateurs");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(300, 200);

        // Initialisation de la zone de texte
        textAreaUtilisateurs = new JTextArea();
        textAreaUtilisateurs.setBounds(50, 50, 200, 100);
        textAreaUtilisateurs.setEditable(false);
        textAreaUtilisateurs.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 12));

        // Ajout de la zone de texte à la fenêtre
        frame.getContentPane().setLayout(null);
        frame.getContentPane().add(textAreaUtilisateurs);

        // Référence à la gestion des utilisateurs
        this.gestionUtilisateurs = gestionUtilisateurs;
    }

    public void afficher() {
        // Affichage des utilisateurs dans la zone de texte
        List<Utilisateur> utilisateurs = gestionUtilisateurs.getUtilisateurs();
        StringBuilder sb = new StringBuilder();
        for (Utilisateur utilisateur : utilisateurs) {
            sb.append(utilisateur.getNom()).append(" - ").append(utilisateur.getEmail()).append("\n");
        }
        textAreaUtilisateurs.setText(sb.toString());

        // Affichage de la fenêtre
        frame.setVisible(true);
    }
}

