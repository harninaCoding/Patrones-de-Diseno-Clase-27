import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SingletonTest {

	@Test
	void test() {
		Singleton instancia2 = Singleton.getInstancia();
		Singleton instancia = Singleton.getInstancia();;
		
		System.out.println(instancia);
		System.out.println(instancia2);
		//ambos son iguales porque solo hay un objeto Singleton
		//acceso restringido al constructor
//		Singleton otro=new Singleton();
	}

}
