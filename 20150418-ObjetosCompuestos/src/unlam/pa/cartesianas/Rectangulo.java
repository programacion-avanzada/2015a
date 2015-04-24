package unlam.pa.cartesianas;

public class Rectangulo {

	private Punto superiorIzquierdo;
	private Punto inferiorDerecho;
	
	public Rectangulo(Punto a, Punto b) {
		double menorX = a.getX() < b.getX() ? a.getX() : b.getX();
		double mayorX = a.getX() < b.getX() ? b.getX() : a.getX();
		
		double menorY = a.getY() < b.getY() ? a.getY() : b.getY();
		double mayorY = a.getY() < b.getY() ? b.getY() : a.getY();
		
		this.superiorIzquierdo = new Punto(menorX, mayorY);
		this.inferiorDerecho = new Punto(mayorX, menorY);
	}

	public Punto getSuperiorIzquierdo() {
		return superiorIzquierdo;
	}

	public Punto getInferiorDerecho() {
		return inferiorDerecho;
	}
	
	public boolean contiene(Punto p) {
		return entre(p.getX(), this.superiorIzquierdo.getX(), this.inferiorDerecho.getX())
				&& entre(p.getY(), this.inferiorDerecho.getY(), this.superiorIzquierdo.getY());
	}

	private boolean entre(double x, double x1, double x2) {
		return x1 <= x && x <= x2;
	}
	
	public boolean hayInterseccionCon(Rectangulo otro) {
		double[] todosLosX = {
				this.superiorIzquierdo.getX(),
				this.inferiorDerecho.getX(),
				otro.superiorIzquierdo.getX(),
				otro.inferiorDerecho.getX()
		};
		
		double[] todosLosY = {
				this.superiorIzquierdo.getY(),
				this.inferiorDerecho.getY(),
				otro.superiorIzquierdo.getY(),
				otro.inferiorDerecho.getY()
		};
		
		int k = 0;
		Punto[] puntos = new Punto[16];
		
		for (double x : todosLosX) {
			for (double y: todosLosY) {
				puntos[k++] = new Punto(x,y);
			}
		}
		
		// si al menos uno de estos puntos pertenece a ambos,
		// se puede decir que hay interseccion
		
		boolean resultado = false;
		
		for (Punto p : puntos) {
			resultado = resultado || this.contiene(p) && otro.contiene(p);
		}
		
		return resultado;
	}
}
