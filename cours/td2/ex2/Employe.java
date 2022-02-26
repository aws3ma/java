package cours.td2.ex2;
public class Employe {
    static int matricule=1001;
    private int mat;
    private String nom;
    private float salaire;
    private Service service;
    public Employe(String nom, float salaire) {
        this.nom = nom;
        this.salaire = salaire;
        mat=matricule;
        matricule++;
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
        salaire+=salaire*facteur;
    }
    public void afficher() {
        System.out.println();
        System.out.println("Matricule : "+mat+"\nNom : "+nom+"\nNom du service : "+service.getNom()+"\nSalaire : "+salaire);
    }
}
