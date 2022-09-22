package ej03;

import java.util.Scanner;

public class ej03 {
public static void main(String[] args) {
	
	int num;
	
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Ingrese el numero ");
	num = sc.nextInt();
	
	if (num%2 == 0) {
		System.out.println("El numero es par. ");
	}
	else {System.out.println("El numero es impar. ");}
	
}
}
