package ventas3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Ventas {
	public Map<String, Integer> productos = new HashMap<String, Integer>();

	public void leerVentas(String archivo) {
		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);
			String linea = null;
			while ((linea = br.readLine()) != null) {
				String[] split = linea.split(" ");
				String codigo = split[0];
				int cantidadVentas = Integer.parseInt(split[1]);

				if (productos.containsKey(codigo))
					cantidadVentas += productos.get(codigo);

				productos.put(codigo, cantidadVentas);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		if (fr != null) {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println(productos);
	}

	public void escribirVentasPorProductos(String archivo) {
		PrintWriter pw = null;

		try {
			pw = new PrintWriter(archivo);

			for (Entry<String, Integer> cu : productos.entrySet()) {
				pw.println(cu.getKey() + " " + cu.getValue());
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		pw.close();
	}

	public static void main(String[] args) {
		Ventas v = new Ventas();
		v.leerVentas("source/ventas.txt");
		v.escribirVentasPorProductos("resources/SHOWMMOSGOON.txt");
	}

}
