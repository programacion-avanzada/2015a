package unlam.pa.exceptions;

import java.io.IOException;

import org.junit.Test;

public class ExceptionTests {

	RepositorioDePersonas repo = new RepositorioDePersonas();

	/*
	 * Este es el caso más simple, en el cual, al avisar que puede lanzarse una
	 * excepción, la misma llega al usuario (el Test). Al esperar la excepción,
	 * la prueba es correcta: Se espera que falle de tal modo.
	 */
	@Test(expected = RegistroNoEncontradoException.class)
	public void queLaExcepcionLlegaAExplotar()
			throws RegistroNoEncontradoException {
		repo.buscarPorNombre("Pedro");
	}

	/*
	 * En este caso, se espera que el mismo código maneje la excepción. No se
	 * esperan fallos, por lo que al funcionar, es correcto.
	 */
	@Test
	public void queManejaLaExcepcion() {
		try {
			repo.buscarPorNombre("Pedro");
		} catch (RegistroNoEncontradoException e) {
			// código para manejar la excepción
		}
		// Un test sin aserción, es correcto por definición
	}

	/*
	 * En este caso, pedimos que lance una excepción no verificada. Nótese que
	 * no la anuncia, pero la espera. Entonces, al lanzarse, el test se
	 * considera como válido.
	 */
	@Test(expected = RuntimeException.class)
	public void queEnvuelveLaExcepcionEnUnaNoVerificada() {
		try {
			repo.buscarPorNombre("Pedro");
		} catch (RegistroNoEncontradoException e) {
			throw new RuntimeException(e);
		}
	}

	/*
	 * Por último, enmascaramos una excepción en otra forma. Se espera una
	 * excepción diferente a la que lanza el método inicial. Al estar
	 * envolviéndola correctamente, el test es certero.
	 */
	@Test(expected = IOException.class)
	public void queEnvuelveLaExcepcionEnUnaVerificada() throws IOException {
		try {
			repo.buscarPorNombre("Pedro");
		} catch (RegistroNoEncontradoException e) {
			throw new IOException(e);
		}
	}
}
