package unlam.pa.transportes;

public class Paquete {

	private double volumen;
	private double peso;
	private String destino;
	
	public Paquete(double volumen, double peso, String destino) {
		this.volumen = volumen;
		this.peso = peso;
		this.destino = destino;
	}

	public double getVolumen() {
		return volumen;
	}

	public double getPeso() {
		return peso;
	}

	public String getDestino() {
		return destino;
	}
	
}
