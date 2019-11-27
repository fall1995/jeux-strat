 package strategies;

import strategies.*;


public class MaStrategieMechante implements IStrategy{
	private static String nom="MaStrategieMechante";;
	public MaStrategieMechante() {

	}

	public static String getNom() {
		return nom;
	}

	@Override
	public Coup jouer(int score, Coup[] coup) {
		// TODO Auto-generated method stub
		return Coup.T;
	}
	
}
