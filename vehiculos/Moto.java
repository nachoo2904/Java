package vehiculos;

public class Moto extends Vehiculo {

	private Persona acompaniante;
	

	public boolean cambiarChofer (Persona nuevoChofer) {
		if (!hayAcompaniante()) {
			asignarChofer(nuevoChofer);
		return true;
	}
		return false;
	}
	
	public boolean agregarAcompaniante (Persona acompaniante) {
		if (!hayAcompaniante()) {
			this.acompaniante = acompaniante;
			return true;
		}
		return false;
	}
	
	private boolean hayAcompaniante() {
		return acompaniante != null;
	}
	
}
