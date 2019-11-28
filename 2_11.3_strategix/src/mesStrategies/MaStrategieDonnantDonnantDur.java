package mesStrategies;

import strategies.Coup;
import strategies.IStrategy;

public class MaStrategieDonnantDonnantDur implements IStrategy {
	private static String nom="MaStrategieDonnantDonnantDur";
	
	
	public static  String getNom() {
		return nom;
	}
	
	public MaStrategieDonnantDonnantDur() {
	}
	@Override
	public Coup jouer(int nbTour,int score, Coup[] coup) {
		// TODO Auto-generated method stub
		if (nbTour==0) {
			return Coup.C;	
		} 
		else {
			if(coup[0]==Coup.T || coup[1]==Coup.T) {
				return Coup.T;
			}else {
				return Coup.C;
			}
		}
		
	}

}
