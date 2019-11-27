package dilemme;

import java.util.ArrayList;

import strategies.*;


public class Tournoi {
	private IStrategy[] strategies;
	public static int nbTours;
	private ArrayList<Integer> score = new ArrayList<Integer>();
	int[] sumScore;
	//private Confrontation[] confrontations;
	public static int  somA=0;
	public static int  somB=0;
	
	
	public static int  somC=0;
	public static int  somD=0;
	
	public Tournoi(IStrategy[] strategies , int nbTours) {
		this.strategies= strategies;
		//confrontations = new Confrontation[];
		this.nbTours=nbTours;
		sumScore = new int[strategies.length];
		
	
	
	}
	
	static IStrategy StretegieCorespo(int num){
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
	
	public String Gagnant() {
		int res1= Math.max(somA, somB);
		int res2 = Math.max(somC, somD);
		int max = Math.max(res1, res2);
		if (max == somA) {
			return MaStrategieGentille.getNom();
		}else if (max == somB) {
			return MaStrategieMechante.getNom();
		} else if (max == somC) {
			return StrategieGentille.nomStrat;
		} else if (max == somD) {
			return StrategieMechante.nomStrat;
		} else 
		return null;
		
	}

	public void VisualiserResTournoi() {
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
		/*
		System.out.println();
		if (sumA>sumB) {
			System.out.println("Strategie gagnante du tournoi : "+strategies[0].getNom());
		} else {
			System.out.println("Strategie gagnante du tournoi : "+strategies[1].getNom());
		}
		
	}*/	

		}
	
	public static int getSomA() {
		return somA;
	}
	public static int getSomB() {
		return somB;
	}
	public static int getSomC() {
		return somC;
	}
	public static int getSomD() {
		return somD;
	}
	public void setscore(int x) {
		score.add(x);
	}
	public ArrayList<Integer> getscore() {
		return score ;
	}
	
	public static void setSomA(int somA) {
		Tournoi.somA = somA;
	}
	public static void setSomB(int somB) {
		Tournoi.somB = somB;
	}
	public static void setSomC(int somC) {
		Tournoi.somC = somC;
	}
	public static void setSomD(int somD) {
		Tournoi.somD = somD;
	}
	
	
}
