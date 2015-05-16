package unlam.pa.transportes;

import java.util.Date;

public class Lacteo extends Paquete {

	private Date fechaCaducidad;
	
	public Lacteo(double volumen, double peso, String destino, Date fechaCaducidad) {
		super(volumen, peso, destino);
		this.fechaCaducidad = fechaCaducidad;
	}

	public Date getFechaCaducidad() {
		return fechaCaducidad;
	}
	
}
