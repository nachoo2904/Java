package Encapsulamiento;

public class Cerradura {
	
	private int claveDeApertura;
	private int cantidadDeFallosConsecutivosQueLaBloquean;
	private int fallos = 0;
	private int aperturasSi = 0;
	private int aperturasNo = 0;
	private boolean abrio = false;
	
	public Cerradura(int claveDeApertura, int cantidadDeFallosConsecutivosQueLaBloquean) {
		this.claveDeApertura = claveDeApertura;
		this.cantidadDeFallosConsecutivosQueLaBloquean = cantidadDeFallosConsecutivosQueLaBloquean;
	}

	public boolean abrir(int clave) {
		if (claveDeApertura != clave) {
			fallos++;
			aperturasNo++; }
		
		else fallos = 0;
			
		if (fueBloqueada())
			throw new Error ("CERRADURA BLOQUEADA");
		
		aperturasSi++;
		abrio = true;
		return (claveDeApertura == clave);	
	}

	public void cerrar() {
		abrio = false;
	}

	public boolean estaAbierta() {
		return abrio;
	}

	public boolean estaCerrada() {
		return !estaAbierta();
	}

	public boolean fueBloqueada() {
		return (cantidadDeFallosConsecutivosQueLaBloquean == fallos);
	}

	public int contarAperturasExitosas() {
		return aperturasSi;
	}

	public int contarAperturasFallidas() {
		return aperturasNo;
	}


	
	public static void main(String[] args) {
		Cerradura puerta = new Cerradura (1854, 3);
		System.out.println(puerta.abrir(1854));
		System.out.println(puerta.abrio);
		System.out.println(puerta.estaAbierta());
		System.out.println(puerta.estaCerrada());
		
		puerta.abrir(23);
		
		puerta.cerrar();
		System.out.println(puerta.estaAbierta());
		System.out.println(puerta.estaCerrada());
		
		puerta.abrir(16465);
		
		System.out.println(puerta.contarAperturasExitosas());
		System.out.println(puerta.contarAperturasFallidas());
		
		System.out.println(puerta.abrir(86468));
	}

}
