package cours.td2.ex2;

public class Employe {
    public static int dernierMat = 1000;
    private int mat;
    private String nom;
    private float salaire;
    private Service service;

    public Employe(String nom, float salaire) {
        this.nom = nom;
        this.salaire = salaire;
        mat = ++dernierMat;
    }

    public int getMat() {
        return mat;
    }

    public String getNom() {
        return nom;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public void augmenterSalaire(float facteur) {
        salaire *= facteur;
    }

    public void afficher() {
        System.out.println("\tdernierMat : \t" + mat + "\n\tNom : \t" + nom + "\n\tNom du service : \t"
                + service.getNom() + "\n\tSalaire : \t" + salaire);
    }
}
