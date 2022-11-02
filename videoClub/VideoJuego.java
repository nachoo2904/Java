package videoClub;

public class VideoJuego extends VideClub {
	
	public int horas;
	public String compañia;
	
	public VideoJuego(String titulo, String genero, boolean entregado, int horas, String compañia) {
		super(titulo, genero, entregado);
		this.horas = horas;
		this.compañia = compañia;
	}
	
	public VideoJuego (String titulo, int horas) {
		this(titulo, "", false, horas, "");
	}
	
	public VideoJuego (String titulo, String genero, int horas, String compañia) {
		this(titulo, 10);
	}

	protected int getHoras() {
		return horas;
	}

	protected void setHoras(int horas) {
		this.horas = horas;
	}

	protected String getCompañia() {
		return compañia;
	}

	protected void setCompañia(String compañia) {
		this.compañia = compañia;
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
		VideoJuego v = (VideoJuego)o;
		return Integer.compare(this.getHoras(), v.getHoras());
	}

	@Override
	public String toString() {
		return "VideoJuego [horas=" + horas + ", compañia=" + compañia + ", titulo=" + titulo + ", genero=" + genero
				+ "]";
	}
	
	
	
}
