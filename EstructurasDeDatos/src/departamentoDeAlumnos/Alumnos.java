package departamentoDeAlumnos;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Alumnos {

	Map<String, List<String>> listaAsistenciaPorAlumnos(Map<String, List<String>> asistenciaXDia) {

		Map<String, List<String>> asistenciaXAlumno = new TreeMap<String, List<String>>();

		for (Map.Entry<String, List<String>> cadaDia : asistenciaXDia.entrySet()) {
			String dayKey = cadaDia.getKey();
			List<String> listaDeAlumnos = cadaDia.getValue();

			for (String cadaAlumno : listaDeAlumnos) {
				String newKey = cadaAlumno;
				if (!asistenciaXAlumno.containsKey(cadaAlumno)) {
					asistenciaXAlumno.put(cadaAlumno, new LinkedList<String>());
				}
				asistenciaXAlumno.get(cadaAlumno).add(dayKey);
			}
		}

		return asistenciaXAlumno;
	}

	public static void main() {

		Map<String, List<String>> mapIn = new HashMap<String, List<String>>();

		List<String> listaMie10 = new LinkedList<String>();
		listaMie10.add("Ana");
		listaMie10.add("Pedro");
		mapIn.put("Mie 10", listaMie10);
		List<String> listaVie12 = new LinkedList<String>();
		listaMie10.add("Ana");
		listaMie10.add("Luz");
		mapIn.put("Vie 12", listaVie12);
		List<String> listaMie17 = new LinkedList<String>();
		listaMie10.add("Luz");
		listaMie10.add("Pedro");
		mapIn.put("Mie 17", listaMie17);
		
		Alumnos aa = new Alumnos();
		
		System.out.println(aa.listaAsistenciaPorAlumnos(mapIn));

	}

}
