package unlam.pa.orquesta;

import org.junit.Assert;
import org.junit.Test;

import unlam.pa.orquesta.instrumentos.Guitarra;
import unlam.pa.orquesta.instrumentos.Oboe;

public class OrquestaTests {

	@Test
	public void queTocaUnaOrquestaConDosInstrumentos() {
		
		Orquesta orquesta = new Orquesta();
		orquesta.agregarCuerda(new Guitarra());
		orquesta.agregarViento(new Oboe());
		
		Assert.assertEquals("Tocando la Guitarra.\nTocando el Oboe.\n",
				orquesta.tocar());
		Assert.assertEquals("Tocando el Oboe.",
				orquesta.tocarVientos());
		Assert.assertEquals("Tocando la Guitarra.",
				orquesta.tocarCuerdas());
	}
}
