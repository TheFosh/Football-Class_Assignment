package footBall;

public class Flag extends Exception {
	
	private int yards;
	
	public Flag(String p, String s, int y) {
		
		super(p + " on the "+ s +" for "+ y +" yards.");
		this.yards = y;
	}
	
	public int getYards() {
		return this.yards;
	}
	
}
