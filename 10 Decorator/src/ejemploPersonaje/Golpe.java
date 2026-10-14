package ejemploPersonaje;

public class Golpe {

	public Personaje golpear(Personaje personaje) {
		return personaje.decrementaElemento();
	}
	
	public Personaje golpearMortalmente(Personaje personaje) {
		return personaje.degradaTotal();
	}
}
