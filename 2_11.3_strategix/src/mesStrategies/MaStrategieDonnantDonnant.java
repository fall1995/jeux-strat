package mesStrategies;

import strategies.Coup;
import strategies.IStrategy;

public class MaStrategieDonnantDonnant implements IStrategy {

	private static String nom ="MaStrategieDonnantDonnant";
	
	
	public static  String getNom() {
		return nom;
	}
	public MaStrategieDonnantDonnant() {
	}

	@Override
	public Coup jouer(int nbTour,int score, Coup[] coup) {
		if (nbTour==0) {
			return Coup.C;
		}
		else {
			return coup[0];
		}
	}

}
