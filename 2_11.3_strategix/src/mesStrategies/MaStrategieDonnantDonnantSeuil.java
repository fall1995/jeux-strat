package mesStrategies;

import strategies.*;

public class MaStrategieDonnantDonnantSeuil implements IStrategy{
	private static String nom="MaStrategieDonnantDonnantSeuil";
	
	public static  String getNom() {
		return nom;
	}
	
	

	public MaStrategieDonnantDonnantSeuil() {
	}


	@Override
	public Coup jouer(int nbTour,int score, Coup[] coup) {
		// TODO Auto-generated method stub
		if (nbTour==0) {
			return Coup.C;	
		} 
		else if(nbTour+1 % 5 == 0) {
			int res = score/nbTour+1 ;
			if(res<2) {
				
				return Coup.N;
			}else {
				return coup[0];
			}
		}
		else {
			
			return coup[0];
		}
		
		
		
	}

}
