public class Test1 {
    public static void main(String[] args) {
        try {
            Personne P=new Personne("nom","z");
            
        } catch (AgeInvalideExc | NomInvExc e) {
            e.printStackTrace();
        }
    }
}
