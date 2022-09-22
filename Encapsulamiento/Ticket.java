package Encapsulamiento;

public class Ticket {

	private double importe;
	private int productos;

	public Ticket() {
		this.importe = 0;
	}

	private void setImporte(double importe) {
		this.importe = importe;

	}

	public void agregarItem(int cantidad, double precioUnitario) {
		if (cantidad < 0 && precioUnitario < 0)
			throw new Error("Cantidad y/o precio unitario invalidos");

		setImporte(this.importe + precioUnitario * cantidad);
		this.productos += cantidad;
	}

	public void aplicarDescuento(double porcentaje) {
		porcentaje = porcentaje / 100;
		setImporte(this.importe - porcentaje * importe);
	}

	public double calcularSubtotal() {
		return importe;
	}

	public double calcularTotal() {
		double total = importe;
		importe = 0;
		return total;
	}

	public int contarProductos() {
		return productos;
	}

	public static void main(String[] args) {

		Ticket tickesito = new Ticket();
		tickesito.agregarItem(2, 100);
		System.out.println(tickesito.calcularSubtotal());
		tickesito.aplicarDescuento(20);
		System.out.println(tickesito.calcularTotal());
		System.out.println(tickesito.contarProductos());

	}

}
