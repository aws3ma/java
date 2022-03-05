package TP.tp2.ex1;

public class Client {
    private String nom;
    private String prenom;
    private int nbrComptes;
    private Compte comptes[];

    public Client(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        nbrComptes = 0;
        comptes = new Compte[10];
    }

    public void Ouvrire_Compte() {
        if (nbrComptes < 10) {
            comptes[nbrComptes++] = new Compte();
        } else {
            System.out.println("vous avez atteint la limite de 10 comptes");
        }
    }

    public void Fermer_Compte(String num) {
        for (int i = 0; i < nbrComptes; i++) {
            if (comptes[i].verif(num)) {
                comptes[i] = comptes[--nbrComptes];
                comptes[nbrComptes] = null;
                break;
            }
        }
    }

    public void deposer(float m, String num) {
        for (int i = 0; i < nbrComptes; i++) {
            if (comptes[i].verif(num)) {
                comptes[i].crediter(m);
                break;
            }
        }
    }

    public void Retirer(float m, String num) {
        for (int i = 0; i < nbrComptes; i++) {
            if (comptes[i].verif(num)) {
                comptes[i].debiter(m);
                break;
            }
        }
    }

    public void affiche() {
        float sum=0;
        System.out.println(nom + " " + prenom + "\nnombre des compte: " + nbrComptes);
        for (int i = 0; i < nbrComptes; i++) {

            comptes[i].afficher();
            sum+=comptes[i].getSolde();
        }
        System.out.println("Total\t"+sum);
    }

    public boolean verif(String num) {
        for (int i = 0; i < nbrComptes; i++) {
            if (comptes[i].verif(num)) {
                return true;
            }
        }
        return false;
    }

}
