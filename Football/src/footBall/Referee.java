package footBall;

public class Referee {
	private int flags;
	
	public Referee() {
		this.flags = 2;
	}
	
	public void watchPlay() throws Flag {
		
		int r = (int)(Math.random() * 5 +1);
		
		if(this.flags != 0) {
			
			if(r == 1) {
				this.flags--;
				throw new Flag("Holding", "Offence", -10); //Holding penalty
			}
			
			else if (r == 2) {
				this.flags--;
				throw new Flag("Offsides", "Defence", 5); //Offsides penalty
			}
		}
	}
}
