
public class SingletonError {
	private static SingletonError INSTANCIA;
	
	//no funciona porque nadie llama al constructor
	private SingletonError() {
		INSTANCIA=new SingletonError();
	}
	
	public static SingletonError getInstancia() {
		return INSTANCIA;
	}
}
