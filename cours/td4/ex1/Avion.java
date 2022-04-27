package cours.td4.ex1;

public class Avion extends Vehicule implements Motorise{

    
    public Avion(String m) {
        marque = m;
    }

    @Override
    public double calculer() {
        // TODO Auto-generated method stub
        return prop*15;
    }

    @Override
    public void seDeplacer() {
        System.out.println("je vole");
        
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString()+" de type avion et de marque "+marque;
    }
}
