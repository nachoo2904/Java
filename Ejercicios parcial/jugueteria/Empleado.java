package jugueteria;

public class Empleado{
	
	public String nombre;
	public String apellido;
	public boolean entrada = false;
	
	public Empleado (String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setEntrada() {
		entrada = true;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + ", apellido: " + apellido + "\n";
	}

		
	
	
}
