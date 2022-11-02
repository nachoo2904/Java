package mapas;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Diccionario {

	public static void main(String[] args) {

		Map<Integer, Producto> productos = new TreeMap<Integer, Producto>();

		Producto yerba = new Producto(123, 1000);
		Producto azucar = new Producto(124, 800);
		Producto sal = new Producto(125, 0);
		Producto carne = new Producto(126, 1000);
		Producto arroz = new Producto(127, 800);
		Producto fideos = new Producto(122, 0);

		productos.put(123, yerba);
		productos.put(124, azucar);
		productos.put(125, sal);
		productos.put(125, carne);
		productos.put(558, arroz);
		productos.put(128, fideos);
		productos.put(123, arroz);

		// System.out.println(productos);

		/*
		 * for(Map.Entry<Integer, Producto> cadaUno: productos.entrySet()) {
		 * System.out.println(cadaUno);
		 */

		Map<Integer, List<Producto>> stock = new TreeMap<Integer, List<Producto>>();
		List<Producto> listaAux;
		for (Map.Entry<Integer, Producto> cadaProducto : productos.entrySet()) {

			int stockAux = cadaProducto.getValue().getStock();
			Producto proAux = cadaProducto.getValue();
			if (stock.containsKey(stockAux)) {
				listaAux = stock.get(stockAux);

			}

			else {
				listaAux = new ArrayList<Producto>();
			}

			listaAux.add(proAux);
			stock.put(stockAux, listaAux);
			
		}
		System.out.println(stock);
	}
}
