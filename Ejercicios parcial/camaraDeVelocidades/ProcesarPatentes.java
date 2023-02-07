package camaraDeVelocidades;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ProcesarPatentes {

	public Map<String, Integer> infractores = new HashMap<String, Integer>();
	public static final int VALOR_MULTA = 50000;
	public static final int VELOCIDAD_PERMITIDA = 80;

	public void leerPatentes(String archivo) {
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(new File(archivo));
			br = new BufferedReader(fr);
			String linea = br.readLine();
			while (linea != null) {
				String[] split = linea.split(" ");
				String patente = split[0];
				Integer velocidad = Integer.parseInt(split[1]);

				if (velocidad >= VELOCIDAD_PERMITIDA) {
					int cantidad = 1;
					if (infractores.containsKey(patente))
						cantidad = infractores.get(patente) + 1;
					infractores.put(patente, cantidad);

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

	public void escribirPatentes(String salida) {
		PrintWriter pw = null;
		
		try {
			pw = new PrintWriter(new FileWriter(salida));
			
			for (Entry<String, Integer> cu : infractores.entrySet()) {
				pw.println(cu.getKey() + " " + cu.getValue() * VALOR_MULTA);
				
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		pw.close();
	}

}
