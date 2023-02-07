package leerYProcesar;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LeerYProcesarPersonas {

	public static List<Persona> getPersona(String archivo) {
		List<Persona> personas = new LinkedList<Persona>();
		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);
			String linea = null;

			while ((linea = br.readLine()) != null) {
				String[] split = linea.split(" ");
				Persona p = new Persona(Integer.parseInt(split[0]), split[1], Integer.parseInt(split[2]));
				personas.add(p);

			}

			fr.close();

		} catch (FileNotFoundException fnfo) {
			System.err.print("Archivo no encontrado");

		} catch (IOException e) {
			e.printStackTrace();
		}

		return personas;
	}

	public static List<Persona> getPersonas(String archivo) {

		List<Persona> personas = new LinkedList<Persona>();
		try {

			FileReader fr = new FileReader(new File(archivo));
			BufferedReader br = new BufferedReader(fr);
			String linea;
			String datos[];
			int dni;
			String apellido;
			int edad;
			Persona p;

			linea = br.readLine();
			while (linea != null) {
				datos = linea.split(" ");
				dni = Integer.parseInt(datos[0]);
				apellido = datos[1];
				edad = Integer.parseInt(datos[2]);
				p = new Persona(dni, apellido, edad);
				personas.add(p);
				linea = br.readLine();
			}

			fr.close();

		} catch (IOException e) {
			System.err.print("Error I/O");
		}

		return personas;
	}

	public List<Persona> getPersonasMayorAEdad(List<Persona> personas, int edad) {
		List<Persona> mayores = new LinkedList<Persona>();

		for (Persona cadaP : personas) {
			if (cadaP.getEdad() > edad)
				mayores.add(cadaP);
	}
		PrintWriter pw = null;

		try {
			pw = new PrintWriter(new File("source/personasMayoresDeXX.txt"));
			for (Persona cadaP : mayores) {
				pw.println(cadaP);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		pw.close();

		return mayores;
	}
	
	public int edadPromedio(List<Persona> personas) {
		int promedio = 0;
		
		for(Persona cadaP : personas) {
			promedio = promedio + cadaP.getEdad();
		}
		
		return promedio / personas.size();
	}

	public static void personaDeMayorYMenorEdad(List<Persona> personas) {
		int menorEdad = personas.get(0).getEdad();
		int mayorEdad = 0;
		for(Persona cadaP : personas) {
			if (cadaP.getEdad() < menorEdad)
				menorEdad = cadaP.getEdad();
			else if (cadaP.getEdad() == menorEdad) {
				
			}
			if (cadaP.getEdad() > mayorEdad)
				mayorEdad = cadaP.getEdad();
			else if (cadaP.getEdad() == mayorEdad) {
				
			}
		}
		System.out.println("Menor edad: " + menorEdad + " Mayor edad: " + mayorEdad);
	}
	
	
	public static void main(String[] args) {
		List<Persona> personas = getPersona("resources/personas.txt");
		System.out.println(personas);
		personaDeMayorYMenorEdad(personas);
	}

}
