package dilemme;

import java.util.ArrayList;

import mesStrategies.MaStrategieDonnantDonnant;
import mesStrategies.MaStrategieDonnantDonnantDur;
import mesStrategies.MaStrategieDonnantDonnantSeuil;
import mesStrategies.MaStrategieGentille;
import mesStrategies.MaStrategieMechante;
import strategies.*;


public class Tournoi {
	private IStrategy[] strategies;
	public static int nbTours;
	private ArrayList<Integer> score = new ArrayList<Integer>();
	public int[] sumScore;
	public static int  somA=0;
	public static int  somB=0;
	
	
	
	public static int  somC=0;
	public static int  somD=0;
	
	public Tournoi(IStrategy[] strategies , int nbTours) {
		this.strategies= strategies;
		this.nbTours=nbTours;
		sumScore = new int[strategies.length];
		
	
	
	}
	
	public static IStrategy StretegieCorespo(int num){
		switch (num) {
		case 1:
			return new MaStrategieGentille();
			
		case 2:
			return new MaStrategieMechante();
		case 3:
			return new MaStrategieDonnantDonnant();
		case 4:
			return new MaStrategieDonnantDonnantDur();
		case 5:
			return new MaStrategieDonnantDonnantSeuil();
		case 6:
			return new StrategieGentille();
		case 7:
			return new StrategieMechante();

		default:
			break;
		}
		return null;
		
	}
 public void startTournoi() {
	 for(int i=0; i<strategies.length;i++) {
		 for(int j=0;j<strategies.length;j++) {
			Confrontation confrontation = new Confrontation();
			confrontation.Bataille(strategies[i], strategies[j]);
			score.add(confrontation.getScoreA());
			 
			 
		 }
	 }
 }
	
	public void somme() {
		int count = 0;
		System.out.println("taille score :"+ score.size());
		for (int i =0; i < strategies.length; i++) {
			for (int j = 0; j < strategies.length; j++) {
					sumScore[i] += score.get(count);
					count ++;
					
				}
				
			}

	}
	
	public int Gagnant() {
		int indic=0;
		for (int i = 0; i < sumScore.length; i++) {
			if (sumScore[i]>sumScore[indic]) {
				indic=i;
			}
			
		}
	return indic;
		
	}

	public void VisualiserResTournoi() {
		System.out.print("                                         ");
		for (int i = 0; i < strategies.length; i++) {
			System.out.print(strategies[i].getClass().getSimpleName()+"     ");
		}
		System.out.println();
		
		for (int i = 0; i < strategies.length; i++) {
			System.out.println(strategies[i].getClass().getSimpleName()+"     ");
			System.out.println();
		}
		/*
		somme();
		//afficher le tableau des confrontation et afficher le gagnants
		
		System.out.println("                      "+MaStrategieGentille.getNom()+"    "+MaStrategieMechante.getNom()+"    "+StrategieGentille.nomStrat+"    "+StrategieMechante.nomStrat+"    TOTAL");
		System.out.println();
		System.out.println(MaStrategieGentille.getNom()+"            "+score.get(0)+"                      "+score.get(1)+ "               "+score.get(2)+"           "+score.get(3)+"         "+somA);
		System.out.println();
		System.out.println(MaStrategieMechante.getNom()+"            "+score.get(4)+"                     "+score.get(5)+ "             "+score.get(6)+"          "+score.get(7)+"         "+somB);
		System.out.println();
		System.out.println(StrategieGentille.nomStrat+"                       "+score.get(8)+"                      "+score.get(9)+ "               "+score.get(10)+"           "+score.get(11)+"         "+somC);
		System.out.println();
		System.out.println(StrategieMechante.nomStrat+"                       "+score.get(12)+"                     "+score.get(13)+ "             "+score.get(14)+"          "+score.get(15)+"         "+somD);
		System.out.println();
		System.out.println("Strategie gagnante du tournoi : "+Gagnant());
		
		System.out.println();
		if (sumA>sumB) {
			System.out.println("Strategie gagnante du tournoi : "+strategies[0].getNom());
		} else {
			System.out.println("Strategie gagnante du tournoi : "+strategies[1].getNom());
		}
		
	}*/	

		}
	
	
	public void setscore(int x) {
		score.add(x);
	}
	public ArrayList<Integer> getscore() {
		return score ;
	}
	
	
	
}
