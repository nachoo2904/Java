package Encapsulamiento;

public class Nota {

	private int valorInicial;

	public Nota(int valorInicial) {
		if (valorInicial > 10 || valorInicial < 0)
			throw new Error("Nota Invalida");

		this.valorInicial = valorInicial;

	}

	public int obtenerValor() {

		return valorInicial;

	}

	public boolean aprobado() {

		return (valorInicial >= 4);

	}

	public boolean desaprobado() {

		return !aprobado();

	}

	public void recupera(int nuevaNota) {
		if (nuevaNota > valorInicial)
			valorInicial = nuevaNota;

	}

	public boolean promociona() {

		return (valorInicial >= 7);

	}

	public static void main(String[] args) {

		Nota parcial1 = new Nota(9);
		Nota parcial2 = new Nota(2);
		Nota parcial3 = new Nota(10);

		System.out.println(parcial1.obtenerValor());
		System.out.println(parcial1.aprobado());
		System.out.println(parcial1.desaprobado());
		System.out.println(parcial1.promociona());

		System.out.println(parcial2.obtenerValor());
		System.out.println(parcial2.aprobado());
		System.out.println(parcial2.desaprobado());
		System.out.println(parcial2.promociona());

		parcial2.recupera(4);

		System.out.println(parcial2.obtenerValor());
		System.out.println(parcial2.aprobado());
		System.out.println(parcial2.desaprobado());

		System.out.println(parcial3.obtenerValor());
		System.out.println(parcial3.aprobado());
		System.out.println(parcial3.desaprobado());
		System.out.println(parcial3.promociona());

		parcial3.recupera(2);

		System.out.println(parcial3.obtenerValor());
		System.out.println(parcial3.aprobado());
		System.out.println(parcial3.desaprobado());
		System.out.println(parcial3.promociona());
	}

}
