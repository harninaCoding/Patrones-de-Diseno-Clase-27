
public class Singleton {
	private static Singleton INSTANCIA=new Singleton();
	
	private Singleton() {
	}
	
	public static Singleton getInstancia() {
		return INSTANCIA;
	}
}
