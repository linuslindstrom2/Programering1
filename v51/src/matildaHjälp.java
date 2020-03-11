package src;

import java.util.Scanner;

public class matildaHjälp {
	
	public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);
		
		int tal=input.nextInt();
		
		for(int i=1;i<=tal;i++) {
			
			if(tal%i==0) {
				System.out.println(tal);
			
			}
			
		}
		
	}
}
