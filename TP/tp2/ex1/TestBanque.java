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
        // Client cl1=new Client("ben said","aymen");
        // Client cl2=new Client("Dhouib","Yessine");
        // Client cl3=new Client("Mrabet","Racem");
        // Client tabc[]={cl1,cl2,cl3};
        // for (int i = 0; i < tabc.length ; i++) {
        //     for (int j = 0; j <2 ; j++) {
        //         tabc[i].Ouvrire_Compte();
        //     }

        // }
        // cl1.deposer(1500,"1");
        // cl1.deposer(1500,"2");
        // cl2.deposer(1200,"3");
        // cl3.deposer(2300,"5");
        // for(int i=0;i<3;i++){
        //     tabc[i].affiche();
        // }


    }
    
}
