package cours.td1.ex2;

public class TestFormation {
    public static void main(String[] args) {
        Enseignant e1 = new Enseignant("Tarak", "Java");
        Enseignant e2 = new Enseignant("Boukthir", "I.A.");
        Formation f=new Formation("Java", e1);
        Participant p=new Participant("Oussema", "Java");
        p.affecterFormation(f);
        p.afficher();
        System.out.println();
        f.setEns(e2);
        p.affecterFormation(f);
        p.afficher();
    }
}
