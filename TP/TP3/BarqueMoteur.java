package TP.TP3;

public class BarqueMoteur extends Barque{
    private int puissance;
    public BarqueMoteur(String nom, String num, int puissance) {
        super(nom, num);
        this.puissance = puissance;
    }
    public int getPuissance() {
        return puissance;
    }
    @Override
    public String toString() {
        return super.toString()+"\nPuissance : "+puissance;
    }
}
