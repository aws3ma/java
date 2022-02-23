package TP.tp2.ex1;

public class Client {
    private String nom;
    private String prenom;
    private int nbrComptes;
    private Compte comptes[];

    public Client() {
        comptes = new Compte[10];
        nbrComptes = 0;
    }

    public void ouvrireCompte() {
        if (nbrComptes < 10) {
            Compte c = new Compte();
            comptes[nbrComptes++] = c;
        }
    }

    
}
