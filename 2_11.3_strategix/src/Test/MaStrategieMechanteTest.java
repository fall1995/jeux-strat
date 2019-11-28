package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;
import mesStrategies.MaStrategieMechante;
import strategies.Coup;

class MaStrategieMechanteTest {
	MaStrategieMechante m = new MaStrategieMechante();
	@Test
	void testMaStrategieMechante() {
		Assert.assertNotSame(new MaStrategieMechante(), m);
	}

	@Test
	void testGetNom() {
		for (int i = 0; i < 10; i++) {

			String res = m.getNom();
			Assert.assertEquals("MaStrategieMechante", res);
		}
	}

	@Test
	void testJouer() {
		Coup[] c1 = {Coup.C, Coup.T};
		for (int i = 0; i < 10; i++) {
			Coup c = m.jouer(i,i,c1);
			Assert.assertEquals(Coup.T, c);
		}
	}

}
