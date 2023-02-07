package fizzBuzz;

public class FizzBuzz {

	public static String divisible (int i) {
		String fb;
		fb = null;
		
		if (i % 15 == 0)
			fb = "FizzBuzz";
		
		else if (i % 3 == 0)
			fb = "Fizz";
		
		else if (i % 5 == 0)
			fb = "Buzz";
		
		return fb;
	}
	
	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			System.out.println(i + ": " + divisible(i));
		}
		
	}

}
