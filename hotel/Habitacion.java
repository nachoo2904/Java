package hotel;

public class Habitacion {

	public int mayores;
	public int menores;
	
	public Habitacion(int mayores, int menores) {
		this.mayores = mayores;
		this.menores = menores;
	}

	protected int getMayores() {
		return mayores;
	}

	protected int getMenores() {
		return menores;
	}
	
	

}
