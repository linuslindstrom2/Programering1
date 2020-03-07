package v3;

public class Elev {
	
	private String _name;
	
	public Elev() {
		
		System.out.println("This is a student!");
		
	}
	
	public Elev(String name) {
		
		_name = name;
		
	}

	public static void doStuff(){
		
		System.out.println("I did stuff!");
		
	}
	
	public void doExplicitStuff(){
			
			System.out.println(_name + " did it!");
			
	}
	
	public String get_name() {
		return _name;
	}
}
