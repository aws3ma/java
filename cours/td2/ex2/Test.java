package cours.td2.ex2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Employe e1,e2,e3,e4;
        Service s1,s2;
        e1=new Employe("Paul", 1500);
        e2=new Employe("Tom", 1100);
        e3=new Employe("Diego", 1400);
        e4=new Employe("Lucas", 1100);
        s1=new Service("Finance", 10);
        s2=new Service("Technique", 30);
        s1.afficher();
        s2.afficher();
        System.out.println();
        s1.affecterEmp(e1);
        s1.affecterEmp(e2);
        s2.affecterEmp(e3);
        s2.affecterEmp(e4);
        s1.setChef(e1);
        s2.setChef(e3);
        s1.eliminerEmp(e2);
        s1.affecterEmp(e4);
        s2.eliminerEmp(e4);
        s2.affecterEmp(e2);
        e2.augmenterSalaire(0.35f);
        s2.setChef(e2);
        s1.augmenterSalaire(0.06f);
        s2.augmenterSalaire(0.06f);
        s1.afficher();
        s2.afficher();
    }
}
