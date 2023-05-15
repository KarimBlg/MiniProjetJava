import java.util.ArrayList;
import java.util.List;

// Classe de gestion des utilisateurs
public class GestionUtilisateurs {
    private List<Utilisateur> utilisateurs;

    public GestionUtilisateurs() {
        utilisateurs = new ArrayList<>();
    }

    public void ajouterUtilisateur(Utilisateur utilisateur) {
        utilisateurs.add(utilisateur);
    }

    public List<Utilisateur> getUtilisateurs() {
        return utilisateurs;
    }
}
