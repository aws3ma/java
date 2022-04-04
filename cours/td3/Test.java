package cours.td3;

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
        // l.get(0)
        // for (int i = 0; i < l.size(); i++) {
        //     if (l.get(i) instanceof Vacataire) {
                
        //     }
        // }
        for (Employe employe : l) {
            if (employe instanceof Vacataire) {
                Vacataire v= (Vacataire)employe;
                v.setPrixHeure(4.1f);
            }
            if (employe instanceof Permanent) {
                Permanent v= (Permanent)employe;
                v.setPrime(230);
            }
            if (employe instanceof Contractuel) {
                Contractuel v= (Contractuel)employe;
                v.setSalaireBase(1000);
            }
        }
        for (Employe employe : l) {
            System.out.println(employe.toString());
        }
    }
    
}
