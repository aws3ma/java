package cours.td1.ex2;

public class Enseignant {
    private String nom;
    private String specialite;
    public Enseignant(String nom, String specialite) {
        this.nom = nom;
        this.specialite = specialite;
    }
    public String getSpecialite() {
        return specialite;
    }
    public String getNom() {
        return nom;
    }
    public void afficher() {
        System.out.println("Enseignant : "+nom+"\nSpecialite : "+specialite);
    }
    
}
