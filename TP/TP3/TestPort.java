package TP.TP3;

public class TestPort {
    public static void main(String[] args) {
        Port p = new Port("Port sfax", 40, 100);
        p.ajouterBarque(new Barque("barque 1", "1"));//taxe 100
        p.ajouterBarque(new BarqueMoteur("barque 2", "2", 5));//taxe 120
        p.ajouterBarque("4", "barque 4", 4); //taxe 110
        p.ajouterBarque("3", "barque 3"); 
        p.suppBarque("3");
        System.out.println(p);
    }
}
