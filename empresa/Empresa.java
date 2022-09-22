package empresa;

public class Empresa {

	private String CUIT;
	private String razonSocial;
	private Empleado[] empleados;
	private int cantidadEmpleados = 0;

	public Empresa(String cUIT, String razonSocial, int cantidad) {
		CUIT = cUIT;
		this.razonSocial = razonSocial;
		this.empleados = new Empleado[cantidad];
	}

	public void agregarEmpleados(Empleado e) {
		if (cantidadEmpleados < empleados.length) {
			empleados[cantidadEmpleados] = e;
			cantidadEmpleados++;
		} else
			System.err.println("No hay mas vacantes");
	}

	public double getMontoTotal() {
		double montoTotal = 0;
		for (Empleado cadaEmpleado : empleados) {
			montoTotal += cadaEmpleado.getSalario();
			System.out.println(cadaEmpleado.getSalario());
	
		}
		return montoTotal;
	}

	public static void main(String[] args) {
		Empresa acme = new Empresa("12345678901", "ACME", 4);
		Empleado tito = new PlantaTransitoria(0, true, 80);
		Empleado julia = new PlantaPermanente(2, true, 80, 6);
		Empleado juan = new PlantaPermanente(0, true, 160, 4);
		Empleado ana = new PlantaPermanente(1, false, 160, 1);
		acme.agregarEmpleados(ana);
		acme.agregarEmpleados(juan);
		acme.agregarEmpleados(julia);
		acme.agregarEmpleados(tito);
		
		System.out.println(acme.getMontoTotal());
		
	}

}
