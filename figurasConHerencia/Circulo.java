package figurasConHerencia;

public class Circulo extends Figura {

	private double diametro;

	public Circulo(String color, double radio) {
		super(color);
		setDiametro(radio * 2);

	}
	

	private void setDiametro(double diametro) {
		this.diametro = diametro;
	}

	void setRadio(double nuevoRadio) {
		this.setDiametro(nuevoRadio * 2);
	}

	public double getRadio() {
		return getDiametro() / 2;
	}

	public double getDiametro() {
		return diametro;
	}

	public double getPerimetro() {
		return 2 * Math.PI * getRadio();
	}

	public double getArea() {
		return Math.PI * Math.pow(getRadio(), 2);
	}

	public static void main(String[] args) {
	

	}

}
