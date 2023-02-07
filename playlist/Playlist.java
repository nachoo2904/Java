package playlist;

import java.util.Arrays;

public class Playlist {

	public Cancion[] canciones;
	public int cantidadCanciones = 0;
	public int posicionMayorDuracion = 0;

	public Playlist(int maxCanciones) {
		this.canciones = new Cancion[maxCanciones];
	}

	public int getCantidadDeCanciones() {
		return cantidadCanciones;
	}

	public void agregarCancion(String interprete, String titulo, int duracion) {

		if (canciones.length >= cantidadCanciones) {
			this.canciones[cantidadCanciones] = new Cancion(interprete, titulo, duracion);
			cantidadCanciones++;
		}

	}


	public Cancion cancionEnLaPosicion(int posicion) {
		
		if (posicion < 1 || posicion > cantidadCanciones) {
			throw new Error ("Posicion invalida");
		}
		
		return canciones[posicion];
	}
		
	

	public Cancion cancionDeMayorDuracion() {

		for (int i = 0; i < canciones.length; i++) {
			if (canciones[i].getDuracion() > canciones[posicionMayorDuracion].getDuracion())
				posicionMayorDuracion = i;
		}
		
		return canciones[posicionMayorDuracion];

	}
	
	public int cantidadCancionesInterprete (String interprete) {
		int contador = 0;
		
		for (int i = 0; i < canciones.length; i++) {
			if (canciones[i].getInterprete().equals(interprete))
				contador++;
		}
		return contador;
	}
	
	public Cancion [] cancionesDelInterprete (String interprete) {
		int contadorCanciones = 0;
		int tamaño = cantidadCancionesInterprete(interprete);
		Cancion[] cancionesDelInterprete = new Cancion[tamaño];
		
		for (int i = 0; i < this.canciones.length; i++) {
			if (canciones[i].getInterprete().equals(interprete)) {
				cancionesDelInterprete[contadorCanciones] = canciones[i];
				contadorCanciones++;}
		}
		
		Arrays.sort(cancionesDelInterprete);
		
		return cancionesDelInterprete;
	}
	
	public String tiempoEnEscucharTodasCanciones() {
		int tiempo = 0;
		
		for (int i = 0; i < this.canciones.length; i++) {
			tiempo += canciones[i].getDuracion();
		}
		
		int minutos = tiempo / 60;
		int segundos = tiempo % 60;
		
		return minutos + ":" + segundos;
	}
	
	public static void main(String[] args) {
		
		Playlist rock = new Playlist(3);
		rock.agregarCancion("Gustavo Cerati", "Adios",  416);
		rock.agregarCancion("Gustavo Cerati", "Crimen",  223);
		rock.agregarCancion("Luis Alberto Spinetta", "Bajan", 249);
		System.out.println(chill.getCantidadDeCanciones());
		System.out.println(chill.cancionDeMayorDuracion());
		System.out.println(chill.cancionEnLaPosicion(2));
		
		for (Cancion c : rock.cancionesDelInterprete("Gustavo Cerati")) {
			System.out.println(c);
		}
		
		System.out.println(rock.tiempoEnEscucharTodasCanciones());
	}

}
