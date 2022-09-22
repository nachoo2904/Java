package arrays;

import java.util.Scanner;

public class consonantes {
	
	static void consonante (String cadena) {
		
		cadena = cadena.replace("a", "");
		cadena = cadena.replace("e", "");
		cadena = cadena.replace("i", "");
		cadena = cadena.replace("o", "");
		cadena = cadena.replace("u", "");
		
		System.out.println("" + cadena);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena;
		Scanner sc = new Scanner (System.in);
	
		System.out.println("Ingrese la cadena ");
		 cadena = sc.nextLine();
		
		 consonante (cadena);
		 
	}
	
	
	
	

}
