package TP.TP3;

public class TestPort {
    public static void main(String[] args) {
        Port p = new Port("sfax", 40, 100);
        Barque b=new Barque("barque simple", 1);
        BarqueMoteur bm=new BarqueMoteur("barque moteur", 2, 5);
        p.ajouterBarque(b);
        p.ajouterBarque(bm);
        System.out.println(p);
    }
}
