package arrays;

public class ConsonantesNew {

	
	static String Encriptar (String s, int a) {
		String alfabeto = "abcdefghijklmnñopqrstuvwxyz";
		String encriptada = "";
		for (int i = 0; i < s.length(); i++) {
			char letraOriginal = s.charAt(i);
			int posicionAlfabeto = alfabeto.indexOf(letraOriginal);
			int posicionEncriptada = (posicionAlfabeto + a) % 27;
			System.out.println(posicionEncriptada);
			char letraEncriptada = alfabeto.charAt(posicionEncriptada);
			encriptada += letraEncriptada; 
		}
		return encriptada;
	}
	
	
	public String Consonantes (String str) {
		
		String sinVocales = str;
		String vocales = "aeiouAEIOUáéíóúÁÉÍÓÚäëïöüÄËÏÖÜ";
		
		for (int i = 0; i < vocales.length(); i++) {
			Character vocal = vocales.charAt(i);
			sinVocales = sinVocales.replace(vocal.toString(), "");
		}
		return sinVocales;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConsonantesNew con = new ConsonantesNew ();
		System.out.println(con.Consonantes ("hola"));
		System.out.println(Encriptar ("jaja", 2));
	}
	

}
