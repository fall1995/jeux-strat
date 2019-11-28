package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;
import mesStrategies.MaStrategieDonnantDonnantDur;
import mesStrategies.MaStrategieGentille;

class MaStrategieDonnantDonnantDurTest {
	MaStrategieDonnantDonnantDur strat = new MaStrategieDonnantDonnantDur();
	@Test
	void testGetNom() {
		for (int i = 0; i < 10; i++) {

			String res = g.getNom();
			Assert.assertEquals("MaStrategieDonnantDonnantDur", strat.getNom());
		}
	}

	@Test
	void testMaStrategieDonnantDonnantDur() {
		fail("Not yet implemented");
	}

	@Test
	void testJouer() {
		fail("Not yet implemented");
	}

}
