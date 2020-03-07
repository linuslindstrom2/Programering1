package v3;

import java.util.Arrays;
import java.util.Scanner;

public class bubblesort2 {
	
	public static void main(String[] args) {
		
		int intervall;
		int antal= 0;
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Skriv in intervallet mellan h�gsta och l�gsta m�jliga tal.");
		intervall = input.nextInt()+1;
		
		System.out.println("Skriv in antal tal som ska sorters.");
		antal = input.nextInt();
		
		boolean swapped = false;
		int temp;
		int[] numbers = new int[antal]; // initierar en array med 37 tomma platser
		int interaktioner = 0;
		int hej=0;
	
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random()*intervall);
		}
		System.out.println("Detta �r v�ran startarray:");
		System.out.println(Arrays.toString(numbers));
		System.out.println();
		
		do {
			
			swapped = false;
			
			for (int i = 0; i < numbers.length - 1; i++) {
				
				
				if (numbers[i] > numbers[i+1]) { // denna ifsatsen byter plats p� de 2 talen som g�mf�rs f�r tillf�llet. 
					temp = numbers[i]; //sparar tillf�lligt v�rdet p� v�nstra sidan. 
					numbers[i] = numbers [i+1];
					numbers[i+1] = temp;
					
					swapped=true;
					
					
				}
				hej++;
				System.out.println("J�mf�relse Nr " + hej);

				System.out.println(Arrays.toString(numbers));
			
							}		
		}while(swapped);
		
		

		System.out.println(hej);
		
		System.out.println("Antal interaktioner: ");
		System.out.println((antal-1)*hej);
	}
}
