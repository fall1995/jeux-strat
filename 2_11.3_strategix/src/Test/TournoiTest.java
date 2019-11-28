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
	int nbTours = 2;
	Tournoi t = new Tournoi(str,nbTours);
	
	@Test
	void testStartTournoi() {
		ArrayList<Integer> test = new ArrayList<Integer>();
		test = t.getscore();
		int taille = test.size();
		Assert.assertNotSame(16,taille);
	}

	@Test
	void testStretegieCorespo() {
		IStrategy s1,s2,s3,s4;
		s1 = t.StretegieCorespo(1);
		s2 = t.StretegieCorespo(2);
		s3 = t.StretegieCorespo(6);
		s4 = t.StretegieCorespo(10);
		Assert.assertEquals("MaStrategieGentille", s1.getClass().getSimpleName());
	}

	@Test
	void testSomme() {
		t.startTournoi();
		int[] res =  {6,12};
		t.somme();
		Assert.assertEquals(res[0], t.sumScore[0]);
		Assert.assertEquals(res[1], t.sumScore[1]);
		//Assert.assertEquals(res[2], t.sumScore[2]);
		//Assert.assertEquals(res[3], t.sumScore[3]);
		//Assert.assertEquals(res[4], t.sumScore[4]);
		
	}

	@Test
	void testIndiceGagnant() {
		int[] res =  {6,12};
		t.startTournoi();
		t.somme();
		int ind = t.IndiceGagnant();
		Assert.assertEquals(1, ind);
	}

	@Test
	void testCorrespondance() {
		fail("Not yet implemented");
	}

	

	
}
