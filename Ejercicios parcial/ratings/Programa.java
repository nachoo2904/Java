package ratings;

public class Programa{
	public String programa;
	public double rating;

	public Programa(String programa, double rating) {
		this.programa = programa;
		this.rating = rating;
	}

	protected String getPrograma() {
		return programa;
	}

	protected double getRating() {
		return rating;
	}

	@Override
	public String toString() {
		return "programa=" + programa + ", rating=" + rating;
	}
	
	
}
