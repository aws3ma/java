 
public class Representant extends Commercial {
    public Representant(String nom, String prenom, String date, int age, float chiffre) {
        super(nom, prenom, date, age, chiffre);
    }
    String getTitre()
    {
        return "Representant ";
    }

    @Override
    public String gettitre() {
        return "Representant ";
    }

    public float calculsalaire() {
        return (super.getChiffre()*0.2F)+800;
    }
}


