package videoClub;

public class Serie extends VideClub {
	
	public int temporadas;
	public String creador;
	
	public Serie(String titulo, String genero, boolean entregado, int temporadas, String creador) {
		super(titulo, genero, entregado);
		this.temporadas = temporadas;
		this.creador = creador;
	}
	
	public Serie (String titulo, String creador) {
		this(titulo, "", false, 3, creador);
	}
	
	public Serie (String titulo, String genero, int temporadas, String creador) {
		this ("", "");
	}

	protected int getTemporadas() {
		return temporadas;
	}

	protected void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}

	protected String getCreador() {
		return creador;
	}

	protected void setCreador(String creador) {
		this.creador = creador;
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
		return "Serie [temporadas=" + temporadas + ", creador=" + creador + ", titulo=" + titulo + ", genero=" + genero
				+ "]";
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
		Serie s = (Serie) o;
		return Integer.compare(this.getTemporadas(), s.getTemporadas());
	}
	
	
	
}
