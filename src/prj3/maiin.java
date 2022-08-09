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
		String[] s = new String[] { "Pierre", "Paul", "jacques" };
		for(int i=0;i<n;i++)
		{
			System.out.println("Quel nom pour le nouveau tamagotchis : " + T[i].getNom());
			
			System.out.println("Cycle n° :" + (i+1) );
			T[i].parler();
			T[i].manger();
			T[i].vivre();
			
			//System.out.println("Tamagochis " + i + " : " + T[i]);
		}
		//Tamagochis T = new Tamagochis("pierre");
		//T.afficher();
		//T.parler();
		//T.manger();
		//T.vivre();
	}

}
