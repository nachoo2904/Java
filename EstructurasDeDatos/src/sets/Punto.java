package sets;

import java.util.Objects;

public class Punto implements Comparable<Punto> {
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
	public String toString() {
		return "[" + x + ", " + y + "]";
	}
	
	
	public void mover (double deltaX, double deltaY) {
		this.x += deltaX;
		this.y += deltaY;
	}
	
	public double getDistanciaAlOtroPunto (Punto op) {
		return Math.hypot(this.getX() - op.getX(), this.getY() - op.getY());
	}

	@Override
	public int compareTo(Punto o) {
		return Double.compare(this.getDistanciaAlOrigen(), o.getDistanciaAlOrigen());
	}

	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Punto other = (Punto) obj;
		return Double.doubleToLongBits(x) == Double.doubleToLongBits(other.x)
				&& Double.doubleToLongBits(y) == Double.doubleToLongBits(other.y);
	}
	
	
	
}
