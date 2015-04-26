package unlam.pa.transportes;

public class Camion extends Transporte {

	private static final int DISTANCIA_MAXIMA = 10000;
	private int distanciaRecorrida;

	public Camion() {
		this.cargaMaxima = 10000;
	}

	@Override
	public boolean puedeCargar(int carga) {
		return puedeSoportarCarga(carga);
	}

	@Override
	public void cargar(int carga) {
		if (puedeCargar(carga)) {
			this.carga += carga;
		} else {
			throw new RuntimeException();
		}
	}

	@Override
	public void recorrer(int kilometros) {
		this.distanciaRecorrida += kilometros;
	}

	@Override
	public boolean hayQueReparar() {
		return this.distanciaRecorrida >= DISTANCIA_MAXIMA;
	}
	
}
