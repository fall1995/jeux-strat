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
		Coup[] b = {Coup.C, Coup.T};
		Coup[] a = {Coup.N, Coup.T};
		
		Coup c1 = dd.jouer(0, 100, c);
		Coup c2 = dd.jouer(2, 100, c);
		Coup c3 = dd.jouer(16, 100000900, b);
		Coup c4 = dd.jouer(6, 900, a);
		Assert.assertEquals(Coup.C, c1);
		Assert.assertEquals(Coup.T, c2);
		Assert.assertEquals(Coup.C, c3);
		Assert.assertEquals(Coup.N, c4);
	}

}
