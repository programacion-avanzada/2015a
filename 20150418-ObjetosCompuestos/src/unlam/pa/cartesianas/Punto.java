package unlam.pa.cartesianas;

public class Punto {

	private double x;
	private double y;

	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double distanciaCon(Punto otro) {
		return Math.sqrt(Math.pow(this.x - otro.x, 2)
				+ Math.pow(this.y - otro.y, 2));
	}

}
