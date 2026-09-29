
public class SingletonPerezoso {
	private static SingletonPerezoso INSTANCIA;
	
	private SingletonPerezoso() {
	}
	
	public static SingletonPerezoso getInstancia() {
		if(INSTANCIA==null)
			INSTANCIA=new SingletonPerezoso();
		return INSTANCIA;
	}
}
