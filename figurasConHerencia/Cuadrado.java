package figurasConHerencia;

public class Cuadrado extends Figura {
	
	private double lado;
	
	
	public Cuadrado(String color, double lado) {
		super(color);
		this.lado = lado;
		
	}

	private double getLado() {
		return lado;
	}

	@Override
		public double getArea() {
		return this.getLado() * this.getLado();
		
	}
	
	@Override
	public double getPerimetro() {
		return getLado() * 4;
	}
	
	
}
