 
public class Production extends Employee{
    int nbu;

    public Production(String nom, String prenom, String date, int age, int nbu) {
        super(nom, prenom, date, age);
        this.nbu = nbu;
    }

    public int getNbu() {
        return nbu;
    }

    public void setNbu(int nbu) {
        this.nbu = nbu;
    }
    public String gettitre() {
        return "Production ";
    }
    public float calculsalaire() {
        return nbu*5;
    }

}
