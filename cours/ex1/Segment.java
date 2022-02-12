package cours.ex1;

public class Segment {
    private Point ext1;
    private Point ext2;
    public Segment(Point p1,Point p2){
        ext1=p1;
        ext2=p2;
    }
    public void deplacerExt1(Point p) {
        ext1.deplacer(p.getAbscisse(), p.getOrdnnee());
    }
    public void deplacerExt2(Point p) {
        ext2.deplacer(p.getAbscisse(), p.getOrdnnee());
    }
    private double longeur() {
        return Math.sqrt(Math.pow(ext2.getAbscisse()-ext1.getAbscisse(),2)+Math.pow(ext2.getOrdnnee()-ext1.getOrdnnee(), 2));
    }
    public void afficher() {
        ext1.afficher();
        ext2.afficher();
        System.out.println("Longeur : "+longeur());
    }
}
