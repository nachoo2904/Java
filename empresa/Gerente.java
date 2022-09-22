package empresa;

public class Gerente extends PlantaPermanente {

	private static final double VALOR_HORA = 400;
	private static final double VALOR_ANTIGUEDAD = 150;
	
	public Gerente(int hijos, boolean esCasado, int horasTrabajadas, int antiguedad) {
		super(hijos, esCasado, horasTrabajadas, antiguedad);
		
		
	}
	
	@Override
	public double getSalario() {
		double salario = super.getSalarioFamiliar();
		salario += super.getHorasTrabajadas() * VALOR_HORA;
		salario += this.getAntiguedad() * VALOR_ANTIGUEDAD;
		return salario;
	}
	
	
	
}
