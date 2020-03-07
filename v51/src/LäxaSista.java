import java.util.Scanner;

public class LäxaSista {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int choice;
		int choice1 = 0;
		int choice2 = 0;
		int choice3 = 0;
		int choice4 = 0;
		int choice5 = 0;
		int choice6 = 0;

		do {
			System.out.println("Best Game Ever! - Open Beta");
			System.out.println("(1) - Continue");
			System.out.println("(2) - Load game");
			System.out.println("(3) - Options");
			System.out.println("(4) - Credits");
			System.out.println("(5) - Exit To Windows");
			System.out.println();

			choice = input.nextInt();

			switch (choice) {

			case 1:
				choice2 = 0;
				System.out.println("No Gamefile Found");
				System.out.println("(1) - New Gamefile");
				System.out.println("(2) - Go Back");
				System.out.println();

				choice6 = input.nextInt();

				switch (choice6) {

				case 1:
					System.out.println("Starting New Gamefile...");
					break;
					
				case 2:
					choice2 = 2;
					System.out.println();
					break;

				default:
					System.out.println("Unknown Kommand");
					System.out.println();
					choice2 = 2;
				}

			break;

			case 2:
				System.out.println("No Gamefile Found");
				System.out.println("(1) - New Game");
				System.out.println("(2) - Go Back");
				System.out.println();

				choice2 = input.nextInt();

				switch (choice2) {

				case 1:
					System.out.println("Starting New Game...");
					break;

				case 2:
					choice2 = 2;
					break;

				default:
					System.out.println("Unknown Kommand");
					System.out.println();
					choice2 = 2;

				}
				break;

			case 3:
				do {
					choice2 = 0;
					System.out.println("Options:");
					System.out.println("(1) - Video Settings");
					System.out.println("(2) - Audio Settings");
					System.out.println("(3) - Controlls");
					System.out.println("(4) - Go Back");
					System.out.println();

					choice5 = input.nextInt();
					switch (choice5) {

					case 1:

						System.out.println("Video Settings Are Not Available Yet Due to Open Beta");
						System.out.println();

						break;

					case 2:

						System.out.println("Audio Settings Are Not Available Yet Due to Open Beta");
						System.out.println();
						break;

					case 3:

						System.out.println("Customizable Controlls Are Not Available Yet Due to Open Beta");
						System.out.println();
						break;

					case 4:
						choice2 = 2;
						break;

					default:
						System.out.println("Unknown Kommand");
						System.out.println();
						choice2 = 2;

					}
					

				} while (choice5 != 4);
				break;

			case 4:
				choice2 = 3;
				System.out.println("Creative Director");
				System.out.println("Linus Lindström");
				System.out.println();
				System.out.println("Game Director");
				System.out.println("Linus Lindström");
				System.out.println();
				System.out.println("Art Director");
				System.out.println("Linus Lindström");
				System.out.println();
				System.out.println("Technical Director");
				System.out.println("Linus Lindström");
				System.out.println();
				System.out.println("(1) - Go Back");
				System.out.println();

				choice4 = input.nextInt();

				switch (choice4) {

				case 1:
					choice2 = 2;
					break;

				default:
					System.out.println("Unknown Kommand");
					System.out.println();
					choice2 = 2;

				}
				break;

			case 5:
				choice2 = 3;
				System.out.println("Shutting Down...");
				break;

			default:
				System.out.println("Unknown Kommand");
				System.out.println();
				choice2 = 2;

			}

		} while (choice2 == 2);
	}

}
