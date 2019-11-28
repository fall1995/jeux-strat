package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;
import mesStrategies.MaStrategieMechante;
import strategies.Coup;

class MechanteTest {
	MaStrategieMechante m = new MaStrategieMechante();
	
	@Test
	void testMechante() {
		Assert.assertNotSame(new MaStrategieMechante(), m);
	}
	@Test
	void testJouer() {
		Coup[] c1 = {Coup.C, Coup.T};
		for (int i = 0; i < 10; i++) {
			Coup c = m.jouer(c1);
			Assert.assertEquals(Coup.T, c);
		}
	
		
	}

	@Test
	void testGetNom() {
for (int i = 0; i < 10; i++) {

	String res = m.getNom();
	Assert.assertEquals("Mechante", res);
}
	}

}
