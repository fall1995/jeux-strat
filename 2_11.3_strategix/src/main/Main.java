package main;

import java.util.ArrayList;
import java.util.Scanner;

import dilemme.Tournoi;
import mesStrategies.MaStrategieDonnantDonnant;
import mesStrategies.MaStrategieDonnantDonnantDur;
import mesStrategies.MaStrategieDonnantDonnantSeuil;
import mesStrategies.MaStrategieGentille;
import mesStrategies.MaStrategieMechante;
import strategies.Coup;
import strategies.IStrategy;
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
		System.out.println("6 - StrategieGentille");
		System.out.println("7 - StrategieMechante");
		System.out.println("8 - StrategieDonnantDonnant");
		System.out.println("9 - StrategieDonnantDonnantDur");
		System.out.println("10 -StrategieDonnantDonnantSeuil");
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
		System.out.println("-----------------");
		for (int i = 0; i < t.score.size(); i++) {
			System.out.println(t.score.get(i));
		}
		
		
		/*int guagn= t.Gagnant();
		System.out.println("strategie gagnate "+ strateg[guagn].getClass().getSimpleName());
		System.out.println();
		t.VisualiserResTournoi();*/
		

	}

}
