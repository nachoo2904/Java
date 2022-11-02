package videoClub;

public class Pelicula extends VideClub {

	public int año;
	public String director;
	
	public Pelicula(String titulo, String genero, boolean entregado, int año, String director) {
		super(titulo, genero, entregado);
		this.año = año;
		this.director = director;
	}
	
	public Pelicula (String titulo, String director) {
		this(titulo, "No definido", false, 0, director);
	}
	
	public Pelicula(String titulo, String genero, int año, String director) {
		this("", "");
	}

	protected int getAño() {
		return año;
	}

	protected void setAño(int año) {
		this.año = año;
	}

	protected String getDirector() {
		return director;
	}

	protected void setDirector(String director) {
		this.director = director;
	}

	protected String getGenero () {
		return genero;
	}
	
	protected void setGenero (String genero) {
		this.genero = genero;
	}
	
	protected String getTitulo () {
		return titulo;
	}
	
	protected void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return "Pelicula [año=" + año + ", director=" + director + ", titulo=" + titulo + ", genero=" + genero + "]";
	}

	@Override
	public void entregar() {
		this.entregado = true;
	}

	@Override
	public void devolver() {
		this.entregado = false;
	}

	@Override
	public boolean isEntregado() {
		return this.entregado;
	}

	@Override
	public int compareTo(VideClub o) {
	Pelicula p = (Pelicula) o;
	return Integer.compare(this.getAño(), p.getAño());

	}
	

}
