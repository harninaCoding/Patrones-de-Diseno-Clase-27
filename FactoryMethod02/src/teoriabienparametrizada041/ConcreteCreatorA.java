package teoriabienparametrizada041;

public class ConcreteCreatorA implements Creator {

	private int mipropiedad;
	private int pcss;
	

	public ConcreteCreatorA(int valor,int pcss) {
		super();
		this.mipropiedad = valor;
		this.pcss=pcss;
	}

	// dejar el factory method sin add parametros
	public Product factoryMethod() {
		return ConcreteProductA.getProduct(mipropiedad,pcss);

	}
	
	
}