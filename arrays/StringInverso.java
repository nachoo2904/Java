package arrays;

public class StringInverso {

	public void invertirString(String s) {
		String s1 = "";
		String b = "no";
		for (int i = s.length() - 1; i >= 0; i--) {
			s1 += s.charAt(i);
		}

		if (s.equals(s1))
			b = "si";

		System.out.println(s1 + "\n" + "Es palindromo? " + b);

	}

	public static void main(String[] args) {
		StringInverso si = new StringInverso();
		String string = "dabalearrozalazorraelabad";
		si.invertirString(string);

	}

}
