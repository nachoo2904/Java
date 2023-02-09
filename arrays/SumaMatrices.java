package arrays;

public class SumaMatrices {

	public void sumarMatrices(int[][] a, int[][] a2) {
		if (a.length != a2.length)
			throw new Error("No se puede realizar la operacion");

		int[][] suma = new int[a.length][a2[0].length];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				int n1 = a[i][j];
				int n2 = a2[i][j];
				int sumaN = n1 + n2;
				suma[i][j] = sumaN;
			}
		}

		for (int i = 0; i < suma.length; i++) {
			for (int j = 0; j < suma[0].length; j++) {
				System.out.println(suma[i][j]);
			}
		}
	}

	public static void main(String[] args) {
		SumaMatrices sm = new SumaMatrices();
		int[][] m = { { 1, 2 }, { 45, 12 } };
		int[][] m2 = { { 1, 2 }, { 45, 12 } };
		sm.sumarMatrices(m, m2);

	}
}
