package unlam.pa.orquesta.instrumentos;

import org.junit.Assert;
import org.junit.Test;

public class InstrumentoTests {

	@Test
	public void queAlTocarDevuelveSonido() {
		Instrumento oboe = new Oboe();
		Assert.assertEquals("Tocando el Oboe.", oboe.tocar());
	}
	
}
