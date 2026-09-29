package teoriabienparametrizada041;
public abstract class Product {
	
	int pcss=9;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int pcss) {
		super();
		this.pcss = pcss;
	}
	//se puede poner pero no se pueden hacer getters and setters
	
	public int getPcss() {
		return pcss;
	}
	public void setPcss(int pcss) {
		this.pcss = pcss;
	}
	// Para propiedades y metodos comunes a las clases hijo
	public abstract void operacion();
	public Class quienSoy(){
		return this.getClass();
	}
	
}
