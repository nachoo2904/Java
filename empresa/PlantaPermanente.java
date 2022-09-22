package empresa;

public class PlantaPermanente extends Empleado {
	
	private int antiguedad;
	
	private static final double VALOR_HORA = 300;
	private static final double VALOR_ANTIGUEDAD = 100;
	
	public PlantaPermanente(int hijos, boolean esCasado, int horasTrabajadas, int antiguedad) {
		super(hijos, esCasado, horasTrabajadas);
		this.antiguedad = antiguedad;
	}
	
	@Override
	public double getSalario() {
		double salario = super.getSalarioFamiliar();
		salario += super.getHorasTrabajadas() * VALOR_HORA;
		salario += this.antiguedad * VALOR_ANTIGUEDAD;
		return salario;
	}

	protected int getAntiguedad() {
		return antiguedad;
	}
	
	

	
	
	
}
