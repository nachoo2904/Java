package biblioteca;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Biblioteca {

	public ArrayList<Libro> libros;

	public Biblioteca() {
		this.libros = new ArrayList<Libro>();
	}

	public int cuantosLibros() {
		return libros.size();
	}

	public boolean agregarLibro(String titulo, String autor, int paginas, Genero genero) {
		libros.add(new Libro(titulo, autor, paginas, genero));
		return true;
	}

	public List<Libro> LibrosDelGenero(Genero genero) {
		List<Libro> librosPorGenero = new ArrayList<Libro>();
		for (Libro cu : libros) {
			if (cu.getGenero().equals(genero))
				librosPorGenero.add(cu);
		}
		return librosPorGenero;
	}

	public Libro libroConMasPaginas() {
		Libro masPag = null;
		for (Libro cu : libros) {
			if (masPag.getPaginas() < cu.getPaginas())
				masPag = cu;
		}

		return masPag;
	}

	public int cuantosLibrosDelAutor(String autor) {
		int cantidad = 0;

		for (Libro cu : libros) {
			if (cu.getAutor().equals(autor))
				cantidad++;
		}

		return cantidad;
	}

	public List<Libro> librosDelAutor(String autor) {
		List<Libro> lXAutor = new ArrayList<Libro>();

		for (Libro cu : libros) {
			if (cu.getAutor().equals(autor))
				lXAutor.add(cu);
		}
		return lXAutor;
	}

	public Map<Genero, Integer> librosPorGenero() {
		Map<Genero, Integer> librosPorGenero = new TreeMap<Genero, Integer>();

		for (Libro cu : libros) {
			int cantidad = 0;
			Genero key = cu.getGenero();
			if (!librosPorGenero.containsKey(cu.getGenero())) {
				cantidad = 1;

			} else {
				cantidad = librosPorGenero.get(cu.getGenero()) + 1;
			}
			librosPorGenero.put(key, cantidad);
		}
		return librosPorGenero;
	}
	
	public void escribirLibros(String archivo) throws IOException {
		PrintWriter pw = new PrintWriter(archivo);
		for (Libro cu : libros) {
			pw.println(libros);
		}
		pw.close();
	}
	
}
