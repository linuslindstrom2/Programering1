package v9;

import Animal.*;

public class Main {
	
	public static void main(String[] args) {
	
		Animal[] creatures = {new Chihuahua(), new GreatWhiteShark()};
		
		for(Animal animal: creatures) {
			animal.eat();
			animal.move();
			animal.reproduce();
			
			if(animal.getClass()==new Chihuahua().getClass()) {
				Chihuahua.annoy();
			}
			else if (animal.getClass()==new GreatWhiteShark().getClass()) {
				((GreatWhiteShark)animal).aggression();
				
			}
		}
		
	}

}
