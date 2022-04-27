// package cours.td3.ex2;

// public class Test2 {
//     public static void main(String[] args) {
//         C1 o1 = new C1();
//         C1 o2 = new C10();
//         C100 o3 = new C100();
//         C10 o4 = new C100();
//         C1 o5 = new C100();
//         o1=o2;
//         o1=o3;
//         o3=o1;//erreur compilation type o2>o3, c100 herite de c10
//         o4=o5;//erreur compilation o5 de type c1 > o4 type de c10
//         o3=(C100)o1;
//         o4=(C10)o5;
//         o4=(C100)o2;//erreur d'exécution : je ne sais pas!!
//         o3=(C10)o5;//erreur compilation : on ne peut pas caster une instance c100 de type c1

//     }
// }
