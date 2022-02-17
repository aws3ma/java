package cours.td1.ex2;

public class Participant {
    private String nom;
    private String specialite;
    private Formation Form;

    public Participant(String nom, String specialite) {
        this.nom = nom;
        this.specialite = specialite;
    }

    public void affecterFormation(Formation f) {
        if (this.specialite.equals(f.getEns().getSpecialite()))
            Form = f;
        else
            Form = null;
    }

    public void afficher() {
        System.out.println("Nom : " + nom);
        if (Form != null) {
            Form.afficher();
        } else
            System.out.println("Pas de formation accordée");
    }
}
