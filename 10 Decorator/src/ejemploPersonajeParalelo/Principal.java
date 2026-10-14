package ejemploPersonajeParalelo;

public class Principal {

	public static void main(String[] args) {
		Personaje personaje=new Aldeano("Crispulo");
		Personaje primitivo=personaje;
		System.out.println(personaje.mostrarArmadura());
		personaje=new Armadura(personaje);
		System.out.println(personaje.mostrarArmadura());
		personaje=new Armadura(personaje);
		System.out.println(personaje.mostrarArmadura());
		personaje=new Fuerza(personaje);
		System.out.println(personaje.mostrarFuerza());
		personaje=new Fuerza(personaje);
		System.out.println(personaje.mostrarFuerza());
		personaje=new Fuerza(personaje);
		System.out.println(personaje.mostrarFuerza());
		personaje=new Fuerza(personaje);
		System.out.println(personaje.mostrarFuerza());
		System.out.println("Son iguales "+primitivo.getNombre().equals(personaje.getNombre()));
		personaje=new Golpe().golpear(personaje);
//		System.out.println(personaje.mostrarFuerza());
		personaje=new Golpe().golpearMortalmente(personaje);
//		System.out.println(personaje.mostrarFuerza());
//		System.out.println(personaje.mostrarArmadura());
		System.out.println("Son iguales "+primitivo.equals(personaje));
		
	}

}
