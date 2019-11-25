import java.util.Scanner;
import java.util.Random;
public class ROCK_PAPER_SCISSORS {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		// value 0 is what these variables will begin at.
		int CompScore = 0;
		int UserScore = 0;
		int Counter = 0;
		
		System.out.println("Hello, what is your name?");
		String name = scan.nextLine(); 
		// compchoice and userchoice is in the while loop because in every round we would like a new choice.
		while(Counter == 0) {
			int CompChoice = 1 + rand.nextInt(3);
			
			System.out.println("Hello, " + name + " Enter 1 for ROCK, 2 for PAPER, or 3 for SCISSORS:");
			int playerChoice = scan.nextInt();
			
			// when ever the player choice and comp choice are the same we have told the system to print out "It's a draw!"
			if (playerChoice == CompChoice) {
				System.out.println("It's a Draw!");
			}
			else if (playerChoice == 1) {
			   
			    	if (CompChoice == 2) {
					System.out.println("Computer selected paper");
					System.out.println("COMPUTER WON ");
					CompScore++;
					System.out.println("Computer : " + CompScore);
					System.out.println(name + ": " + UserScore );
					
			       }if (CompChoice == 3) {
					System.out.println("Computer selected scissors");
					System.out.println(name + "won");
					UserScore++;
					System.out.println("Computer : " + CompScore);
					System.out.println(name + ":" + UserScore);
				}
				
			}
		   else if (playerChoice == 2)
				
			   if (CompChoice == 1) {
					System.out.println("Computer selected rock");
				   	System.out.println(name + "won ");
					UserScore++;
					System.out.println("Computer : " + CompScore);
					System.out.println(name + ":" + UserScore);
					
				}if (CompChoice == 3) {
					System.out.println("Computer selected Scissors");
					System.out.println("Computer won");
					CompScore++;
					System.out.println("Computer : " + CompScore );
					System.out.println(name + ": " + UserScore);
				}
				else if (playerChoice == 3) {
					if (CompChoice == 1) {
						System.out.println("Computer selected rock");
						System.out.println("Computer won");
						CompScore++;
						System.out.println("Computer :" + CompScore );
						System.out.println(name + ": " + UserScore);
					}if (CompChoice == 2) {
						System.out.println("Computer selected paper");
						System.out.println(name + "won");
						UserScore++;
						System.out.println("Computer : " + CompScore);
						System.out.println(name + ":" + UserScore);
						
						
					}
					 if (UserScore == 3) {
					
						System.out.println("GAME OVER : " + name + ", YOU WON");
						Counter++;
						
				  }
					 if (CompScore == 3) {
						System.out.println("GAME OVER : COMPUTER WINS");
						Counter++;
						
					}
				
				
				}
		}
	
					
					
			
	}			
			
		   
		
	}

	