package arrays;

public class ArrayInverso {

	public int[] invertirArray(int[] a) {
		int[] a2 = new int[a.length];

		for (int i = a2.length-1, j = 0; i >= 0; i--, j++) {
			a2[i] = a[j];
		}
		return a2;
	}

	public static void main(String[] args) {
		ArrayInverso i = new ArrayInverso();
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] a2 = i.invertirArray(a);

		for (int k = 0; k < a.length; k++) {
			//System.out.println(a[k]);
			System.out.println(a2[k]);
		}

	}

}
