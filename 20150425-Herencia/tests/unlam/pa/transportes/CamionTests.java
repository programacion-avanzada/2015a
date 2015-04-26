package unlam.pa.transportes;

import org.junit.Assert;
import org.junit.Test;

public class CamionTests {

	@Test
	public void quePuedeCargarLoPermitido() {
		Camion camion = new Camion();
		Assert.assertTrue(camion.puedeCargar(10000));
	}
	
	@Test
	public void queNoPuedeCargarMasDeLoPermitido() {
		Camion camion = new Camion();
		camion.cargar(10000);
		Assert.assertFalse(camion.puedeCargar(1));
	}

}
