package TP.tp2.ex1;

import java.util.Random;

public class TestBanque {
    public static void main(String[] args) {
        Random r= new Random();
        int n;
        n=3;
        Client tabc[]={new Client("ben said","aymen"),new Client("Krichen","Ahmed"),new Client("Amri","Aymen")};
        int k=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<r.nextInt(10);j++){

                tabc[i].Ouvrire_Compte();
                k+=j;
                tabc[i].deposer(r.nextFloat()*10000f, Integer.toString(k));
            }
            tabc[i].affiche();
        }
    }
    
}
