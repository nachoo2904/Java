package ej9;

import java.util.Scanner;

public class ej9 {

	static void suma (int limite) {
		int ssuma = 0;
		for (int i = 0; i<limite; i++) {
			if (i % 3 == 0) {
				ssuma = ssuma + i;
			}
			else if (i % 5 == 0) {
				ssuma = ssuma + i;
			}
		}
		System.out.println("La suma es: " + ssuma);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Ingrese un numero n");
		n = sc.nextInt();
		
		suma (n);
		
	}

}
