import java.util.Scanner;

public class SwitchCase2 {

	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		int choice1 = 0;
		int choice2 = 0;
		
		
		
		do { //Gör en loop som först körs en gång och sedan kollar om den ska köras igen eller om den ska avslutas.
		
			System.out.println("Welcome");  //Skriver ut 5 olika val. 
			System.out.println("(1) - ");
			System.out.println("(2) - ");
			System.out.println("(3) - ");
			System.out.println("(4) - ");
			System.out.println("(5) - ");
			
			choice1= input.nextInt();
			
			switch (choice1) {
			case 1:
				
				System.out.println("(1) - ");
				System.out.println("(2) - ");
				System.out.println("(3) - ");
				System.out.println("(4) - ");
				System.out.println("(5) - ");
				
				do {
				switch (choice2) {
				case 1:
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;

				default:
					break;
				}
				
			}while(choice2!=4);
				
				break;
				
			case 2:
				
				break;
			
			case 3:
				
				break;
			
			case 4:
				
				break;
			
			case 5:
				
				break;

			default:
				
				
			}
			
		}while (choice1!=5);
		
		
	}
}
