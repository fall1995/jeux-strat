package dilemme;

import java.util.ArrayList;
import java.util.Scanner;

import strategies.MaStrategieGentille;
import strategies.Coup;
import strategies.IStrategy;
import strategies.MaStrategieDonnantDonnant;
import strategies.MaStrategieDonnantDonnantDur;
import strategies.MaStrategieDonnantDonnantSeuil;
import strategies.MaStrategieMechante;
import strategies.StrategieGentille;
import strategies.StrategieMechante;




public class Main {
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Veuillez saisir un nombre de tours :");
		int nbTours = sc.nextInt();
		System.out.println("Veuillez saisir un nombre de statégies :");
		int nbStrats = sc.nextInt();
		 IStrategy[] strateg = new IStrategy[nbStrats];
		System.out.println("1 - MaStrategieGentille");
		System.out.println("2 - MaStrategieMechante");
		System.out.println("3 - MaStrategieDonnantDonnant");
		System.out.println("4 - MaStrategieDonnantDonnantDur");
		System.out.println("5 - MaStrategieDonnantDonnantSeuil");
		System.out.println("Veuillez taper le numero de la strategi");
		System.out.println("Veuillez taper le numero de la strategi");
		System.out.println("Veuillez taper le numero de la strategi");
		System.out.println("Veuillez taper le numero de la strategi");
		System.out.println("Veuillez taper le numero de la strategi");
		System.out.println();
		System.out.println("------------------------------------------");
		System.out.println();
		
		for (int i = 0; i < strateg.length; i++) {
			System.out.println("taper le numero de la strategi");
			int num = sc.nextInt();
			strateg[i]= Tournoi.StretegieCorespo(num);
			
		}
		
		Tournoi t = new Tournoi(strateg, nbTours);
		t.startTournoi();
		t.somme();
		for (int i =0; i < strateg.length; i++) {
			System.out.println(t.sumScore[i]);
			
		}
		
		
		/* TODO Auto-generated method stub
		IStrategy S1 = new MaStrategieGentille() ;
		IStrategy S2 = new MaStrategieMechante() ;
		//IStrategy S3 = new Gentille() ;
		//IStrategy S4 = new Mechante() ;
		
		IStrategy S3 = new StrategieGentille() ;
		IStrategy S4 = new StrategieMechante() ;

		
		IStrategy[] str = {S1,S2,S3,S4};
		
		
		Tournoi t = new Tournoi(str, 20);
		t.startTournoi();
		
		
		
		
		
		
		/*Confrontation conf = new Confrontation();
		Confrontation[] vvv = {conf};
		t.setConfrontations(vvv);
		conf.Bataille(S1, S2);*/
	//	t.VisualiserResTournoi();

	}

}
