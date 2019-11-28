package mesStrategies;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;
import mesStrategies.*;

class MaStrategieDonnantDonnantTest {
	MaStrategieDonnantDonnant dd = new MaStrategieDonnantDonnant();

	@Test
	void testGetNom() {
		for (int i = 0; i < 10; i++) {

			String res = dd.getNom();
			Assert.assertEquals("Gentille", res);
		}
			}

	

	@Test
	void testMaStrategieDonnantDonnant() {
		fail("Not yet implemented");
	}

	@Test
	void testJouer() {
		fail("Not yet implemented");
	}

}
