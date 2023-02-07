package ratings;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Rating {
	public Map<Integer, List<Programa>> canales = new TreeMap<Integer, List<Programa>>();

	public void leerRating(String archivo) {
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);
			String linea = null;
			while ((linea = br.readLine()) != null) {
				String[] split = linea.split(",");
				int canal = Integer.parseInt(split[0]);
				String programa = split[1];
				double rating = Double.parseDouble(split[2]);

				if (!canales.containsKey(canal)) {
					List<Programa> lista = new ArrayList<Programa>();
					lista.add(new Programa(programa, rating));
					canales.put(canal, lista);
				} else {
					canales.get(canal).add(new Programa(programa, rating));
				}

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

	}

	public void escribirRatingPorCanal(String salida) {
		PrintWriter pw = null;
		Map<Integer, Double> c = new TreeMap<Integer, Double>();
		double ratingPromedio = 0.0;
		try {
			pw = new PrintWriter(salida);

			for (Entry<Integer, List<Programa>> cu : canales.entrySet()) {
				List<Programa> aux = cu.getValue();
				

				for (Programa cadaP : aux) {
					ratingPromedio += cadaP.getRating();
				}
				pw.println(cu.getKey() + "," + ratingPromedio);
			}
			

		} catch (IOException e) {
			e.printStackTrace();
		}
		pw.close();
	}

	public static void main(String[] args) {
		Rating r = new Rating();
		r.leerRating("source/ratings.txt");
		r.escribirRatingPorCanal("resources/ratingPorCanal.txt");
	}

}
