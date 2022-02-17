package cours.td1.ex1;

public class Point {
    private float abs;
    private float ord;

    public Point(float abs, float ord) {
        this.abs = abs;
        this.ord = ord;
    }

    public float getAbscisse() {
        return abs;
    }

    public float getOrdnnee() {
        return ord;
    }

    public void deplacer(float nabs, float nord) {
        abs += nabs;
        ord += nord;
    }

    public void afficher() {
        System.out.println("Abscisse : " + abs + "\nOrdnnee : " + ord + "\n");
    }

    @Override
    public String toString() {

        return "Abscisse : " + abs + "\nOrdnnee : " + ord;
    }

    public boolean coincide(Point p) {
        return abs == p.abs && ord == p.ord;
    }

}
