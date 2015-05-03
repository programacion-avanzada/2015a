package unlam.pa.orquesta;

import java.util.LinkedList;
import java.util.List;

import unlam.pa.orquesta.instrumentos.Cuerda;
import unlam.pa.orquesta.instrumentos.Instrumento;
import unlam.pa.orquesta.instrumentos.Viento;

public class Orquesta {

	private List<Instrumento> lista;
	private List<Cuerda> listaCuerda;
	private List<Viento> listaViento;

	public Orquesta() {
		lista = new LinkedList<Instrumento>();
		listaCuerda = new LinkedList<Cuerda>();
		listaViento = new LinkedList<Viento>();
	}

	public String tocar() {
		String resultado = "";
		for (Instrumento instrumento : lista) {
			resultado += instrumento.tocar() + "\n";
		}
		return resultado;
	}

	public String tocarCuerdas() {
		String resultado = "";
		for (Cuerda instrumento : listaCuerda) {
			resultado += instrumento.tocar();
		}
		return resultado;
	}

	public String tocarVientos() {
		String resultado = "";
		for (Viento instrumento : listaViento) {
			resultado += instrumento.tocar();
		}
		return resultado;
	}

	public void agregarCuerda(Cuerda instrumento) {
		lista.add(instrumento);
		listaCuerda.add(instrumento);
	}

	public void agregarViento(Viento instrumento) {
		lista.add(instrumento);
		listaViento.add(instrumento);
	}
}
