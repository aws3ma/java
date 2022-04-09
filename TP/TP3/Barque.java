package TP.TP3;

public class Barque {
    private String nom;
    private int num;
    public Barque(String nom, int num) {
        this.nom = nom;
        this.num = num;
    }
    @Override
    public String toString() {
        return "Nom : "+nom+"\nNumero d'autorisation : "+num;
    }
    public int getNum() {
        return num;
    }
}
