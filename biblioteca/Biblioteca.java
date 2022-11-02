package biblioteca;

public class Biblioteca {

	private Libro[] libros;
	private int cantidadDeLibros = 0;
	private int posicionMasPaginas = 0;

	public Biblioteca(int maxCantidadDeLibros) {

		this.libros = new Libro[maxCantidadDeLibros];

	}

	public int cuantosLibros() {

		return cantidadDeLibros;

	}

	public boolean agregarLibro(String titulo, String autor, Genero genero, int paginas) {

		if (cantidadDeLibros < libros.length) {
			this.libros[cantidadDeLibros] = new Libro(titulo, autor, genero, paginas);
			setPosicionMasPaginas();
			cantidadDeLibros++;
			return true;
		}
		return false;
	}

	private void setPosicionMasPaginas() {
		if (libros[cantidadDeLibros].getPaginas() < libros[posicionMasPaginas].getPaginas())
			this.posicionMasPaginas = this.cantidadDeLibros;
	}

	public String libroEnLaPosicion(int posicion) {
		return libros[posicion].getTitulo();
	}

	public Libro libroConMasPaginas() {
		return libros[posicionMasPaginas];
	}

	public int cuantosLibrosDelAutor(String autor) {
		int contadorAutor = 0;
		for (int i = 0; i < libros.length; i++) {
			if (libros[i].getAutor().equals(autor))
				contadorAutor++;
		}
		return contadorAutor;
	}

	public Libro[] librosDelAutor(String autor) {
		int contadorLibros = 0;
		int cantidad = cuantosLibrosDelAutor(autor);
		Libro librosAutor[] = new Libro[cantidad];

		for (int i = 0; i < libros.length; i++) {
			if (libros[i].getAutor().equals(autor)) {
				librosAutor[contadorLibros] = libros[i];
				contadorLibros++;
			}

		}
		return librosAutor;
	}

	public int tiempoEnLeerTodosLosLibros() {
		int tiempo = 0;

		for (int i = 0; i < libros.length; i++) {
			tiempo += libros[i].getPaginas();
		}
		return tiempo;
	}

	public void librosPorGeneroLiterario() {

		Genero[] generos = Genero.values();
		int cantidades[] = new int [generos.length];

		for (int i = 0; i < cantidadDeLibros; i++) {
			cantidades[libros[i].getGenero().ordinal()]++;
		}
		
		for (int i = 0; i < generos.length; i++) {
			if (cantidades[i] != 0)
				System.out.println(generos[i] + " " + cantidades[i]);
		}
		
	}


}
