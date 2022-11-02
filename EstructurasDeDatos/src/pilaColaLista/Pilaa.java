package pilaColaLista;

import java.util.Stack;

public class Pilaa {

	public static void main(String[] args) {
		Stack<String>pila = new Stack<String>();
		System.out.println(pila.isEmpty());
		pila.push("Obrigado");
		pila.push("Thanks");
		pila.push("Gracias");
		System.out.println(pila.peek());
		pila.pop();
		System.out.println(pila.peek());
		
		Stack<String> auxiliar = new Stack <String>();
		while (!pila.isEmpty()) {
			String dato = pila.pop();
			System.out.println(dato);
			auxiliar.push(dato);
			
			while (!auxiliar.isEmpty()) {
				pila.push(auxiliar.pop());
			}
		}
		
		
	}

}
