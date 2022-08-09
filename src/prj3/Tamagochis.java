package prj3;

import java.util.Random;

public class Tamagochis {

	private int maxEnergie;
	private int Energie;
	private String nom;
	
	
	
	public Tamagochis(String nom) {
		super();
		this.maxEnergie = genererInt(5,9);
		Energie = genererInt(2,5);
		this.nom = nom;
	}
	
	public int getMaxEnergie() {
		return maxEnergie;
	}
	public void setMaxEnergie(int maxEnergie) {
		this.maxEnergie = maxEnergie;
	}
	public int getEnergie() {
		return Energie;
	}
	public void setEnergie(int energie) {
		Energie = energie;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public int genererInt(int borneInf,int borneSup)
	{
		Random random=new Random();
		int nb;
		nb=borneInf+random.nextInt(borneSup-borneInf);
		return nb;
	}
	public void afficher()
	{
		System.out.println("[maxEnergie=" + maxEnergie + ", Energie=" + Energie + ", nom=" + nom + "]");
	}

	@Override
	public String toString() {
		return "Tamagochis [maxEnergie=" + maxEnergie + ", Energie=" + Energie + ", nom=" + nom + "]";
	}
	
	public void parler()
	{
		if(Energie>5)
			System.out.println("nom : " + nom + " est heureux");
		else
			System.out.println("nom : " + nom + " est affamé");
	}
	public void manger()
	{
		Energie=Energie+genererInt(1,2);
		//System.out.println("Energie : " +Energie);
		//System.out.println("maxEnergie : " +maxEnergie);
	    if(maxEnergie==Energie)
	    {
		     System.out.println("nom : " + nom + "n'a pas faim -mécontentement !!" );
	    }
	    else
		     System.out.println("nom : " + nom + " Satisfaction !!");
	}
	public boolean vivre()
	{
		if(Energie<=0) {
			System.out.println("nom " + nom + "je meurs !!");
	         return false;
		}
		else 
			System.out.println("nom " + nom + ", réduit l'énergie !!");
			return true;
	}
	
}
