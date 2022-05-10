public class Personne {
    private String nom;
    private int age;

    public Personne(String nom, String age) throws AgeInvalideExc, NomInvExc {
        if (nom == null || nom.isEmpty())
            throw new NomInvExc("Nom invalide");
        this.nom = nom;
        try {
            this.age = Integer.parseInt(age); // throw NumberFormatException si age n'est pas un nombre
        } catch (NumberFormatException e) {
            this.age=0;
            System.out.println("number ex");
        }
        if(this.age<=0 || this.age>120)throw new AgeInvalideExc("age invalid");


    }
}
