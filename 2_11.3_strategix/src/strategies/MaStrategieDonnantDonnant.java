package strategies;

public class MaStrategieDonnantDonnant implements IStrategy {

	private static String nom ="MaStrategieDonnantDonnant";
	private int nbTour;
	
	public static  String getNom() {
		return nom;
	}
	public MaStrategieDonnantDonnant() {
		nbTour=1;
	}

	@Override
	public Coup jouer(int score, Coup[] coup) {
		if (nbTour==1) {
			nbTour++;
			return Coup.C;
		}
		else {
			nbTour++;
			return coup[0];
		}
	}

}
