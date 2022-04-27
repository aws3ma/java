package cours.td4.ex1;

public class Voiture extends Vehicule implements Motorise {

    
    public Voiture(String m) {
        marque=m;
    }

    @Override
    public double calculer() {
        // TODO Auto-generated method stub
        return prop*2;
    }

    @Override
    public void seDeplacer() {
        System.out.println("Je roule");
    }
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString()+" de type voiture et de marque "+marque;
    }
}
