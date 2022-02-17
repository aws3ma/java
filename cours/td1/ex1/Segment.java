package cours.td1.ex1;

public class Segment {
    private Point ext1;
    private Point ext2;

    public Segment(Point p1, Point p2) {
        ext1 = p1;
        ext2 = p2;
    }

    public void deplacerExt1(float dx, float dy) {
        ext1.deplacer(dx, dy);
    }

    public void deplacerExt2(float dx, float dy) {
        ext2.deplacer(dx, dy);
    }

    private double longeur() {
        return Math.sqrt(Math.pow(ext1.getAbscisse() - ext2.getAbscisse(), 2)
                + Math.pow(ext1.getOrdnnee() - ext2.getOrdnnee(), 2));
    }

    public void afficher() {
        ext1.afficher();
        ext2.afficher();
        System.out.format("Longeur : %.2f \n", longeur());
    }
}
