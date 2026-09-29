import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SingletonErrorTest {

	@Test
	void testGetInstancia() {
		SingletonError instancia = SingletonError.getInstancia();
		System.out.println(instancia);
	}

}
