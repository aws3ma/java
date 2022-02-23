package TP.tp2.ex1;

public class TestCompte {
    public static void main(String[] args) {
        int deb=40;
        Compte c=new Compte();
        Compte c1=new Compte();
        c.crediter(50);
        if(c.debiter(deb))
            System.out.println("debiter : "+deb);
        else
        System.out.println("failed");
        c.afficher();
        c1.crediter(500);
        deb=700;
        if(c1.debiter(deb))
            System.out.println("debiter "+deb);
        else
        System.out.println("failed");
        c1.afficher();
    }
}
