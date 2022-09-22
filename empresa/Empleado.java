package empresa;

public abstract class Empleado {

	private int hijos;
	private boolean esCasado;
	private int horasTrabajadas;
	
	public static final double VALOR_HIJO = 200;
	public static final double VALOR_JERMU = 100;
	
	public Empleado(int hijos, boolean esCasado, int horasTrabajadas) {
		this.hijos = hijos;
		this.esCasado = esCasado;
		this.horasTrabajadas = horasTrabajadas;
	}


	protected int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public abstract double getSalario();
	
	public double getSalarioFamiliar () {
		double salarioFamiliar = hijos *  Empleado.VALOR_HIJO;
		if (esCasado)
			salarioFamiliar += Empleado.VALOR_JERMU;
		return salarioFamiliar;
	}
	
	
	
}
