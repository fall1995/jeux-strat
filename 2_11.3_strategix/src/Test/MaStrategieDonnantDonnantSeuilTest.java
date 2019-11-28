package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;
import mesStrategies.MaStrategieDonnantDonnantDur;
import mesStrategies.MaStrategieDonnantDonnantSeuil;
import strategies.Coup;

class MaStrategieDonnantDonnantSeuilTest {
	MaStrategieDonnantDonnantSeuil strat = new MaStrategieDonnantDonnantSeuil();
	@Test
	void testGetNom() {
		for (int i = 0; i < 10; i++) {

			String res = strat.getNom();
			Assert.assertEquals("MaStrategieDonnantDonnantSeuil", res);
		}
	}

	

	@Test
	void testJouer() {
		Coup[] c = {Coup.T, Coup.C};
		Coup[] b = {Coup.C, Coup.T};
		Coup[] a = {Coup.N, Coup.T};
		
		Coup c1 = strat.jouer(0, 100, c);
		Coup c2 = strat.jouer(2, 100, c);
		Coup c3 = strat.jouer(16, 100000900, b);
		Coup c4 = strat.jouer(6, 900, a);
		Coup c5 = strat.jouer(9, 1, c);
		//Assert.assertEquals(Coup.C, c1);
		//Assert.assertEquals(Coup.T, c2);
		//Assert.assertEquals(Coup.C, c3);
		//Assert.assertEquals(Coup.N, c4);
		Assert.assertEquals(Coup.T, c5);
		
	}

}
