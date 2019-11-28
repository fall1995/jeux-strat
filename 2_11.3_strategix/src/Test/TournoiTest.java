package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import dilemme.Tournoi;
import junit.framework.Assert;
import mesStrategies.MaStrategieGentille;
import mesStrategies.MaStrategieMechante;
import strategies.IStrategy;

class TournoiTest {
	IStrategy S1 = new MaStrategieGentille() ;
	IStrategy S2 = new MaStrategieMechante() ;
	IStrategy[] str = {S1,S2};
	int nbTours = 25;
	Tournoi t = new Tournoi(str,nbTours);
	
	@Test
	void testTournoi() {
		Assert.assertNotSame(new MaStrategieMechante(), t);
	}

	@Test
	void testStartTournoi() {
		ArrayList<Integer> test = new ArrayList<Integer>();
		test = t.getscore();
		int taille = test.size();
		Assert.assertNotSame(16,taille);
	}

	@Test
	void testSomme() {
		int n ;
		for (int i=0;i<16;i++) {
			t.setscore(i);
		}
		t.somme();
		Assert.assertEquals(6,t.getSomA());
		Assert.assertEquals(22,t.getSomB());
		Assert.assertEquals(38,t.getSomC());
		Assert.assertEquals(54,t.getSomD());
		
	}

	@Test
	void testGagnant() {
	Tournoi.somA = 10;
	Tournoi.somB = 9;
	Tournoi.somC = 8;
	Tournoi.somD = 7;
	String res =t.Gagnant();
	Assert.assertEquals("Gentille",res);
	
	Tournoi.somA = 9;
	Tournoi.somB = 10;
	Tournoi.somC = 8;
	Tournoi.somD = 7;
	res =t.Gagnant();
	Assert.assertEquals("Mechante",res);	
	
	Tournoi.somA = 9;
	Tournoi.somB = 8;
	Tournoi.somC = 10;
	Tournoi.somD = 7;
	res =t.Gagnant();
	Assert.assertEquals("Gentille",res);
	
	Tournoi.somA = 9;
	Tournoi.somB = 7;
	Tournoi.somC = 8;
	Tournoi.somD = 10;
	res =t.Gagnant();
	Assert.assertEquals("Mechante",res);
	}
	
	

}
