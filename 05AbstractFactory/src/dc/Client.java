package dc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Client {

	@Test
	void test() {
		AbstractFactory af=new ConcreteFactory1();
		AbstractProductA productA = af.createProductA();
		AbstractProductB productB = af.createProductB();
	}

}
