package TP.tp1.ex3;

public class Ex3{

	public static void main (String[] args){
		//try catch pour assurer que le programme continue l'exécution si il y'a un bug
		try{
		//test sur la longeur du tableau args
		if(args.length>0){
			//changer type des args (strings) vers entier
			int a=Integer.parseInt(args[1]);
			int b=Integer.parseInt(args[2]);
			//variable boolean pour tester l'operateur
			boolean test=true;
			//switch pour choisir le bonne décision depend de la variable qui contient l'operateur
			switch(args[0]){
				case "+" : a=a+b;break;
				case "-" : a=a-b;break;
				case "x" : a=a*b;break;
				case "/" : a=a/b;break;
				default : test=false;
			}
			//si c'est un vrai operateur on va afficher le resultat si nn un message
			if(test)
				System.out.println("resultat : "+a);
			else
				System.out.println("Erreur! n'est pas un operateur");
		}
		}
		//en cas où a ou/et b ne sont pas des nombres
		catch(NumberFormatException NFE){System.out.println("n'est pas un nombre");}
		//en cas où on a une division par zero
		catch(ArithmeticException AE){System.out.println("exception division par zero");}
		//n'importe qu'elle erreur
		catch(Exception e){System.out.println("exception inconnu");}
	}
}