package cours.td4.ex2;

public class Reel extends Affichage implements Operation{
    private double x;
    
    public Reel(double x) {
        this.x = x;
    }

    @Override
    public Object plus(Object obj) {
        
        return x+(Float)obj;
    }

    @Override
    public Object moins(Object obj) {
        
        return x-(Float)obj;
    }

    @Override
    public String affiche() {
        
        return Double.toString(x);
    }
    
}
