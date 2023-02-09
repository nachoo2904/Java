package arrays;

public class ArregloOrdenado {

	public boolean estaOrdenado(int[] a) {
		boolean b = true;

		for (int i = 1; i < a.length; i++) {
			if (a[i-1] <= a[i]); 
			 else
				b = false;
		}

		return b;
	}

	public static void main(String[] args) {
		ArregloOrdenado ao = new ArregloOrdenado();
		int[] a = { 1, 2, 3, 8, 5, 6, 7 };
		System.out.println(ao.estaOrdenado(a));
	}

}