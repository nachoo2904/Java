package figurasConHerencia;

public class Triangulo extends Figura {

	public double base, altura;

	public Triangulo(String color, double base, double altura) {
		super(color);
		this.base = base;
		this.altura = altura;
	}
	

	@Override
		public double getArea() {
		return this.getBase() * this.getAltura() / 2;
		
	}

	public double getPerimetro () {
		return 5;
	}
	
	private double getBase() {
		return base;
	}


	private double getAltura() {
		return altura;
	}
	
}
