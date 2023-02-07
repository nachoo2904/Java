package biblioteca;

public class Libro {
	public String titulo;
	public String autor;
	public int paginas;
	public Genero genero;
	
	public Libro(String titulo, String autor, int paginas, Genero genero) {
		this.titulo = titulo;
		this.autor = autor;
		this.paginas = paginas;
		this.genero = genero;
	}

	protected String getTitulo() {
		return titulo;
	}

	protected String getAutor() {
		return autor;
	}

	protected int getPaginas() {
		return paginas;
	}

	protected Genero getGenero() {
		return genero;
	}
	
	


	
}
