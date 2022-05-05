public abstract class Employee {
    String nom;
    String prenom;
    String date;
    int age;

    public Employee(String nom, String prenom, String date, int age) {
        super();
        this.nom = nom;
        this.prenom = prenom;
        this.date = date;
        this.age = age;
    }

    public abstract String gettitre() ;

    String getnom() {
        return gettitre() + nom + prenom;
    }

    public String getNom2() {
        return this.getClass().getName()+nom+" "+prenom;
    }

    public abstract float calculsalaire();
}

