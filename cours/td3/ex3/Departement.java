package cours.td3.ex3;

public class Departement {
    private String nom;
    private Personne tabPersonnes[];
    public Departement(String nomdep, Personne[] t) {
        this.nom = nomdep;
        this.tabPersonnes = t;
    }
    public String getNom() {
        return nom;
    }
    public Personne[] getTabPersonnes() {
        return tabPersonnes;
    }
    
}
