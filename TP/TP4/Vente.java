public class Vente extends Commercial {
    public Vente(String nom, String prenom, String date, int age, float chiffre) {
        super(nom, prenom, date, age, chiffre);

    }
    public float calculesalaire() {
        return (super.getChiffre()*0.2F)+400;
    }
    public String gettitre() {
        return "vendeur ";
    }
    public float calculsalaire() {

        return (super.getChiffre()*0.2F)+400;

    }
}
