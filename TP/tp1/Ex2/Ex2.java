package TP.tp1.Ex2;

class Ex2{
	public static void main(String[] args){
		if(args.length == 0){
			System.out.println("parametre inexistant");
		}else
		{
			System.out.print("bonjour ");
			for(int i=0;i<args.length;i++)
				System.out.print(args[i]+" "); 
		}
	}
}