package cours.td1.ex2;

public class Formation {
    private String nom;
    private Enseignant ens;

    public Formation(String nom, Enseignant ens) {
        this.nom = nom;
        this.ens = ens;
    }

    public Enseignant getEns() {
        return ens;
    }

    public String getNom() {
        return nom;
    }

    public void setEns(Enseignant ens) {
        this.ens = ens;
    }

    public void afficher() {
        System.out.println("Nom formation : " + nom);
        ens.afficher();
    }

}
