package unlam.pa.transportes;

public abstract class Transporte {
	
	protected int cargaMaxima = 0;
	protected int carga;
	
	public abstract boolean puedeCargar(int carga);
	public abstract void cargar(int carga);
	public abstract void recorrer(int kilometros);
	public abstract boolean hayQueReparar();

	protected boolean puedeSoportarCarga(int carga) {
		return this.carga + carga <= cargaMaxima; 
	}
	
}
