 
public class Test {
        public static void main(String[] args) {
            Personnel p=new Personnel();
            p.ajouteremploye(new Vente("Pierre","Business","1995",45,30000));
            p.ajouteremploye(new Representant("Léon","Vendtout","2001",25,20000));
            p.ajouteremploye(new Production("Yves","Bosseur","1998",32,1000));
            p.ajouteremploye(new Manutention("Jeanne","Stocketout","1998",32,45));
            p.ajouteremploye(new ProdRisque("Jean","Flippe","2000",28,1000));
            p.ajouteremploye(new ManuRisque("Al","Abordage","2001",30,45));
            p.affichersalaire();
            System.out.println("le salaire moyen est "+p.salairemoyen());
            p.afficherEmp();
        }

}


