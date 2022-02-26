package cours.td2.ex1;

public class Livre {
    private String titre;
    private Auteur[] tabAuteurs;

    public Livre(String titre, Auteur[] tabAuteurs) {
        this.titre = titre;
        this.tabAuteurs = tabAuteurs;
        for (Auteur auteur : tabAuteurs) {
            auteur.ajouterLivre(this);
        }
        // affectAuteur();
    }

    // public void affectAuteur() {

    // }
    public String getTitre() {
        return titre;
    }

    public Auteur getPremierAuteur() {
        return tabAuteurs[0];
    }

    public Auteur[] getAuteurs() {
        return tabAuteurs;
    }
}
