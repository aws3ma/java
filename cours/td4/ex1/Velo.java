package cours.td4.ex1;


public class Velo extends Vehicule{

    
    public Velo(String m) {
        marque = m;
    }

    @Override
    public void seDeplacer() {
        System.out.println("je pédale");
        
    }
    @Override
    public String toString() {
        return super.toString()+" de type vélo et de marque "+marque;
    }
    
}
