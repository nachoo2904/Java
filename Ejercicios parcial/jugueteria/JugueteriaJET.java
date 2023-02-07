package jugueteria;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class JugueteriaJET {

	public ArrayList<Empleado> empleados = new ArrayList<Empleado>();
	public Set<String> nombres = new HashSet<String>();
	public Queue<Empleado> listaDeEmpleados = new ArrayDeque<Empleado>();

	public void agregarEmpleado(Empleado e) {
		empleados.add(e);
		agregarNombres(e);
	}

	public void agregarNombres(Empleado e) {
		nombres.add(e.getNombre());
	}

	public Empleado elegirEmpleadoAlAzar() {
		int random = (int) (Math.random() * empleados.size());
		return empleados.get(random);
	}

	public List<String> nombresDeNuevosJuguetes() {
		List<String> juguetesPerdidos = new ArrayList<String>();
		for (String cu : nombres) {
			juguetesPerdidos.add(cu);
		}
		Collections.sort(juguetesPerdidos);
		return juguetesPerdidos;
	}

	public void ponerEnLaListaDeEspera(Empleado e) {
		listaDeEmpleados.add(e);
	}

	public void entregarEntradas() {
		
		
			listaDeEmpleados.poll().setEntrada();
		
		
	}

	public void listarNombres(List<String> nombres) {
		
		PrintWriter pw = null;
		try {
			File salida = new File("source/NombreDeLosJuguetes.txt");
			pw = new PrintWriter (salida);
			for (String cu : nombres) {
				pw.println(cu);
			}
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		if (pw != null) {
			pw.close();
		}
		
	}
	
	public static void main(String[] args) {
		JugueteriaJET jet = new JugueteriaJET();
		Empleado ana = new Empleado("Ana", "Gomez");
		Empleado catalina = new Empleado("Catalina", "Vazquez");
		Empleado jv = new Empleado ("Jovani", "Vazquez");
		Empleado ana2 = new Empleado ("Ana" , "Armani");
		
		jet.agregarEmpleado(ana2);
		jet.agregarEmpleado(ana);
		jet.agregarEmpleado(catalina);
		jet.agregarEmpleado(jv);
		System.out.println(jet.elegirEmpleadoAlAzar());
		jet.ponerEnLaListaDeEspera(ana2);
		jet.ponerEnLaListaDeEspera(ana);
		jet.ponerEnLaListaDeEspera(catalina);
		jet.ponerEnLaListaDeEspera(jv);
		jet.entregarEntradas();
		jet.listarNombres(jet.nombresDeNuevosJuguetes());
	}

}
