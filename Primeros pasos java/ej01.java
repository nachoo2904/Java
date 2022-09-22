package ej01;

import java.util.Scanner;

public class ej01 {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		int suma;
		int coc;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese el primer numero ");
		num1 = sc.nextInt();
		
		System.out.println("Ingrese el segundo numero ");
		num2 = sc.nextInt();
		
		suma=num1+num2;
		coc=num1%num2;
		
		
		System.out.println("La suma de los numeros es de: " + suma);
		System.out.println("El cociente es de: " + coc);
	}
}
