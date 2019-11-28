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
	public ArrayList<Integer> score = new ArrayList<Integer>();
	public int[] sumScore;
	public IStrategy[] cor;
	
	
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
	
	
	public void Correspondance() {
		cor = new IStrategy[score.size()];
		int i =0;
		int strat = 0;
		int compt = 1;
		
		while( i<score.size() ) {
			
			cor[i]= strategies[strat];
			if(compt == strategies.length) {
				strat++;
				compt =1;
			}else {
			compt ++;
			}
			i++;
		}
	}
	
	   public void afficherTableauScore() {
		   Correspondance();
		   
	        int nbTiret = 30;
	        String barre = "|";
	        String plus = "+";
	        String tiret= "-";
	        for(int i = 0; i<nbTiret ; i++) {
	            System.out.print(" ");
	        }
	        System.out.print(barre);
	        for(int i = 0; i< this.strategies.length;i++) {
	            String s = this.strategies[i].getClass().getSimpleName();
	            int reste = nbTiret - s.length();
	            System.out.print(s);
	            for(int h = 0; h< reste ; h++) {
	                System.out.print(" ");
	            }
	            System.out.print(barre);
	        }
	        System.out.println("TOTAL");
	//-----------------------------------        
	        for(int i = 0; i<nbTiret ; i++) {
	            System.out.print(tiret);
	        }
	        System.out.print(plus);
	        for(int i = 0; i< this.strategies.length;i++) {
	            for(int j = 0; j< nbTiret;j++) {
	                System.out.print(tiret);
	            }
	            System.out.print(plus);
	        }
	        for(int j = 0; j< nbTiret;j++) {
	            System.out.print(tiret);
	        }
	        System.out.println();
	        
	        //---------------------------------
	        int c = 0;
	        int l = 0;
	        int sommeS=0;
	        for(IStrategy s : this.strategies) {
	            IStrategy sCourante = s;
	            String st = sCourante.getClass().getSimpleName();
	            int reste = nbTiret - st.length();
	            System.out.print(st);
	            for(int h = 0; h< reste ; h++) {
	                System.out.print(" ");
	            }
	            System.out.print(barre);
	            

	         while( (c<this.score.size()) &&(sCourante == this.cor[c])){
	        	 
	                String p = Integer.toString(this.score.get(c));
	                reste = nbTiret - p.length();
	                System.out.print(p);
	                for(int h = 0; h< reste ; h++) {
	                    System.out.print(" ");
	                }
	                System.out.print(barre);
	                c++;
	            }
	            
	            int total = 0;
	          /*  while(l<this.confrontations.size() && sCourante==this.confrontations.get(l).getS1()) {
	                total += this.confrontations.get(l).getPointS1();
	                l++;
	            }*/
	            
	            String points = Integer.toString(sumScore[sommeS]);
	            reste = nbTiret - points.length();
	            System.out.print(points);
	            sommeS++;
	            for(int h = 0; h< reste ; h++) {
	                System.out.print(" ");
	            }
	            
	            System.out.println();
	            
	            
	            for(int t = 0; t<nbTiret ; t++) {
	                System.out.print(tiret);
	            }
	            System.out.print(plus);
	            for(int x = 0; x< this.strategies.length;x++) {
	                for(int j = 0; j< nbTiret;j++) {
	                    System.out.print(tiret);
	                }
	                System.out.print(plus);
	            }
	            for(int j = 0; j< nbTiret;j++) {
	                System.out.print(tiret);
	            }
	            System.out.println();
	    }
	        
	    }
	
	
	public void setscore(int x) {
		score.add(x);
	}
	public ArrayList<Integer> getscore() {
		return score ;
	}
	
	
	
}
