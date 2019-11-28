package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dilemme.Confrontation;
import dilemme.Tournoi;
import junit.framework.Assert;
import strategies.*;
import mesStrategies.*;

class ConfrontationTest {
	Confrontation conf = new Confrontation();

	
	@Test
	void testAttributionPoint() {
		int[] score = {5};
		conf.AttributionPoint(Coup.T, Coup.C);
		Assert.assertEquals(score[0], conf.getScoreA());
	}
	
	//cette methode prend deux strategie, recupere leurs coup pour chaque  et fais la bataille le nombre de fois nbtour et stock
	// chaque resultat du tour dans la variable scoreA, cette variable scoreA est ecrasé a chaque tour
	// du coup la je vais tester le contenu de scoreA pour nbtour= 1 et nbtour =2
	@Test
	void testBataille() {
		Coup[] c=null;
		IStrategy s1 = new MaStrategieGentille();
		IStrategy s2 = new MaStrategieMechante();
		Coup s11 = s1.jouer(0,10, c);
		Coup s22 = s2.jouer(0,10,c);
		
		//test s'il nous renvois les bon coup	
		Assert.assertEquals(Coup.C, s11);
		Assert.assertEquals(Coup.T, s22);
		
		// Tester le contenu de scoreA chaque tour	
		Tournoi.nbTours= 1;
		int scoreRes = 0; 
		conf.Bataille(s1, s2);
		Assert.assertEquals(conf.getScoreA(), scoreRes);
		Tournoi.nbTours= 2;
		int scoreRes2 = 0; 
		Assert.assertEquals(conf.getScoreA(), scoreRes2);
	}


	

	@Test
	void testSetTabCoupA() {
		Coup[] c = {Coup.C, Coup.T};
		conf.setTabCoupA(c);
		Assert.assertEquals(conf.getTabCoupA(), c);
		
	}

	
	@Test
	void testGetTabCoupA() {
		Assert.assertEquals(conf.tabCoupA[0], Coup.C);
		Assert.assertEquals(conf.tabCoupA[1], Coup.C);	
	}

	
	@Test
	void testGetScoreA() {
		int res = conf.getScoreA();
		Assert.assertEquals(0, res);
	}

	@Test
	void testSetScoreA() {
	conf.setScoreA(20);
	int score = conf.getScoreA();
	Assert.assertEquals(20, score);
	}

	

	
	

	
}
