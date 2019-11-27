package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;
import strategies.Coup;
import strategies.MaStrategieGentille;

class GentilleTest {
	MaStrategieGentille g = new MaStrategieGentille();
	@Test
	void testGentille() {
		Assert.assertNotSame(new MaStrategieGentille(), g);
	}

	@Test
	void testJouer() {
		Coup[] c1 = {Coup.C, Coup.T};
		for (int i = 0; i < 10; i++) {
			Coup c = g.jouer(c1);
			Assert.assertEquals(Coup.C, c);
		}
	
		
	}

	@Test
	void testGetNom() {
for (int i = 0; i < 10; i++) {

	String res = g.getNom();
	Assert.assertEquals("Gentille", res);
}
	}

}
