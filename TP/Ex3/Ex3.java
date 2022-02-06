class Ex3{
	public static void main (String[] args){
		try{
		if(args.length>0){
			int a=Integer.parseInt(args[1]);
			int b=Integer.parseInt(args[2]);
			boolean test=true;
			switch(args[0]){
				case "+" : a=a+b;break;
				case "-" : a=a-b;break;
				case "x" : a=a*b;break;
				case "/" : a=a/b;break;
				default : test=false;
			}
			if(test)
				System.out.println("resultat : "+a);
			else
				System.out.println("Erreur! n'est pas un operateur");
		}
		}
		catch(NumberFormatException NFE){System.out.println("n'est pas un nombre");}
		catch(ArithmeticException AE){System.out.println("exception division par zero");}
		catch(Exception e){System.out.println("exception inconnu");}
		
	}
}