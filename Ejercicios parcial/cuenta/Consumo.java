package cuenta;

public class Consumo {
	public int precio;
	public String descripcion;
	
	public Consumo(int precio, String descripcion) {
		this.precio = precio;
		this.descripcion = descripcion;
	}

	protected int getPrecio() {
		return precio;
	}

	protected String getDescripcion() {
		return descripcion;
	}

	@Override
	public String toString() {
		return "[precio=" + precio + ", descripcion=" + descripcion + "]";
	}

	
	
	
	
	
	
}
