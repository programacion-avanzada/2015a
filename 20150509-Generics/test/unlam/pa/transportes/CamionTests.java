package unlam.pa.transportes;

import java.util.Date;
import org.junit.Assert;
import org.junit.Test;

public class CamionTests {

	@Test
	public void quePuedeCargarPaquetes() {
		Camion<Lacteo> camion = new Camion<Lacteo>("La Quiaca");
		Lacteo lacteo = new Lacteo(10, 10, "La Quiaca", new Date());
		Assert.assertTrue(camion.agregar(lacteo));
	}

	@Test
	public void queNoCargaUnPaqueteADistintoDestino() {
		Camion<Lacteo> camion = new Camion<Lacteo>("La Quiaca");
		Lacteo lacteo = new Lacteo(10, 10, "Ushuaia", new Date());
		Assert.assertFalse(camion.agregar(lacteo));
	}

	@Test
	public void queNoCargaUnPaqueteQueExcedePeso() {
		Camion<Lacteo> camion = new Camion<Lacteo>("La Quiaca");
		Lacteo lacteo = new Lacteo(10, 101, "La Quiaca", new Date());
		Assert.assertFalse(camion.agregar(lacteo));
	}
	
	@Test
	public void queNoCargaUnPaqueteQueExcedeVolumen() {
		Camion<Lacteo> camion = new Camion<Lacteo>("La Quiaca");
		Lacteo lacteo = new Lacteo(101, 10, "La Quiaca", new Date());
		Assert.assertFalse(camion.agregar(lacteo));
	}

}
