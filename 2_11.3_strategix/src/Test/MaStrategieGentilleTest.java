package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;
import mesStrategies.MaStrategieGentille;
import strategies.Coup;

class MaStrategieGentilleTest {
	MaStrategieGentille g = new MaStrategieGentille();
	@Test
	void testMaStrategieGentille() {
		Assert.assertNotSame(new MaStrategieGentille(), g);
	}

	@Test
	void testGetNom() {
		for (int i = 0; i < 10; i++) {

			String res = g.getNom();
			Assert.assertEquals("MaStrategieGentille", res);
		}
			}
	

	@Test
	void testJouer() {
		Coup[] c1 = {Coup.C, Coup.T};
		for (int i = 0; i < 10; i++) {
			Coup c = g.jouer(i,i,c1);
			Assert.assertEquals(Coup.C, c);
		}
	}

}
