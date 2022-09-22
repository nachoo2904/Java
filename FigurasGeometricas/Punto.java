package FigurasGeometricas;

public class Punto {
	private double x;
	private double y;
	
	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
	
	public double getDistanciaAlOrigen () {
		return Math.hypot(this.getX(), this.getY());
	}
	
	@Override
	public String toString () {
		return "(" + x + "," + y + ")";
	}
	
	public void mover (double deltaX, double deltaY) {
		this.x += deltaX;
		this.y += deltaY;
	}
	
	public double getDistanciaAlOtroPunto (Punto op) {
		return Math.hypot(this.getX() - op.getX(), this.getY() - op.getY());
	}
	
}
