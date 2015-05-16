package unlam.pa.transportes;

import java.util.LinkedList;
import java.util.List;

public class Camion <T extends Paquete>{
	
	private static final double VOLUMEN_MAXIMO = 100;
	private static final double PESO_MAXIMO = 100;
	private List<T> paquetes = new LinkedList<T>();
	private String destino;
	private double volumen;
	private double peso;

	public Camion(String destino) {
		this.destino = destino;
	}

	public boolean agregar(T paquete) {
		if (distintoDestino(paquete)
				|| excedeVolumen(paquete)
				|| excedePeso(paquete)) {
			return false;
		}

		this.volumen += paquete.getVolumen();
		this.peso += paquete.getPeso();
		return this.paquetes.add(paquete);
	}

	private boolean excedePeso(T paquete) {
		return paquete.getPeso() + this.peso > PESO_MAXIMO;
	}

	private boolean excedeVolumen(T paquete) {
		return paquete.getVolumen() + this.volumen > VOLUMEN_MAXIMO;
	}

	private boolean distintoDestino(T paquete) {
		return !paquete.getDestino().equals(this.destino);
	}
	
	
}
