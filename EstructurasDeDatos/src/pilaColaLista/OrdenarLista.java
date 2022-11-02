package pilaColaLista;

import java.util.ArrayList;
import java.util.Collections;

public class OrdenarLista {

	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		lista.add(50);
		lista.add(-10);
		lista.add(-25);
		lista.add(89);
		lista.add(-1);
		
		/*System.out.println(lista);
		
		Collections.sort(lista);
		
		System.out.println(lista);*/
		
		ArrayList<Persona> personas = new ArrayList<Persona>();
		personas.add(new Persona ("Juan", 50));
		personas.add(new Persona ("Joaquin", 15));
		personas.add(new Persona ("Silvia", 20));
		
		System.out.println(personas);
		
		Collections.sort(personas);
		
		System.out.println(personas);
		
	}

}
