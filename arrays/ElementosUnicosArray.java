package arrays;

import java.util.Arrays;

public class ElementosUnicosArray {

	public boolean isTodosElementosUnicos(int[] a) {
		Arrays.sort(a);
		boolean b = true;

		for (int i = 1; i < a.length; i++) {
			if (a[i - 1] == a[i])
				b = false;
		}

		return b;
	}

	public static void main(String[] args) {
		ElementosUnicosArray e = new ElementosUnicosArray();
		int[] a = { 1, 2, 3 };
		int[] a2 = { 1, 2, 3, 2, 77, 123, 2 };
		int[] a3 = { 1, 2, 3, 28, 77, 123, 11 };
		int[] a4 = { 1, 1, 1, 1, 1, 1, 1 };
		System.out.println(e.isTodosElementosUnicos(a));
		System.out.println(e.isTodosElementosUnicos(a2)); // false
		System.out.println(e.isTodosElementosUnicos(a3));
		System.out.println(e.isTodosElementosUnicos(a4)); //false
	}
}
