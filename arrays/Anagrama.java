package arrays;

import java.util.Arrays;

public class Anagrama {

	public boolean isAnagrama(String p1, String p2) {
		p1 = p1.toLowerCase().replace(" ", "");
		p2 = p2.toLowerCase().replace(" ", "");
		
		if (p1.length() != p2.length()) {
			throw new Error("Imposible ser anagrama si tienen distinto tamaño");
		}
		boolean b = true;
		char[] a1 = p1.toCharArray();
		char[] a2 = p2.toCharArray();
		Arrays.sort(a1);
		Arrays.sort(a2);

		for (int i = 0; i < a1.length; i++) {
			if(a1[i] != a2[i])
				b = false;
		}

		return b;
	}

	public static void main(String[] args) {
		Anagrama a = new Anagrama();
		String p1 = "Amor";
		String p2 = "Ramo";
		String p3 = "Tom Marvolo Riddle";
		String p4 = "I am Lord Voldemort";
		String p5 = "Hola";
		String p6 = "Chau";
		System.out.println(a.isAnagrama(p1, p2));
		System.out.println(a.isAnagrama(p3, p4));
		System.out.println(a.isAnagrama(p5, p6)); // False
		//System.out.println(a.isAnagrama(p1, p3)); //Error

	}

}
