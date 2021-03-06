package TP.TP3;

import java.util.ArrayList;

public class Port {
    private String nom;
    private int capacite;
    private float taxe;
    private int nbBarque;
    private ArrayList<Barque> listBarque;

    public Port(String nom, int capacite, float taxe) {
        this.nom = nom;
        this.capacite = capacite;
        this.taxe = taxe;
        this.nbBarque = 0;
        this.listBarque = new ArrayList<>();
    }

    public void ajouterBarque(Barque b) {
        if (nbBarque < capacite) {
            listBarque.add(b);
            nbBarque++;
        } else {
            System.out.println("Port est plein");
        }
    }

    public void ajouterBarque(String num, String nom) {
        if (nbBarque < capacite) {
            Barque b = new Barque(nom, num);
            listBarque.add(b);
            nbBarque++;
        } else {
            System.out.println("Port est plein");
        }
    }

    public void ajouterBarque(String num, String nom, int p) {
        if (nbBarque < capacite) {
            Barque b = new BarqueMoteur(nom, num, p);
            listBarque.add(b);
            nbBarque++;
        } else {
            System.out.println("Port est plein");
        }
    }

    public void suppBarque(Barque b) {
        if (listBarque.remove(b)) {
            System.out.println("Barque est quitter");
            nbBarque--;
        } else {
            System.out.println("Barque n'est pas disponible");
        }
    }
    public void suppBarque(String num) {
        if (nbBarque>0) {
            for (Barque barque : listBarque) {
                if(barque.getNum().equals(num)){
                    listBarque.remove(barque);
                    nbBarque--;
                    break;
                }
            }
            
        } else {
            System.out.println("Barque n'est pas disponible");
        }
    }

    public float calculerTaxe(Barque b) {
        if (b instanceof BarqueMoteur) {
            if (((BarqueMoteur) b).getPuissance() < 5)
                return taxe * 1.1f;
            else
                return taxe * 1.2f;
        } else {
            return taxe;
        }
    }

    public float recetteTaxeAujour() {
        float som = 0;
        for (Barque barque : listBarque) {
            som += calculerTaxe(barque);
        }
        return som;
    }

    @Override
    public String toString() {
        String ch="Nom : " + nom + "\nCapacite : " + capacite + "\nTotal taxe : " + recetteTaxeAujour()+"\nNombre de barque : "+nbBarque+"\nLes barques : \n";
        for (Barque barque : listBarque) {
            ch+=barque+"\n";
        }
        return ch;
    }
}
