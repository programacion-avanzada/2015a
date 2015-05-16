package unlam.pa.exceptions;

import java.util.LinkedList;
import java.util.List;

public class RepositorioDePersonas {

	private List<Persona> personas = new LinkedList<Persona>();

	public Persona buscarPorNombre(String nombre) throws RegistroNoEncontradoException {
		for (Persona persona : this.personas) {
			if (persona.getNombre().equals(nombre)) {
				return persona;
			}
		}
		throw new RegistroNoEncontradoException("No existe una persona con ese nombre");
	}

	public boolean agregar(Persona persona) {
		return this.personas.add(persona);
	}
}
