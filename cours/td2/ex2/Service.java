package cours.td2.ex2;

public class Service {
    private String nom;
    private Employe chef;
    private int nbMax;
    private int nbEmp = 0;
    private Employe tabEmp[];

    public Service(String nom, int nbMax) {
        this.nom = nom;
        this.nbMax = nbMax;
        tabEmp = new Employe[nbMax];
    }

    public String getNom() {
        return nom;
    }

    public Employe getChef() {
        return chef;
    }

    public void setChef(Employe chef) {
        this.chef = chef;
    }

    public void affecterEmp(Employe emp) {
        if (nbEmp < nbMax) {
            tabEmp[nbEmp++] = emp;
            emp.setService(this);
        }else
        System.out.println("Service saturé");
    }

    public void eliminerEmp(Employe emp) {
        for (int i = 0; i < nbEmp; i++) {
            if (tabEmp[i].getMat() == emp.getMat()) {
                // emp.setService(null);
                tabEmp[i] = tabEmp[nbEmp - 1];
                tabEmp[--nbEmp] = null;
                break;
            }
        }
    }

    public void augmenterSalaire(float facteur) {
        for (int i = 0; i < nbEmp; i++) {
            tabEmp[i].augmenterSalaire(facteur);
        }
    }

    public void afficher() {
        System.out.println();
        System.out.println("Nom de service : " + nom);
        if (chef != null) {
            System.out.print("Chef : \n");
            chef.afficher();
        }
        for (int i = 0; i < nbEmp; i++) {
            if (chef != null)
                if (tabEmp[i].getMat() != chef.getMat()) {
                    System.out.println("\nEmploye : ");
                    tabEmp[i].afficher();
                }
            else{
                System.out.println("\nEmploye : ");
                tabEmp[i].afficher();
            }
        }

    }

}
