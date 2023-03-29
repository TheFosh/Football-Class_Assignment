package footBall;

/*
 * This is an object that simulates a foot ball play with a chance for the Referee
 * object to throw a flag on the play
 */
 
public class FootballGame {
	
	private Referee lineJudge;
	
	public FootballGame() {
		this.lineJudge = new Referee();
	}
	
	public void setLineJudge(Referee r){
		this.lineJudge = r;
	}
	
	
	//Simulates running a play in football
	public int runPlay(Play p) {
		System.out.println(p);
		
		try {
			this.lineJudge.watchPlay(); //Ref. object "watches the play" and possibly throws a flag
		} 
		catch(Flag f){
			System.out.println("!!! FLAG ON THE PLAY !!! " + f.getMessage() + " Replay Down.");
			
			return f.getYards();
		}
		
		return 0;
	}

}
