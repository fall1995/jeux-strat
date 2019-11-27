package dilemme;

import strategies.*;


public class Confrontation {

	private Coup[] tabCoupA = {Coup.C,Coup.C};
	private Coup[] tabCoupB = {Coup.C,Coup.C};
	private  int scoreA ;
	private  int scoreB ;
/*	static int T = 5;
	static int D = 5;
	static int C = 5;
	static int P = 5;
	static int N = 5;*/
	
	
	public Confrontation() {
		
		this.scoreA =0;
		this.scoreB =0;
	//	initialiserScore(scoreA, scoreB);
	
	}
	
	public Coup[] getTabCoupA() {
		return tabCoupA;
	}
	
	public void setTabCoupA(Coup[] tabCoupA) {
		this.tabCoupA = tabCoupA;
	}
	
	public Coup[] getTabCoupB() {
		return tabCoupB;
	}
	
	public void setTabCoupB(Coup[] tabCoupB) {
		this.tabCoupB = tabCoupB;
	}
	
	public int getScoreA() {
		return scoreA;
	}

	public void setScoreA(int scoreA) {
		this.scoreA = scoreA;
	}


	// 
	public void Bataille(IStrategy A, IStrategy B) {
		for (int i = 0; i <Tournoi.nbTours ; i++) {
			
			Coup coupA = A.jouer(scoreA,tabCoupB);
			tabCoupA[1]=tabCoupA[0];
			tabCoupA[0]= coupA;
			Coup coupB = B.jouer(scoreB,tabCoupA);
			tabCoupB[1]=tabCoupB[0];
			tabCoupB[0]= coupB;
			//System.out.println(coupB );
			AttributionPoint(coupA,coupB);
			
		}
		
		}
	
	/*public static void MoiVSMoi() {
		for (int i = 0; i < Tournoi.nbTours; i++) {
	
			scoreA[0]=scoreA[0]+C;
			scoreB[0]=scoreB[0]+P;
		}
	}*/
	
public void AttributionPoint(Coup choix1, Coup choix2) {
	switch(choix1) {
	case C: 
		switch(choix2) {
			case C: 
				this.scoreA=scoreA+3;
				
				break;
		
			case T: 
				this.scoreA=scoreA+0;
				
				break;
			
			case N :
				this.scoreA=scoreA+2;
				
				break;
		
		}
		break;

	case T: 
		switch(choix2) {
			case C: 
				this.scoreA=scoreA+5;
				
				break;
		
			case T: 
				this.scoreA=scoreA+1;
				
				break;
				

			case N :
				this.scoreA=scoreA+2;
				
				break;
			
		
		}
		break;
	case N:
		this.scoreA=scoreA+2;
		break;

}

	
}

}