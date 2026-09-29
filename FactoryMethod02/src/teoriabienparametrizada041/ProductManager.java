package teoriabienparametrizada041;

public class ProductManager {

	public Product createProduct(Creator creator) {
		return creator.factoryMethod();
	}
}
