package TP.TP3;

public class Barque {
    private String nom;
    private String num;
    public Barque(String nom, String num) {
        this.nom = nom;
        this.num = num;
    }
    @Override
    public String toString() {
        return "Nom : "+nom+"\nNumero d'autorisation : "+num;
    }
    public String getNum() {
        return num;
    }
}
