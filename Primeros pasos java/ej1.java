package ej1;

import java.util.Scanner;

public class ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		int num1;
		int num2;
		
		System.out.println("Ingrese el primer numero ");
		num1 = sc.nextInt();
		
		System.out.println("Ingrese el segundo numero ");
		num2 = sc.nextInt();
		
		if (num1 > num2) {
			System.out.println("El numero 1 es mayor al numero 2 ");
		}
		else {
			System.out.println("El numero 2 es mayor al numero 1");
		}
	}

}
