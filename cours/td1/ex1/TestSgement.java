package cours.td1.ex1;

import java.util.Scanner;

public class TestSgement {
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        Point p2;
        System.out.println("Point 1 : ");
        
        Point p1 = new Point(keyb.nextFloat(), keyb.nextFloat());
        do {
            System.out.println("Point 2 : ");
            p2 = new Point(keyb.nextFloat(), keyb.nextFloat());
        } while (p1.coincide(p2));
        Segment sg = new Segment(p1, p2);
        sg.afficher();
        sg.deplacerExt1(keyb.nextFloat(), keyb.nextFloat());
        sg.deplacerExt2(keyb.nextFloat(), keyb.nextFloat());
        sg.afficher();
        keyb.close();
    }
}
