package cours.td3.ex1;

public class Permanent extends Contractuel{
    private float prime;

    public Permanent(String nom, float salaireBase, float prime) {
        super(nom, salaireBase);
        this.prime = prime;
    }
    public void setPrime(float prime) {
        this.prime = prime;
    }
    public float calculerSalaire(){
        return super.salaireBase+prime;
    }
}
