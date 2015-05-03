package unlam.pa.orquesta.instrumentos;


public class Guitarra extends Cuerda implements Afinable {

	public String tocar() {
		return "Tocando la Guitarra.";
	}
	
	public String afinar() {
		return "Afinando Guitarra.";
	}
	
}
