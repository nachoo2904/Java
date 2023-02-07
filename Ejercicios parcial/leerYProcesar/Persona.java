package leerYProcesar;

public class Persona {
	
	public int dni;
	public String apellido;
	public int edad;
	
	public Persona(int dni, String apellido, int edad) {
		this.dni = dni;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	
	
	protected int getDni() {
		return dni;
	}


	protected String getApellido() {
		return apellido;
	}

	protected int getEdad() {
		return edad;
	}


	@Override
	public String toString() {
		return "DNI: " + this.dni + " apellido: " + this.apellido + " edad: " + this.edad + "\n";
	}
	
	
	
}
