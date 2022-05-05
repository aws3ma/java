 
public class ProdRisque extends Production implements Risque{

    public ProdRisque(String nom, String prenom, String date, int age, int nbu) {
        super(nom, prenom, date, age, nbu);

    }

    public float calculsalaire() {
        return(super.calculsalaire()+Risque.prime);
    }
}

