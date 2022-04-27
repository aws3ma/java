package cours.td4.ex2;

public class Complexe extends Affichage implements Operation{
    private double im,re;

    public Complexe(double im, double re) {
        this.im = im;
        this.re = re;
    }

    @Override
    public Object plus(Object obj) {
        
        return null;
    }

    @Override
    public Object moins(Object obj) {
        
        return null;
    }

    @Override
    public String affiche() {
        
        return "im = "+im+" re = "+re;
    }
}
