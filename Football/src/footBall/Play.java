package footBall;

public class Play {
	
	private int yards;
	private String decription;
	
	public Play(String des, int y) {
		this.yards = y;
		this.decription = des;
	}
	
	public String toString() {
		String message = this.decription;
		
		//Checks if the yards is a loss or gain depending if the amount is pos. or neg.
		if(yards > 0) {
			message += " a gain " + this.yards + " yards";
		}
		else if (yards < 0) {
			message += " a loss " + this.yards + " yards";
		}
		else {
			message += " no gain " + this.yards;
		}
		
		return message;
	}
}
