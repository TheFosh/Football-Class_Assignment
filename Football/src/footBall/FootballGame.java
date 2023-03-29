package footBall;

public class FootballGame {
	
	private Referee lineJudge;
	
	public FootballGame() {
		this.lineJudge = new Referee();
	}
	
	public void setLineJudge(Referee r){
		this.lineJudge = r;
	}
	
	
	//Simulates running a play in football
	//Uses the ref. object to "watch the play" and possibly throw a flag
	public int runPlay(Play p) {
		System.out.println(p);
		
		try {
			this.lineJudge.watchPlay();
		} 
		catch(Flag f){
			System.out.println("!!! FLAG ON THE PLAY !!! " + f.getMessage() + " Replay Down.");
			
			return f.getYards();
		}
		
		return 0;
	}

}
