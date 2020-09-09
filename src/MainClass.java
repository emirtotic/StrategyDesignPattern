import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int option;

		try {

			do {

				System.out.println("Chose 1 for Basketball team !");
				System.out.println("Chose 2 for Football team !");
				System.out.println("Chose 3 for Hockey team !");
				System.out.println("Chose 4 for Strategy design pattern explanation and instructions!");
				System.out.print("\nEnter your choice: ");
				
				option = sc.nextInt();

			} while (option != 1 && option != 2 && option != 3 && option != 4);

			if (option == 1) {

				System.out.println("Enter your basketball team name and 3 players from that it.\n");

				BasketballTeam team = new BasketballTeam();

				team.getList();

			}

			else if (option == 2) {

				System.out.println("Enter your football team name and 3 players from that it.\n");

				FootballTeam team = new FootballTeam();

				team.getList();

			} else if (option == 3) {

				System.out.println("Enter your hockey team name and 3 players from that it.\n");

				HockeyTeam team = new HockeyTeam();

				team.getList();

			} else if (option == 4) {

				System.out.println("\nThe strategy pattern is a behavioral software design pattern that enables selecting \n"
								 + "an algorithm at runtime. Instead of implementing a single algorithm directly, code \n"
								 + "receives run-time instructions as to which in a family of algorithms to use!");

				System.out.println("\nSteps for the implementation: \n");

				System.out.println("1. Create the interface,");
				System.out.println("2. Create classes that implements that interface,");
				System.out.println("3. Create the separate class to handle behaviour when we use different classes.");

			}

			else {
				// This is unreachable part of the code because of do while loop !
			}

			sc.close();

		} catch (Exception e) {
			System.out.println("\nYou must enter number 1, 2 or 3 to choose an option!\n".toUpperCase());
		}

	}

}
