package cours.td2.ex1;

public class Test {
    public static void main(String[] args) {
        Auteur A1, A2, A3;
        Livre L1, L2, L3;
        A1 = new Auteur("Aymen");
        A2 = new Auteur("Ahmed");
        A3 = new Auteur("Oussema");
        L1 = new Livre("La fuite", new Auteur[] { A1 });
        L2 = new Livre("La richesse", new Auteur[] { A2, A1 });
        L3 = new Livre("Lalaland", new Auteur[] { A3, A2 });

        System.out.println("\nDescription de 1 auteur de L1");
        L1.getPremierAuteur().afficher();
        System.out.println("\nDescription de tous les auteurs de L3");
        for (Auteur l : L3.getAuteurs()) {
            l.afficher();
        }
        System.out.println("\nNom du 1 auteur de L1");
        System.out.println(L1.getPremierAuteur().getNom());
    }
}
