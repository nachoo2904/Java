package ventas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Ventas {
	public Map<String, ArrayList<Integer>> ventas = new TreeMap<String, ArrayList<Integer>>();

	public Ventas() {

	}

	public void leerVentas(String archivo) {
		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);
			String linea = null;
			while ((linea = br.readLine()) != null) {
				String[] split = linea.split(" ");
				String key = split[0];
				int v = Integer.parseInt(split[1]);
				ArrayList<Integer> aux;

				if (ventas.containsKey(key))
					aux = ventas.get(key);
				else
					aux = new ArrayList<Integer>();
				aux.add(v);
				ventas.put(key, aux);

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
		System.out.println(ventas);
	}

	public void escribirVentasPorProductos(String archivo) {
		PrintWriter pw = null;

		try {
			pw = new PrintWriter(archivo);
			int total = 0;
			for (Entry<String, ArrayList<Integer>> cu : ventas.entrySet()) {
				ArrayList<Integer> aux = cu.getValue();
				pw.println(cu.getKey() + " " + total);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		pw.close();
	}

	public static void main(String[] args) {
		Ventas v = new Ventas();
		v.leerVentas("source/ventas.txt");
		v.escribirVentasPorProductos("source/ventasPorProducto.txt");
	}

}
