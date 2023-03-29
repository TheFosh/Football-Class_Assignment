package footBall;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PlayTest {

	/*
	 * Running tests on the toString method of Play objects 
	 * to test if they are accurate to how they are supposed to be.
	 */
	@Test
	void test() {
		
		//Tests if the gain section works
		Play testPlayOffence = new Play("Offense passes the ball", 10);
		
		String t1 = testPlayOffence.toString();
		
		assertEquals(t1, "Offense passes the ball for a gain of 10 yards");
		
		//Tests if the loss section works
		Play testPlayDefence = new Play("Defense stuffs the run", -5);
		
		String t2 = testPlayDefence.toString();
		
		assertEquals(t2, "Defense stuffs the run for a loss of -5 yards");
		
		//Tests if the no gain section works
		Play testPlayOffenceNone = new Play("Offense passes the ball", 0);
		
		String t3 = testPlayOffenceNone.toString();
		
		assertEquals(t3, "Offense passes the ball for no gain");
		
		//Tests if the no gain section works
		Play testPlayDefenceNone = new Play("Defense stuffs the run", 0);
		
		String t4 = testPlayDefenceNone.toString();
		
		assertEquals(t4, "Defense stuffs the run for no gain");
		
	}

}
