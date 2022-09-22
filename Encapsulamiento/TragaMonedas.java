package Encapsulamiento;

public class TragaMonedas {

	Tambor[] tambores = new Tambor[3];

	public TragaMonedas() {
		for (int i = 0; i < 3; i++) {
			this.tambores[i] = new Tambor();
		}

	}

	public void activar() {
		boolean yaGano = false;
		for (int i = 0; i < 3; i++) {
			this.tambores[i].girar();
			yaGano = this.entregaPremio();
		}
		if (yaGano) {
			for (int i = 0; i < 3; i++) {
				this.tambores[i].girar();
				}
		}

	}

	public boolean entregaPremio() {
		return this.tambores[0].obtenerPosicion() == this.tambores[1].obtenerPosicion() && this.tambores[0].obtenerPosicion() == this.tambores[2].obtenerPosicion();

	}

	public int obtenerPosicionDelTambor(int i) {
		return this.tambores[i - 1].obtenerPosicion();
	}

	public String toString() {
		String display = " ";
		for (int i = 0; i < 3; i++) {
			display += this.tambores[i].toString();
		}
		return display;
	}

	public static void main(String[] args) {
		int valorPremio = 10000;
		int valorFicha = 100;
		TragaMonedas timba = new TragaMonedas();
		timba.activar();
		System.out.println(timba);
		
		int contador = 0;
			while (!timba.entregaPremio()) {
				timba.activar();
				contador++;
			}
		System.out.println(timba);
		System.out.println("Intentos: " + contador);
		
		int gasto = contador * valorFicha;
		if (gasto > valorPremio)
			System.out.println("Perdiste: " + (gasto - valorPremio));
		else
			System.out.println("Ganaste: " + (valorPremio - gasto));
	}

}
