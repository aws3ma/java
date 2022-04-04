package cours.td3.ex1;

public class Contractuel extends Employe{
    protected float salaireBase;

    public Contractuel(String nom, float salaireBase) {
        super(nom);
        this.salaireBase = salaireBase;
    }
    public void setSalaireBase(float salaireBase) {
        this.salaireBase = salaireBase;
    }
    public float calculerSalaire() {
        return salaireBase;
    }
    @Override
    public String toString() {
        return super.toString()+"\nSalaire : "+calculerSalaire();
    }
}
