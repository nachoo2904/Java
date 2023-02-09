package arrays;

public class StringInverso {

	public String invertirString(String s) {
		String s1 = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			s1 += s.charAt(i);
		}
		return s1;
	}
	
	public boolean esPalindromo(String string, String inverso) {
		string = string.toLowerCase().replace(" ", "");
		inverso = inverso.toLowerCase().replace(" ", "");
		System.out.println(string + " " + inverso);
		
		return (string.equals(inverso));
	}

	public static void main(String[] args) {
		StringInverso si = new StringInverso();
		String string = "Anita lava la tina";
		String inverso = si.invertirString(string);
		
		System.out.println(si.esPalindromo(string, inverso));
		
		
	}

}
