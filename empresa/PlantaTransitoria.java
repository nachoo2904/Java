package empresa;

public class PlantaTransitoria extends Empleado{

	public PlantaTransitoria(int hijos, boolean esCasado, int horasTrabajadas) {
		super(hijos, esCasado, horasTrabajadas);
	}

	private static final double VALOR_HORA = 200;
	
	
	@Override
	public double getSalario() {
		double salario = super.getSalarioFamiliar();
		salario += super.getHorasTrabajadas() * VALOR_HORA;
		return salario;
	}
	
	

	
	
}
