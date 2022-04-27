package cours.td3.ex1;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Employe> l=new ArrayList<>();
        Employe ali = new Vacataire("ALI", 200, 3.9f);
        l.add(ali);
        Employe salah = new Contractuel("SALAH", 900);
        l.add(salah);
        Employe mohamed = new Permanent("MOHAMED", 1100, 150);
        l.add(mohamed);
        
        for (Employe employe : l) {
            System.out.println(employe.toString());
        }
        for (Employe employe : l) {
            if (employe instanceof Vacataire) {
                ((Vacataire)employe).setPrixHeure(4.1f);
            }else
            if (employe instanceof Permanent) {
                ((Permanent)employe).setPrime(230);
            }else
            if (employe instanceof Contractuel) {
                ((Contractuel)employe).setSalaireBase(1000);
            }
        }
        System.out.println("============apres question 2C============");
        for (Employe employe : l) {
            System.out.println(employe.toString());
        }
    }
    
}
