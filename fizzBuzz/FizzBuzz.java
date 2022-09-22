package fizzBuzz;

public class FizzBuzz {

	public static String divisible (int i) {
		String fisbas;
		fisbas = null;
		
		if (i % 15 == 0)
			fisbas = "FizzBuzz";
		
		else if (i % 3 == 0)
			fisbas = "Fizz";
		
		else if (i % 5 == 0)
			fisbas = "Buzz";
		
		return fisbas;
	}
	
	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			System.out.println(i + ": " + divisible(i));
		}
		
	}

}
