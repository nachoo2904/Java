package biblioteca;

public class Libro {

	private String titulo;
	private String autor;
	private Genero genero;
	private int paginas;
	
	public Libro (String titulo, String autor, Genero genero, int paginas) {
		this.titulo = titulo;
		this.autor = autor;
		this.genero = genero;
		this.paginas = paginas;
	}
	
	public String getTitulo () {
		return titulo;
	}
	
	public String getAutor () {
		return autor;
	}
	
	public Genero getGenero () {
		return genero;
	}
	
	public int getPaginas () {
		return paginas;
	}
	
	/*public static void main(String[] args) {
		Genero g = Genero.INFANTILES;
		Libro librito = new Libro ("El Principito", "Antoine de Saint-Exupéry", g, 76);
		
		System.out.println(librito.getTitulo());
		System.out.println(librito.getAutor());
		System.out.println(librito.getGenero());
		System.out.println(librito.getPaginas());
	}*/
	
}
