package v3;

import java.util.Arrays;


public class bubbleSort {
	
	public static void main(String[] args) {
		
		int[] numbers = new int[100]; // initierar en array med 37 tomma platser
		boolean swapped = false;
		int temp;
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random()*100);
		}
		
		System.out.println(Arrays.toString(numbers));
		
		do {
			
			swapped = false;
			
			for (int i = 0; i < numbers.length - 1; i++) {
				
				
				if (numbers[i] > numbers[i+1]) { // denna ifsatsen byter plats p� de 2 talen som g�mf�rs f�r tillf�llet. 
					temp = numbers[i]; //sparar tillf�lligt v�rdet p� v�nstra sidan. 
					numbers[i] = numbers [i+1];
					numbers[i+1] = temp;
					
					swapped=true;
				}	
			}		
		}while(swapped);
		
		System.out.println(Arrays.toString(numbers));	
	}
}
