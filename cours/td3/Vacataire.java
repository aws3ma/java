package cours.td3;

public class Vacataire extends Employe{
    private int nbHeures;
    private float prixHeure;
    public Vacataire(String nom, int nbHeures, float prixHeure) {
        super(nom);
        this.nbHeures = nbHeures;
        this.prixHeure = prixHeure;
    }
    public void setPrixHeure(float prixHeure) {
        this.prixHeure = prixHeure;
    }
    public float calculerSalaire(){
        return nbHeures*prixHeure;
    }
    @Override
    public String toString() {
        return super.toString()+"\nSalaire : "+calculerSalaire();
    }
}
