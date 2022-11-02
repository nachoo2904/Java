package pilaColaLista;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Cola {

	public static void main(String[] args) {
		ConcurrentLinkedQueue<String> cola = new ConcurrentLinkedQueue<String>();
		System.out.println(cola.isEmpty());
		cola.offer("Obrigado");
		cola.offer("Thanks");
		cola.offer("Gracias");
		System.out.println(cola.isEmpty());
		cola.poll();
		System.out.println(cola.peek());
		
		ConcurrentLinkedQueue<String> auxiliar = new ConcurrentLinkedQueue<String>();
		while (!cola.isEmpty()) {
			String dato = cola.poll();
			System.out.println(dato);
			auxiliar.offer(dato);
		}
		while(!auxiliar.isEmpty()) {
			cola.offer(auxiliar.poll());
		}

	}

}
