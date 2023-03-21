package footBall;
import java.util.Scanner;
import java.util.Random;

/**
 * This is the main driver that simulates a set of football downs
 * @author Dennis Schmidt
 */
public class Main {

   /**
    * Execute a set of downs, randomly select the result of each down
    * with a constructed Play object and ask FootballGame to run the Play
    */   
	public static void playDowns() {
		String[] gains = { "Offense passes the ball", "Offense runs the ball" };
		String[] losses = { "Defense sacks the quarterback", "Defense stuffs the run" };

		int down = 1;
		int yardsToGo = 10;
		FootballGame game = new FootballGame();
		Random random = new Random();

		while (down < 4 && yardsToGo > 0) {
			System.out.println("Down: " + down + ", " + yardsToGo + " to go for a first down");

			// construct a random Play
			int i = random.nextInt(2); // first decide if this is going to be a loss or a gain
			int yards = (i == 0 ? 1 : -1) * (random.nextInt(9)); // randomly select the yardarge of he play
			String description = (i == 0) ? gains[i] : losses[i];

			Play play = new Play(description, yards);
			int penaltyYards = game.runPlay(play); // use FootballGame to determine if there is any penalties
			if (penaltyYards != 0) {
				yardsToGo -= penaltyYards; // replay the down if there is a penalty
			} else {
				yardsToGo -= yards; // no penalty, adjust yards remaining for a first down
				down++;
			}
		}

		if (yardsToGo > 0) {
			System.out.println("Down: " + down + ", " + yardsToGo + ", the offense must punt");
		} else {
			System.out.println("The offense made a FIRST DOWN, move the chains!");
		}
	}

   /**
    * Main method with a rudimentary prompt loop to playDowns
    */ 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Are you ready for some FOOTBALL!!?");
		boolean quit = false;
		while (!quit) {
			System.out.print("Enter to (P)lay down or (Q)uit: ");
			String line = input.nextLine().toUpperCase();
			if(line.equals("P")) {
				playDowns();
			}
			else if (line.equals("Q")) {
				quit = true;
			}
			else {
				System.out.println("Bad input, please try again!");
			}
		}
		input.close();
		System.out.println("Goodbye.");
	}

}
