package cours.td1.ex2;

import java.util.Scanner;

public class TestFormation {
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        System.out.println("enseignant e1");
        Enseignant e1 = new Enseignant(keyb.nextLine(), keyb.nextLine());
        System.out.println("enseignant e2");
        Enseignant e2 = new Enseignant(keyb.nextLine(), keyb.nextLine());
        System.out.println("formation ");
        Formation f = new Formation(keyb.nextLine(), e1);
        System.out.println("participant :");
        Participant p = new Participant(keyb.nextLine(), e2.getSpecialite());
        keyb.close();
        p.affecterFormation(f);
        p.afficher();
        System.out.println();
        f.setEns(e2);
        p.affecterFormation(f);
        p.afficher();
    }
}
