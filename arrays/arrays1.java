package arrays;

public class arrays1 {

	 static int arreglo1(int v1[]) {
		int suma = 0;
		for (int i=0; i<v1.length; i+=2) {
		 suma += v1 [i];
	}
		return suma;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int v1[] = {1, 2, 3, 4, 5, 6};
		
		System.out.println(arreglo1 (v1));
		
	}

}
