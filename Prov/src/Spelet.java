import java.util.Random;
import java.util.Scanner;

public class Spelet {

	static Scanner input = new Scanner(System.in);				//Lägger till variabler som ska finnasi hela programmet. 
	static int start = 0;
	static int slut = 100;
	static int guesses = 10;
	static int numret = förstaTal();
	static int cont = 1;											//Lägger till en del variablar


	public static void main(String[] args) {

		meny();													//Kallar på metoden meny()
	}

	/**
	 * Ger spelet ett startvärde så om du inte skiver in ditt intervall så skapasett slupat tal mellan 1 och 100.
	 * 
	 * @return numret
	 */
	private static int förstaTal() {

		Random randomNumber = new Random();						//Skapar en ny variabel av typen Random med namn randomNumber
		numret = randomNumber.nextInt(slut - start) + start;	//Definerar randomNumber med start och slutvärde och säer att det är värdet på numret 
		return numret;											//Skickar tillbaka numret
	}

	/**
	 * Skapar en meny där användaren får ändra spelinställningar och starta eller
	 * stänga ner spelet.
	 */
	private static void meny() {

		int choice = 1;
		int choice2 = 0;
		int guessChoice = 0;
		int gissningar = 10;

		System.out.println("Welcome To The Ultimate Numbergame!");
		System.out.println("Change Guesses Your Interval And Then Press (3) to Start");

		do {

			startAlternativ();									//Kallar på metoden startAlternayiv()

			choice = tryGetNumber();							//Kollar så det inte blir fel när man skriver in värdet
			
			switch (choice) {									//choice avgör vilket av följande 4 val som aktiveras
			case 1:

				antalGissningar(gissningar, guessChoice);		//Kallar på metoden antalGissningar() och skickar med 2 variabler

				break;

			case 2:											

				numret = intervallet(choice2, numret);			//Numret är lika med vad metoden intervallet() returnerar

				break;

			case 3:												//Kallar på metoden startaOchAvsluta() och skckar med 2 variabler

				startaOchAvsluta(numret);

				break;
				

			case 4:												//Avslutar programmet
				System.out.println();
				System.out.println("Shutting Down...");
				cont = 0;
			}

		} while (cont == 1); 									//Kör om programet om cont fortfarande är lika med 1
	

	}

	/**
	 * Skriver ut startalternativen och antal gissningar och vart intervallet är
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
	 * Ger användaren möjlighet att skriva in och ändra antal gissningar
	 * 
	 * @param gissningar
	 * @param guessChoice
	 */
	private static int antalGissningar(int gissningar, int guessChoice) {

		System.out.println();
		System.out.println("(1) - Select the number of guesses");
		System.out.println("(2) - Go Back");
		guessChoice = tryGetNumber();							//Kollar så det inte blir fel när man skriver in värdet

		switch (guessChoice) {
		case 1:
			System.out.println();

			determineGuesses();									//Kallar på metoden determineGuesses()

		case 2:
			break;
		}
		return guesses;
	}

	/**
	 * Ger anvädaren möjlighet att skriva in start- och slut- värden på intervallet
	 * 
	 * @param choice2
	 * @param numret
	 */
	private static int intervallet(int choice2, int numret) {
		System.out.println();
		System.out.println("(1) - Select Your Interval");
		System.out.println("(2) - Go Back");

		choice2 = tryGetNumber();								//Kollar så det inte blir fel när man skriver in värdet

		switch (choice2) {
		case 1:

			int hiddenNumber = randomNumber();					//Fixar värdet på talet som användaren ska gissa
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
		game(numret);											//Själva spelet startar och körs

		
		System.out.println("Do You Want To Play Again?");
		System.out.println("(1) - Yes");
		System.out.println("(2) - No");

		int contChoice;
		contChoice = tryGetNumber();							//Kollar så det inte blir fel när man skriver in värdet

		switch (contChoice) {

		case 1:

			System.out.println();
			System.out.println("Change The Amount Of Gusses And The Intervall To Play With Different Gamesettings");
			start = 0;											// 	\
			slut = 100;											//	 Om du startar om nollställer det spelinställningarna 
			förstaTal();										//  /
			guesses= 10;										// /
			break;

		case 2:
			System.out.println();
			System.out.println("Shutting Down...");
			cont = 0;											//Avslutar do(while) loopen genom att göra cont = 0. Den fortsätter om cont = 1		
			break;
		}
		return numret;
	}

	/**
	 * Användaren bestämmer antal gissningar
	 * 
	 * @return
	 */
	private static int determineGuesses() {

		System.out.println("Choose How Many Guesses You Want");
		guesses = tryGetNumber(); 							//Kollar så det inte blir fel när man skriver in värdet

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
		start = tryGetNumber();								//Kollar så det inte blir fel när man skriver in värdet

		System.out.println();
		System.out.println("Where Should Your Interval Stop?");
		slut = tryGetNumber();								//Kollar så det inte blir fel när man skriver in värdet

		if (slut < start) {									//Gör ett rekursivt anrop ifall slutet på intervallet är mindre än början av intervallet.

			System.out.println();
			randomNumber(); 								

		}

		System.out.println();
		System.out.println("The Number That You Will Guess Is In Between " + start + " And " + slut);

		Random randomNumber = new Random();
		int hiddenNumber = randomNumber.nextInt(slut - start) + start; //Slumpar ett tal mellan de givna talet som användaren skrivit in. 

		return hiddenNumber; 

	}

	/**
	 * Tar in antalet möjliga gissningar och det slumpade talet som ska gissas och
	 * jämför gissningen med talet och skriver om du vann eler förlorade.
	 * 
	 * @param gissningar
	 * @param numret
	 * @return
	 */
	private static int game(int numret) {

		System.out.println();
		System.out.println("You Have " + guesses + " Guesses ");

		System.out.println("Start Guessing!");
		for (int i = 1; i <= guesses; i++) {					//Skapar en for-loop som körs sålänge antal gånger loopen körts ärmindre än antalet gissningar användaren har 
			int dinGissning;
			dinGissning = tryGetNumber();
			System.out.println();

			if (dinGissning == numret) {						//Om gissningen är rätt så skriver programmet ut att hen vann
				System.out.println("!!!!!!You Won!!!!!!");
				System.out.println();
				break;
			} else if (dinGissning > numret) {					//Om gissningen är större än det slumpade alet så skriver programmet ut att gissningen var för hög 
				System.out.println("You Guessed To High...");
				System.out.println("Try Again");
				System.out.println();
			} else if (dinGissning < numret) {					//Om gissningen är mindre än det slumpade alet så skriver programmet ut att gissningen var för låg 
				System.out.println("You Guessed To Low...");
				System.out.println("Try Again");
				System.out.println();
			}

			int kvar = guesses - i;								//Räknar ut hur många gissningar som finns kvar 

			if (kvar != 1) {									//If-sats som avgör om den ska skriva guesses eller guess
				System.out.println("You Have " + kvar + " Guesses Left");
			} else {
				System.out.println("You Have " + kvar + " Guess Left");
			}

			if (kvar == 0) {									//If-sats som abgör om kvar=0, om det ät det så står det att du förlorade och det slumpade talet skrivs ut
				System.out.println("You Lost");
				System.out.println("The Number Was " + numret + "...");
				System.out.println();

			}
		}
		return 0;
	}

	/**
	 * Letar efter fel. Om det blir ett fel när det skrivs in ett tal så rättar denna metoden det och ger användaren möjligheten att skriva igen
	 * @return output
	 */
	private static int tryGetNumber() {
		int output;
		while (true) {
			try {										//Kollar om det uppstår fel inom try satsen
				output = input.nextInt();
				input.nextLine();
				break;
			} catch (Exception e) {						//Om det uppstod fel inom try så kommer den räta felet så programmet nite krashar, och du får möjligheten att försöka igen. 
				input.nextLine();
				System.out.println();
				System.out.println("Write An Integer Please");
			}
		}
		return output;
	}
}
