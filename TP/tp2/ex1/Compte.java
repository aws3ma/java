package TP.tp2.ex1;

public class Compte {
    static int x=0;
    private String numero; 
    private float solde;
    public Compte() {
        x++;
        numero=Integer.toString(x);
        solde=0;
    }
    public void crediter(float x){
        solde+=x;
    }
    public boolean debiter(float x){
        if(solde>=x){
            solde-=x;
            return true;
        }
        return false;
    }
    public float getSolde() {
        return solde;
    }
    public void afficher(){
        System.out.println("Numero : "+numero+"\nSolde : "+solde);
    }
    public boolean verif(String s){
        return numero.equals(s);
    }
    
}
