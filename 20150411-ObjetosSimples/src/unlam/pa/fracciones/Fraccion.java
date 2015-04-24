package unlam.pa.fracciones;

public class Fraccion {

	private int numerador;
	private int denominador;

	public Fraccion(final int numerador, final int denominador) {
		this.numerador = numerador;
		this.denominador = denominador;
		simplificar();
	}

	public int getNumerador() {
		return numerador;
	}

	public int getDenominador() {
		return denominador;
	}
	
	public Fraccion sumar(final Fraccion otra) {
		return new Fraccion(
				this.numerador * otra.denominador + otra.numerador * this.denominador,
				this.denominador * otra.denominador);
	}
	
	private void simplificar() {
		int mcd = mcd(this.numerador, this.denominador);
		this.numerador /= mcd;
		this.denominador /= mcd;
	}
	
	int mcd(final int a, final int b) {

		int k = a;
		int m = b;

		while (k != m) {
			if (k > m) {
				k = k - m;
			} else {
				m = m - k;
			}
		}
		return k;
	}
}
