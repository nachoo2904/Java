package FigurasGeometricas;

public class Cubo {

	private double lado;

	public Cubo(double lado) {

		setLado(lado);

	}

	public double obtenerLado() {
		return lado;

	}

	public void cambiarLado(double longitudNueva) {
		this.lado = longitudNueva;
	}

	public double obtenerAreaCara() {
		return Math.pow(lado, 2);
	}

	public void cambiarAreaCara(double areaCara) {
		setLado(Math.sqrt(areaCara));
	}

	public double obtenerVolumen() {
		return Math.pow(lado, 3);
	}

	private void setLado(double lado) {
		if (lado < 0)
			throw new Error("Longitud invalida");

		this.lado = lado;
	}

	public void cambiarVolumen(double volumen) {
		setLado(Math.cbrt(volumen));
	}

	public static void main(String[] args) {

		Cubo lado1 = new Cubo(2);

		System.out.println(lado1.obtenerLado());
		lado1.cambiarLado(4);
		System.out.println(lado1.obtenerLado());
		System.out.println(lado1.obtenerAreaCara());
		System.out.println(lado1.obtenerVolumen());
		lado1.cambiarAreaCara(25);
		System.out.println(lado1.obtenerAreaCara());
		lado1.cambiarVolumen(36);
		System.out.println(lado1.obtenerVolumen());
	}

}
