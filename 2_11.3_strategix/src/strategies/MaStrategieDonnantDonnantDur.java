package strategies;

public class MaStrategieDonnantDonnantDur implements IStrategy {
	private static String nom="MaStrategieDonnantDonnantDur";
	
	private int nbTour;
	public static  String getNom() {
		return nom;
	}
	
	public MaStrategieDonnantDonnantDur() {
		this.nbTour = 1;
	}
	@Override
	public Coup jouer(int score, Coup[] coup) {
		// TODO Auto-generated method stub
		if (nbTour==1) {
			nbTour++;
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
