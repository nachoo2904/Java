package arrays;

public class IntercalarArraysOrdenados {

	public void intercalarArray(int[] a, int[] b) {
		int[] ab = new int[a.length + b.length];

		for (int i = 0; i < a.length; i++) {
			ab[i] = a[i];
		}
		for (int i = 0; i < b.length; i++) {
			ab[a.length + i] = b[i];
		}

		for (int i = 0; i < ab.length; i++) {
			System.out.println(ab[i]);
		}

	}

	public void intercalarArrayOrdenado(int[] a, int[] b) {
		int[] ab = new int[a.length + b.length];
		int j = 0;
		int k = 0;
		for (int i = 0; i < ab.length; i++) {
			if (j < a.length && k < b.length) {
				
				if (a[j] >= b[k]) {
					ab[i] = b[k];
					k++;
				} else {
					ab[i] = a[j];
					j++;
				}

			} else {
				if (j == a.length) {
					ab[i] = b[k];
					k++;
				} else if (k == b.length) {
					ab[i] = a[j];
					j++;
				}

			}

		}
		for (int i = 0; i < ab.length; i++) {
			System.out.println(ab[i]);
		}

	}

	public static void main(String[] args) {

		IntercalarArraysOrdenados ia = new IntercalarArraysOrdenados();
		int a[] = { 3, 6, 2, -3 };
		int b[] = { 10, 28, 1, 0, -4 };
		ia.intercalarArrayOrdenado(a, b);

	}

}
