import java.util.Random;
import java.util.Scanner;

public class Spelet {

	static Scanner input = new Scanner(System.in);				//L�gger till variabler som ska finnasi hela programmet. 
	static int start = 0;
	static int slut = 100;
	static int guesses = 10;
	static int numret = f�rstaTal();
	static int cont = 1;											//L�gger till en del variablar


	public static void main(String[] args) {

		meny();													//Kallar p� metoden meny()
	}

	/**
	 * Ger spelet ett startv�rde s� om du inte skiver in ditt intervall s� skapasett slupat tal mellan 1 och 100.
	 * 
	 * @return numret
	 */
	private static int f�rstaTal() {

		Random randomNumber = new Random();						//Skapar en ny variabel av typen Random med namn randomNumber
		numret = randomNumber.nextInt(slut - start) + start;	//Definerar randomNumber med start och slutv�rde och s�er att det �r v�rdet p� numret 
		return numret;											//Skickar tillbaka numret
	}

	/**
	 * Skapar en meny d�r anv�ndaren f�r �ndra spelinst�llningar och starta eller
	 * st�nga ner spelet.
	 */
	private static void meny() {

		int choice = 1;
		int choice2 = 0;
		int guessChoice = 0;
		int gissningar = 10;

		System.out.println("Welcome To The Ultimate Numbergame!");
		System.out.println("Change Guesses Your Interval And Then Press (3) to Start");

		do {

			startAlternativ();									//Kallar p� metoden startAlternayiv()

			choice = tryGetNumber();							//Kollar s� det inte blir fel n�r man skriver in v�rdet
			
			switch (choice) {									//choice avg�r vilket av f�ljande 4 val som aktiveras
			case 1:

				antalGissningar(gissningar, guessChoice);		//Kallar p� metoden antalGissningar() och skickar med 2 variabler

				break;

			case 2:											

				numret = intervallet(choice2, numret);			//Numret �r lika med vad metoden intervallet() returnerar

				break;

			case 3:												//Kallar p� metoden startaOchAvsluta() och skckar med 2 variabler

				startaOchAvsluta(numret);

				break;
				

			case 4:												//Avslutar programmet
				System.out.println();
				System.out.println("Shutting Down...");
				cont = 0;
			}

		} while (cont == 1); 									//K�r om programet om cont fortfarande �r lika med 1
	

	}

	/**
	 * Skriver ut startalternativen och antal gissningar och vart intervallet �r
	 * 
	 * @param gissningar
	 */
	private static void startAlternativ() {
		System.out.println();
		System.out.println("(1) - Guesses (" + guesses + ")");
		System.out.println("(2) - Interval (" + start + "-" + slut + ")");
		System.out.println("(3) - Play Game");
		System.out.println("(4) - Exit Game");
	}

	/**
	 * Ger anv�ndaren m�jlighet att skriva in och �ndra antal gissningar
	 * 
	 * @param gissningar
	 * @param guessChoice
	 */
	private static int antalGissningar(int gissningar, int guessChoice) {

		System.out.println();
		System.out.println("(1) - Select the number of guesses");
		System.out.println("(2) - Go Back");
		guessChoice = tryGetNumber();							//Kollar s� det inte blir fel n�r man skriver in v�rdet

		switch (guessChoice) {
		case 1:
			System.out.println();

			determineGuesses();									//Kallar p� metoden determineGuesses()

		case 2:
			break;
		}
		return guesses;
	}

	/**
	 * Ger anv�daren m�jlighet att skriva in start- och slut- v�rden p� intervallet
	 * 
	 * @param choice2
	 * @param numret
	 */
	private static int intervallet(int choice2, int numret) {
		System.out.println();
		System.out.println("(1) - Select Your Interval");
		System.out.println("(2) - Go Back");

		choice2 = tryGetNumber();								//Kollar s� det inte blir fel n�r man skriver in v�rdet

		switch (choice2) {
		case 1:

			int hiddenNumber = randomNumber();					//Fixar v�rdet p� talet som anv�ndaren ska gissa
			numret = hiddenNumber;

			break;

		case 2:
			break;

		}
		return numret;
	}

	/**
	 * Startar och/eller avslutar spelet
	 * 
	 * @param gissningar
	 * @param numret
	 * @param cont
	 */
	private static int startaOchAvsluta(int numret) {
		System.out.println();
		System.out.println("The Game Is Starting ");
		game(numret);											//Sj�lva spelet startar och k�rs

		
		System.out.println("Do You Want To Play Again?");
		System.out.println("(1) - Yes");
		System.out.println("(2) - No");

		int contChoice;
		contChoice = tryGetNumber();							//Kollar s� det inte blir fel n�r man skriver in v�rdet

		switch (contChoice) {

		case 1:

			System.out.println();
			System.out.println("Change The Amount Of Gusses And The Intervall To Play With Different Gamesettings");
			start = 0;											// 	\
			slut = 100;											//	 Om du startar om nollst�ller det spelinst�llningarna 
			f�rstaTal();										//  /
			guesses= 10;										// /
			break;

		case 2:
			System.out.println();
			System.out.println("Shutting Down...");
			cont = 0;											//Avslutar do(while) loopen genom att g�ra cont = 0. Den forts�tter om cont = 1		
			break;
		}
		return numret;
	}

	/**
	 * Anv�ndaren best�mmer antal gissningar
	 * 
	 * @return
	 */
	private static int determineGuesses() {

		System.out.println("Choose How Many Guesses You Want");
		guesses = tryGetNumber(); 							//Kollar s� det inte blir fel n�r man skriver in v�rdet

		System.out.println();
		System.out.println("You Now Have " + guesses + " Guesses To Guess Right!");

		return guesses;
	}

	/**
	 * Slumpar ett ta mellan det givna intervallet
	 * 
	 * @return
	 */
	private static int randomNumber() {

		System.out.println();
		System.out.println("Where Should Your Interval Begin?");
		start = tryGetNumber();								//Kollar s� det inte blir fel n�r man skriver in v�rdet

		System.out.println();
		System.out.println("Where Should Your Interval Stop?");
		slut = tryGetNumber();								//Kollar s� det inte blir fel n�r man skriver in v�rdet

		if (slut < start) {									//G�r ett rekursivt anrop ifall slutet p� intervallet �r mindre �n b�rjan av intervallet.

			System.out.println();
			randomNumber(); 								

		}

		System.out.println();
		System.out.println("The Number That You Will Guess Is In Between " + start + " And " + slut);

		Random randomNumber = new Random();
		int hiddenNumber = randomNumber.nextInt(slut - start) + start; //Slumpar ett tal mellan de givna talet som anv�ndaren skrivit in. 

		return hiddenNumber; 

	}

	/**
	 * Tar in antalet m�jliga gissningar och det slumpade talet som ska gissas och
	 * j�mf�r gissningen med talet och skriver om du vann eler f�rlorade.
	 * 
	 * @param gissningar
	 * @param numret
	 * @return
	 */
	private static int game(int numret) {

		System.out.println();
		System.out.println("You Have " + guesses + " Guesses ");

		System.out.println("Start Guessing!");
		for (int i = 1; i <= guesses; i++) {					//Skapar en for-loop som k�rs s�l�nge antal g�nger loopen k�rts �rmindre �n antalet gissningar anv�ndaren har 
			int dinGissning;
			dinGissning = tryGetNumber();
			System.out.println();

			if (dinGissning == numret) {						//Om gissningen �r r�tt s� skriver programmet ut att hen vann
				System.out.println("!!!!!!You Won!!!!!!");
				System.out.println();
				break;
			} else if (dinGissning > numret) {					//Om gissningen �r st�rre �n det slumpade alet s� skriver programmet ut att gissningen var f�r h�g 
				System.out.println("You Guessed To High...");
				System.out.println("Try Again");
				System.out.println();
			} else if (dinGissning < numret) {					//Om gissningen �r mindre �n det slumpade alet s� skriver programmet ut att gissningen var f�r l�g 
				System.out.println("You Guessed To Low...");
				System.out.println("Try Again");
				System.out.println();
			}

			int kvar = guesses - i;								//R�knar ut hur m�nga gissningar som finns kvar 

			if (kvar != 1) {									//If-sats som avg�r om den ska skriva guesses eller guess
				System.out.println("You Have " + kvar + " Guesses Left");
			} else {
				System.out.println("You Have " + kvar + " Guess Left");
			}

			if (kvar == 0) {									//If-sats som abg�r om kvar=0, om det �t det s� st�r det att du f�rlorade och det slumpade talet skrivs ut
				System.out.println("You Lost");
				System.out.println("The Number Was " + numret + "...");
				System.out.println();

			}
		}
		return 0;
	}

	/**
	 * Letar efter fel. Om det blir ett fel n�r det skrivs in ett tal s� r�ttar denna metoden det och ger anv�ndaren m�jligheten att skriva igen
	 * @return output
	 */
	private static int tryGetNumber() {
		int output;
		while (true) {
			try {										//Kollar om det uppst�r fel inom try satsen
				output = input.nextInt();
				input.nextLine();
				break;
			} catch (Exception e) {						//Om det uppstod fel inom try s� kommer den r�ta felet s� programmet nite krashar, och du f�r m�jligheten att f�rs�ka igen. 
				input.nextLine();
				System.out.println();
				System.out.println("Write An Integer Please");
			}
		}
		return output;
	}
}
