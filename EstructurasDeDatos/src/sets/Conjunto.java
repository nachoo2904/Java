package sets;

import java.util.HashSet;
import java.util.Set;

public class Conjunto {

	public static void main(String[] args) {
		
		Set<Punto> puntos = new HashSet<Punto>();
		
		puntos.add(new Punto(-1,1));
		puntos.add(new Punto(1,1));
		puntos.add(new Punto(-1,1));
		
		System.out.println(puntos);

	}

}
