package unlam.pa.transportes;

public class Bicicleta extends Transporte {

	private static final int PAQUETES_MAXIMOS = 4;
	private int paquetes = 0;
	private int distanciaRecorrida = 0;
	private int viajesRealizados = 0;

	public Bicicleta() {
		this.cargaMaxima = 1000;
	}
	
	@Override
	public boolean puedeCargar(int carga) {
		return puedeSoportarCarga(carga) &&
				this.paquetes  <= PAQUETES_MAXIMOS;
	}

	@Override
	public void cargar(int carga) {
		if (puedeCargar(carga)) {
			this.carga += carga;
			this.paquetes++;
		} else {
			throw new RuntimeException();
		}
	}

	@Override
	public void recorrer(int kilometros) {
		this.distanciaRecorrida += kilometros;
		this.viajesRealizados++;
	}

	@Override
	public boolean hayQueReparar() {
		return this.distanciaRecorrida >= 1000 ||
				this.viajesRealizados > 50;
	}

}
