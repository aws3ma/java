 
public class Manutention extends Employee {
    float nbh;

    public Manutention(String nom, String prenom, String date, int age, float nbh) {
        super(nom, prenom, date, age);
        this.nbh = nbh;
    }

    public float getNbh() {
        return nbh;
    }

    public void setNbh(float nbh) {
        this.nbh = nbh;
    }
    public String gettitre() {
        return "manutentionnaire ";
    }
    public float calculsalaire() {
        return(nbh*65);
    }
}
