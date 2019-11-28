package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;
import mesStrategies.MaStrategieDonnantDonnantDur;
import mesStrategies.MaStrategieGentille;
import strategies.Coup;

class MaStrategieDonnantDonnantDurTest {
	MaStrategieDonnantDonnantDur strat = new MaStrategieDonnantDonnantDur();
	@Test
	void testGetNom() {
		for (int i = 0; i < 10; i++) {

			String res = strat.getNom();
			Assert.assertEquals("MaStrategieDonnantDonnantDur", res);
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
		Assert.assertEquals(Coup.C, c1);
		Assert.assertEquals(Coup.T, c2);
		Assert.assertEquals(Coup.T, c3);
		Assert.assertEquals(Coup.T, c4);
	}

}
