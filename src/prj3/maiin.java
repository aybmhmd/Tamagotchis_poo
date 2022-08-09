package prj3;

import java.util.ArrayList;
import java.util.Scanner;

public class maiin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner clavier = new Scanner(System.in);
		int n = clavier.nextInt(); // n tamagotchis
		Tamagochis [] T = new Tamagochis[n];
		T[0]= new Tamagochis("Pierre");
		T[1]= new Tamagochis("Paul");
		T[2]= new Tamagochis("Jacques");
		T[3]= new Tamagochis("Pierre");
		T[4]= new Tamagochis("Raul");
		T[5]= new Tamagochis("Jeremy");
		T[6]= new Tamagochis("Lea");
		T[7]= new Tamagochis("Chloe");
		T[8]= new Tamagochis("Laurent");
		T[9]= new Tamagochis("Maxime");
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Quel nom pour le nouveau tamagotchis : " + T[i].getNom());
		}
while(true) {
		for(int i=0;i<n;i++)
		{
			System.out.println("Cycle n° :" + (i+1) );
			System.out.println("------------------");
			T[i].parler();
			T[i].manger();
			T[i].vivre();
			System.out.println("----------------------------------------");
			int op;
			System.out.println(" (0) Pierre (1) Paul (2) Jacques");
			System.out.println("Nourir quel tamagochi ? ");
			op = clavier.nextInt(); 
			switch(op) {
			case 0 : System.out.println(" (0) "+ T[0].getNom());
			break;
			case 1 : System.out.println(" (1) " + T[1].getNom());
			break;
			case 2 : System.out.println(" (2) " + T[2].getNom());
			break;
			default : System.out.println("Veuillez resaisir le tamagotchi à nourir !! ");
			}
			T[op].vivre();
			
			//System.out.println("Tamagochis " + i + " : " + T[i]);
		}
		
		
		
}
		//Tamagochis T = new Tamagochis("pierre");
		//T.afficher();
		//T.parler();
		//T.manger();
		//T.vivre();
	}

}
