package hotel;

public class Hotel {

	public Habitacion[] habitaciones;
	public int cantidadHabitaciones = 0;

	public Hotel(int cantidad) {
		this.habitaciones = new Habitacion[cantidad];
	}

	public void ocuparHabitacion(int mayores, int menores) {

		if (mayores + menores > 8)
			throw new Error("Limite superado");

		if (cantidadHabitaciones < habitaciones.length) {
			habitaciones[cantidadHabitaciones] = new Habitacion(mayores, menores);
			cantidadHabitaciones++;
		}

	}
	
	public int totalDePersonasEnHotel () {
		int total = 0;
		for (int i = 0; i < habitaciones.length; i++) {
			total += personasEnHabitacion(i);
		}
		return total;
		
	}

	public int habitacionesMayores (int mayores) {
		int contador = 0;
		for (int i = 0; i < habitaciones.length; i++) {
			if (habitaciones[i].getMayores() == (mayores))
				contador++;
		}
		return contador;
	}
	
	public int personasEnHabitacion(int posicion) {
		return habitaciones[posicion].getMenores() + habitaciones[posicion].getMayores();
	}
	
	public int[] cantidadesPersonas () {
		
		int[] cantidades = new int[9];
		
		for (int j = 0; j < cantidades.length; j++) {
		for (int i = 0; i < habitaciones.length; i++) {
			if (personasEnHabitacion(i) == j)
				cantidades[j]++;
		}
		}
		return cantidades;
	}
	
	public static void main(String[] args) {
		
		Hotel patagonia = new Hotel(3);
		
		patagonia.ocuparHabitacion(2, 2);
		patagonia.ocuparHabitacion(1, 0);
		patagonia.ocuparHabitacion(0, 0);
		
		System.out.println(patagonia.habitacionesMayores(2));
		
		System.out.println(patagonia.totalDePersonasEnHotel());
		
		for (int i = 0; i < 9; i ++) {
			System.out.println("Personas:" + i + " Habitaciones:" + patagonia.cantidadesPersonas()[i]);
		}
		
	}
	
}
