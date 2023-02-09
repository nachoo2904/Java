package arrays;

import java.util.Arrays;

public class CuantasVecesAparece {

	public void contarNumeros(int[] a) {
		Arrays.sort(a);
		int aux = a[0];
		int contador = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] == aux)
				contador++;
			else {
				
				System.out.println(aux + ": " + contador + " ");
				contador = 1;
				aux = a[i];
				}
				
		}
		
		System.out.println(aux + ": " + contador);
	}

	public static void main(String[] args) {
		CuantasVecesAparece cv = new CuantasVecesAparece();
		int[] a = { 1, 2, 2, 3, -4 };
		cv.contarNumeros(a);
	}

}
