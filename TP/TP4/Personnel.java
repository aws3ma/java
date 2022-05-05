 
import java.util.ArrayList;
public class Personnel {
    ArrayList<Employee> emp=new ArrayList<Employee>();
    public void ajouteremploye(Employee e) {
        emp.add(e);
    }
    void affichersalaire() {
        for(int i=0;i<emp.size();i++) {
            System.out.println(emp.get(i).calculsalaire());
        }
    }
    float salairemoyen() {
        float som=0;
        for(int i=0;i<emp.size();i++) {
            som+=emp.get(i).calculsalaire();
        }
        return som/emp.size();
    }
    void afficherEmp(){
        for (Employee e:emp){
            System.out.println(e.getnom());
        }
    }
}


