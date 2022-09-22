package vehiculos;

public abstract class Vehiculo {
	
	private Persona chofer;    
	private int kmRecorridos;

	
	public int getKmRecorridos() {
		return this.getKmRecorridos();
	}
	
	public void asignarChofer (Persona chofer) {
		if (this.chofer == null)
		this.chofer = chofer;
	}

	public abstract boolean cambiarChofer (Persona nuevoChofer);
	
	
	
}
