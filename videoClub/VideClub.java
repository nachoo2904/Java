package videoClub;

import java.util.Arrays;

public abstract class VideClub implements Entregable, Comparable <VideClub> {
	
	public String titulo;
	public String genero;
	public boolean entregado;
	
	public VideClub(String titulo, String genero, boolean entregado) {
		this.titulo = titulo;
		this.genero = genero;
		this.entregado = entregado;
	}
	
	public static void main(String[] args) {
		
		Pelicula p1 = new Pelicula("Se7en", "Thriller", false, 1996, "David Fincher");
		Pelicula p2 = new Pelicula("Forrest Gump", "Drama", false, 1994, "Robert Zemeckis");
		Pelicula[] pelis = {p1, p2};
		p1.isEntregado();
		p2.entregar();
		p2.isEntregado();
		Arrays.sort(pelis);
		for (Pelicula pelicula : pelis) {
			System.out.println(pelicula);
		}
		
		Serie s1 = new Serie ("Lost", "Misterio", false, 6, "JJ Abrams");
		Serie s2 = new Serie ("Breaking Bad", "Accion", false, 5, "Vince Gilligan");
		Serie[] series = {s1, s2};
		s1.entregar();
		s1.isEntregado();
		s1.devolver();
		s1.isEntregado();
		Arrays.sort(series);
		for (Serie serie : series) {
			System.out.println(serie);
		}
		
		VideoJuego v1 = new VideoJuego ("Kingdom Hearts", "JRPG", false, 40, "Square Enix");
		VideoJuego v2 = new VideoJuego ("Dark Souls", "ARPG", false, 30, "From Software");
		VideoJuego[] juegos = {v1, v2};
		Arrays.sort(juegos);
		for (VideoJuego videoJuego : juegos) {
			System.out.println(videoJuego);
		}
	}
	
}
