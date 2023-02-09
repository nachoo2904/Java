package arrays;

public class SumarPosicionesPares {
	
	public int sumarPosicionesPares(int[] a) {
		int contador = 0;
		
		for(int i = 0; i < a.length; i++) {
			if ((i%2)==0)
				contador += a[i];
		}
		
		return contador;
	}
	
	public static void main(String[] args) {
		SumarPosicionesPares spp = new SumarPosicionesPares();
		int [] a = { 8, 5, 6, 234, 56, 1, 2, 10, 10 };
		System.out.println(spp.sumarPosicionesPares(a));
	}
	
}
