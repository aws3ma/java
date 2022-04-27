package cours.td4.ex1;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Vehicule> lVehicules = new ArrayList<>();
        lVehicules.add(new Voiture("VW"));
        lVehicules.add(new Velo("B'twin"));
        lVehicules.add(new Avion("boeing"));
        // Vehicule[] listVehicule = {new Voiture("VW"),new Velo("B'twin"),new Avion("boeing")};
        for (Vehicule vehicule : lVehicules) {
            System.out.println(vehicule);
            vehicule.seDeplacer();
            // if(vehicule instanceof Voiture)
            //     System.out.println("Valeur de propriété : "+((Voiture)vehicule).calculer());
            // if(vehicule instanceof Avion)
            //     System.out.println("Valeur de propriété : "+((Avion)vehicule).calculer());
            if(!(vehicule instanceof Velo))
                System.out.println("Valeur de propriété : "+((Motorise)vehicule).calculer());
            
        }
        System.out.println("________________c________________");
        Motorise[] lMotorises = {new Voiture("VW"),new Avion("boeing")};
        for (Motorise motorise : lMotorises) {
            System.out.println(motorise);
            ((Vehicule)motorise).seDeplacer();
            System.out.println("Valeur de propriété : "+motorise.calculer());
        }

    }
}
