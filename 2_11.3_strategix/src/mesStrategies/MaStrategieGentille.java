package mesStrategies;

import strategies.*;


public class MaStrategieGentille implements IStrategy{
private static String nom="MaStrategieGentille";
	
	public MaStrategieGentille() {
	}

	// Actuellement Gentille ne se sert pas du tableau car son choix ne depend pas de celui fais par l'autre joueur
	
	
	public static  String getNom() {
		return nom;
	}
	
	@Override
	public Coup jouer(int score, Coup[] coup) {
		// TODO Auto-generated method stub
		return Coup.C;
	}
	

}
