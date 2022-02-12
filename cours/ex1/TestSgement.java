package cours.ex1;

import java.util.Scanner;

public class TestSgement {
    public static void main(String[] args) {
        Point p1=new Point(5.3f, 6.9f);
        Point p2=new Point(2.3f, 10.9f);
        Segment sg=new Segment(p1, p2);
        sg.afficher();
        Scanner keyb=new Scanner(System.in);
        sg.deplacerExt1(new Point(keyb.nextFloat(), keyb.nextFloat()));
        sg.deplacerExt2(new Point(keyb.nextFloat(), keyb.nextFloat()));
        sg.afficher();
        keyb.close();
    }
}
