package cours.td4.ex1;

public abstract class Vehicule {
    protected String marque;
    public abstract void seDeplacer();
    @Override
    public String toString() {
        return "Je suis un véhicule";
    }
}
