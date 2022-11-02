package pilaColaLista;

import java.util.ArrayList;

public class UsoArrayList {

	public static void main(String[] args) {
		ArrayList<String> v1 = new ArrayList<String>();
		v1.add("aaa");
		ArrayList<Boolean> vB = new ArrayList<Boolean>();
		vB.add(Boolean.TRUE);
		System.out.println(vB.size());
		System.out.println(v1.size());
		v1.remove("aaa");
		System.out.println(v1.size());
		vB.remove(0);
		System.out.println(vB.size());
		
		ArrayList<ArrayList<Character>>vectorDeCaracteres = new ArrayList<ArrayList<Character>>();
		ArrayList<Character>vectorCaracter1 = new ArrayList<Character>();
		vectorCaracter1.add('a');
		vectorCaracter1.add('b');
		vectorCaracter1.add('c');
		
		ArrayList<Character>vectorCaracter2 = new ArrayList<Character>();
		vectorCaracter2.add('d');
		vectorCaracter2.add('e');
		vectorCaracter2.add('f');
		
		vectorDeCaracteres.add(vectorCaracter1);
		vectorDeCaracteres.add(vectorCaracter2);
		System.out.println(vectorDeCaracteres.get(0).get(2));
		
		for (ArrayList<Character> aa : vectorDeCaracteres) {
			for(Character c : aa)
				System.out.println(c + " ");
			System.out.println();
		}
		
	}

}
