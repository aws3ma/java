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
        if(nbBarque<capacite)
        {listBarque.add(b);
        nbBarque++;}else{
            System.out.println("Port est plein");
        }
    }
    public void suppBarque(Barque b){
        if(listBarque.remove(b)){
            System.out.println("Barque est quitter");
            nbBarque--;
        }
        else{
            System.out.println("Barque n'est pas disponible");
        }
    }
    public float calculerTaxe(Barque b){
        if(b instanceof BarqueMoteur){
            if(((BarqueMoteur)b).getPuissance()<5)
                return taxe*1.1f;
            else
                return taxe*1.2f;
        }else{
            return taxe;
        }
    }
    public float recetteTaxeAujour(){
        float som=0;
        for (Barque barque : listBarque) {
            som+=calculerTaxe(barque);
        }
        return som;
    }
    @Override
    public String toString() {
        return "Nom : "+nom+"\nCapacite : "+capacite+"\nTotal taxe : "+recetteTaxeAujour();
    }
}
