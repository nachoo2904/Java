package FigurasGeometricas;

public class Corona {

	private Circulo cGrande;
	private Circulo cChico;
	private Punto centro;
	
	public Corona (double radioMayor, double radioMenor, Punto centro) {
		this.cChico = new Circulo (radioMenor, centro);
		this.cGrande = new Circulo (radioMayor, centro);
	}
	
	public double getArea () {
		return cGrande.getArea() - cChico.getArea();
	}
	
	public double getPerimetroInterior () {
		return cChico.getPerimetro();
	}
	
	public double getPerimetroExterior () {
		return cGrande.getPerimetro();
	}
	
	public void cambiarRadioInterior(double nuevoRadio) {
		if (nuevoRadio >= this.cGrande.getRadio())
			throw new Error ("Radio interior incorrecta");
		
		this.cChico = new Circulo (nuevoRadio, this.centro);
	}
	
	public void cambiarRadioExterior(double nuevoRadio) {
		if (nuevoRadio <= this.cChico.getRadio())
			throw new Error ("Radio exterior incorrecta");
		
		this.cGrande = new Circulo (nuevoRadio, this.centro);
	}
	
	public static void main(String[] args) {
		

	}

}
