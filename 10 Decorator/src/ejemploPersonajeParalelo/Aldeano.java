package ejemploPersonajeParalelo;

import java.util.Objects;

public class Aldeano implements Personaje {
	public String nombre;
	

	protected Aldeano(String nombre) {
		super();
		this.nombre = nombre;
	}

	public int mostrarArmadura() {
		return 0;

	}

	public Personaje decrementaElemento() {
		return this;
	}

	public int mostrarFuerza() {

		return 0;
	}

	public Personaje degradaTotal() {
		return this;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aldeano other = (Aldeano) obj;
		return Objects.equals(nombre, other.nombre);
	}

	@Override
	public String getNombre() {
		return nombre;
	}

	
}
