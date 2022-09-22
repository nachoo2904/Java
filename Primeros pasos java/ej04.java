package ej04;

import java.util.Scanner;

public class ej04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Ingrese valor numerico de 8 digitos. ");
		num = sc.nextInt();
		
		System.out.println("Año: " + num / 10000);
		System.out.println("Dia: " + num % 100);
		System.out.println("Mes: " + (num / 100) % 100 );
		
		
	}

}
