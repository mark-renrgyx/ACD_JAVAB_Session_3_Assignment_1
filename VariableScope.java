package week1.day3.assignment1;

public class VariableScope {

	public static void main(String[] args) {
		
		// We can print the static with no instantiation
		System.out.println("Static: " + ArbitraryClass.staticString);
		
		ArbitraryClass instance = new ArbitraryClass();
		System.out.println("Non-Static: " + instance.memberString);
	}
}
