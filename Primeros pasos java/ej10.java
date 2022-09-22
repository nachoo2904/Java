package ej10;

import java.util.Scanner;

public class ej10 {
	
	static boolean esPrimo (int n) {
		
		for (int i = 0; i < n; i++) {
			
			if (n % i == 0) {
				return true;
			}
		}
	return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int numero;
		
		System.out.println("Ingrese un numero ");
		numero = sc.nextInt();
		
		esPrimo (numero);
		
	}
}
