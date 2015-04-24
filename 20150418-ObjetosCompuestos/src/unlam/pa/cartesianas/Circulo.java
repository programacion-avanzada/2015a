package unlam.pa.cartesianas;

public class Circulo {

	private Punto centro;
	private double radio;

	public Circulo(Punto centro, double radio) {
		this.centro = centro;
		this.radio = radio;
	}

	public Punto getCentro() {
		return centro;
	}

	public double getRadio() {
		return radio;
	}

	public boolean contiene(Punto p) {
		return this.centro.distanciaCon(p) < this.radio;
	}
	
	public boolean hayInterseccionCon(Circulo otro) {
		return this.centro.distanciaCon(otro.centro) < this.radio + otro.radio;
	}
}
