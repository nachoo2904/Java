package playlist;

public class Cancion implements Comparable<Cancion> {

	public String interprete;
	public String titulo;
	public int duracion;

	public Cancion(String interprete, String titulo, int duracion) {
		this.interprete = interprete;
		this.titulo = titulo;
		this.duracion = duracion;
	}
	
	public String getInterprete() {
		return interprete;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public int getDuracion() {
		return duracion;
	}

	@Override
	public int compareTo(Cancion o) {
		return Integer.compare(this.getDuracion(), o.getDuracion());
	}

	@Override
	public String toString() {
		return "Cancion [interprete=" + interprete + ", titulo=" + titulo + ", duracion=" + duracion + "]";
	}

}
