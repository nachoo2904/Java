package cuenta;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class CuentaCompartida {

	public ArrayList<List<Consumo>> cuenta;
	public int cubierto;

	public CuentaCompartida(int cantidad, int cubierto) {
		this.cuenta = new ArrayList<List<Consumo>>();
		this.cubierto = cubierto;

		for (int i = 0; i < cantidad; i++) {
			cuenta.add(new ArrayList<Consumo>());
		}
	}

	public void agregarConsumos(int comensal, String descripcion, int precio) {
		cuenta.get(comensal - 1).add(new Consumo(precio, descripcion));
	}

	public String consultarConsumos(int comensal) {
		String s = "Consumos del comensal: " + (comensal + 1) + "\n";

		for (Consumo cadaC : cuenta.get(comensal - 1)) {
			s += "Descripcion: " + cadaC.getDescripcion() + "\n";
			s += "Precio: " + cadaC.getPrecio() + " ";
		}

		return s;
	}

	public void consultarImportePorComensal(int comensal) {
		int importeTotal = 0;

		for (Consumo cadaC : cuenta.get(comensal - 1)) {
			importeTotal += cadaC.getPrecio();
		}
		System.out.println("Comensal: " + comensal + " Importe total: " + (importeTotal + this.cubierto));
	}

	public void consultarConsumoMaximo() {
		int consumoMax = 0;
		int comensalMax = 0;

		for (int i = 0; i < cuenta.size(); i++) {
			for (Consumo cadaC : cuenta.get(i)) {
				if (cadaC.getPrecio() > consumoMax) {
					consumoMax = cadaC.getPrecio();
					comensalMax = i + 1;
				}
			}
		}

		System.out.println("Consumo maximo: " + consumoMax + " Comensal: " + comensalMax);
	}
	
	public void exportarCuenta (String archivo) {
		PrintWriter pw = null;
		
		try {
			pw = new PrintWriter(archivo);
			for(int i=1; i<=cuenta.size(); i++) {
				pw.print(consultarConsumos(i-1));
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		pw.close();
		
	}

	public static void main(String[] args) {
		CuentaCompartida cc = new CuentaCompartida(2, 200);
		cc.agregarConsumos(1, "Papas fritas", 1000);
		cc.agregarConsumos(1, "Cerveza", 700);
		cc.agregarConsumos(2, "Sanguche de bondiola", 1200);
		System.out.println(cc.consultarConsumos(1));
		cc.consultarImportePorComensal(1);
		cc.consultarConsumoMaximo();
		cc.exportarCuenta("resources/miCena.txt");
	}

}
