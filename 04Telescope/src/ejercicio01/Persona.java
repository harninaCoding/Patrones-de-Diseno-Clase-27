package ejercicio01;

public class Persona {
	//obligada inicializacion
	private int id;
	private String nombre;
	private String appellidos;
	// optionals
	private String phone = "";
	private String color = "rojo";
	
	public Persona(int id, String nombre, String appellidos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.appellidos = appellidos;
	}

	public Persona(int id, String nombre, String appellidos, String phone) {
		this(id,nombre,appellidos);
		this.phone = phone;
	}
	public Persona(int id, String nombre, String appellidos, String phone,String color) {
		this(id,nombre,appellidos,phone);
		this.color=color;
	}
	
}
