package cours.td3;

public class Employe {
    private static int matricule=1001;
    private int matriculeEmp;
    private String nom;
    protected float salaire;
    public Employe(String nom) {
        this.nom = nom;
        salaire =0;
        
        matricule++;
        matriculeEmp=matricule;
    }
    @Override
    public String toString() {
        return "Matricule : "+matriculeEmp+"\nNom : "+nom;
    }
}
