package vehiculos;

import static org.junit.Assert.*;

import org.junit.Test;

public class AutobusTest {

	@Test
	public void test() {
		Persona cacho = new Persona();
		Vehiculo ab = new Autobus();
		assertNotNull(ab);
		ab.asignarChofer(cacho);
		
		Persona tito = new Persona();
		assertFalse (ab.cambiarChofer(tito));
		
		Moto moto = new Moto();
		moto.asignarChofer(tito);
		moto.agregarAcompaniante(cacho);
		assertFalse (moto.cambiarChofer(tito));
		
		
	}

}
