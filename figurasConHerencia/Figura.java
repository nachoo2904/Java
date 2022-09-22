package figurasConHerencia;

public abstract class Figura {

	private String color;
	
	public Figura (String color) {
		this.color = color;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public abstract double getArea();
	public abstract double getPerimetro();

}
