package v3;

import java.util.ArrayList;

public class arrayList {
	
	public static void main(String[] args) {
		
		ArrayList<Elev> names = new ArrayList<>();
		
		names.add(new Elev("Niklas"));
		names.add(new Elev("Björn"));
		names.add(new Elev("Linus"));
		names.add(new Elev("Pelle"));
		names.add(new Elev("Kalle"));
		names.add(new Elev("Petter"));
		
		for(Elev elev : names) {
			
			elev.doExplicitStuff();
			
			switch(elev.get_name()) {
			
			case "Petter":
				System.out.println("Tjena Petter");
				System.out.println();
				break;

			case "Björn":
				System.out.println("Tjena Björn");
				System.out.println();
				break;

			case "Linus":
				System.out.println("Tjena Linus");
				System.out.println();
				break;

			case "Pelle":
				System.out.println("Tjena Pelle");
				System.out.println();
				break;

			default:
				System.out.println("Walla Bror");
				System.out.println();
				break;

			}
		}
		
	}

}
