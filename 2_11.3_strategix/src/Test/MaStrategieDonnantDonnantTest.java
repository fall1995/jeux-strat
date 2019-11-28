package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;
import mesStrategies.*;
import strategies.Coup;

class MaStrategieDonnantDonnantTest {
	MaStrategieDonnantDonnant dd = new MaStrategieDonnantDonnant();

	@Test
	void testGetNom() {
		for (int i = 0; i < 10; i++) {

			String res = dd.getNom();
			Assert.assertEquals("MaStrategieDonnantDonnant", res);
		}
			}

	@Test
	void testJouer() {
		
		Coup[] c = {Coup.T, Coup.C};
		Coup c1 = dd.jouer(0, 100, c);
		Coup c2 = dd.jouer(2, 100, c);
		Assert.assertEquals(Coup.C, c1);
		Assert.assertEquals(Coup.T, c2);
	}

}
