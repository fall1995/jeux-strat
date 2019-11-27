package strategies;

import strategies.*;

public class MaStrategieDonnantDonnantSeuil implements IStrategy{
	private static String nom="MaStrategieDonnantDonnantSeuil";
	private int nbTour;
	public static  String getNom() {
		return nom;
	}
	
	

	public MaStrategieDonnantDonnantSeuil() {
		this.nbTour = 1;
	}


	@Override
	public Coup jouer(int score, Coup[] coup) {
		// TODO Auto-generated method stub
		if (nbTour==1) {
			nbTour++;
			return Coup.C;	
		} 
		else if(nbTour % 5 == 0) {
			int res = score/nbTour ;
			if(res<2) {
				nbTour++;
				return Coup.N;
			}
		}
		else {
			nbTour++;
			return coup[0];
		}
		
		
		return null;
	}

}
