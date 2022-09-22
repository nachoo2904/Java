package Encapsulamiento;

public class Punto {

	private double Y;
	private double X;

	public Punto(double Y, double X) {

		this.Y = Y;
		this.X = X;

	}

	public double obtenerY() {

		return Y;

	}

	public double obtenerX() {

		return X;

	}

	public void cambiarY(double nuevoY) {
		Y = nuevoY;
	}

	public void cambiarX(double nuevoX) {
		X = nuevoX;
	}

	public boolean sobreY() {
		return (X == 0);
	}

	public boolean sobreX() {
		return (Y == 0);
	}

	public boolean estaSobreOrigen() {
		return (sobreX() && sobreY());
	}

	public static void main(String[] args) {

		Punto coordY1 = new Punto(0, 0);
		Punto coordX1 = new Punto(0, 2);

		System.out.println(coordY1.obtenerY());
		System.out.println(coordY1.sobreY());

		coordY1.cambiarX(0);

		System.out.println(coordX1.obtenerX());
		System.out.println(coordX1.sobreX());

		System.out.println(coordY1.obtenerY());
		System.out.println(coordY1.sobreY());

	}

}
