package unlam.pa.personas;

public class Persona {

	private String nombre;
	private String apellido;
	
	public Persona(final String nombre, final String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	// Utilizamos el "Principio de Acceso Uniforme"
	public String getNombreCompleto() {
		return this.nombre + " " + this.apellido;
	}
}
