package arrays;

public class CuantasVecesRepite {

	public void cuantasVecesSeRepite(int[] a) {

		int aux = a[0];
		int[] contador = new int[500];

		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {

				if (a[i] == aux) {
					contador[a[i]]++;
				} else {
					aux = a[i];
					contador[a[i]]++;
				}

			}
		}
		for (int i = 0; i < contador.length; i++) {
			if (contador[i] != 0)
				System.out.println("Numero: " + i + " Veces que se repite: " + contador[i]);
		}

	}

	public static void main(String[] args) {
		CuantasVecesRepite cv = new CuantasVecesRepite();
		int[] a = { 100, 266, 88, 100, 100, 88, 277, 198, 12, 12 };
		cv.cuantasVecesSeRepite(a);

	}

}
