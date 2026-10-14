package teoria;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonaTest {

	@Test
	void test() {
		Persona persona = new Persona.Builder(1, "ana", "ruiz").build();
		Persona personad = new Persona.Builder(1, "ana", "ruiz").phone("5556565").build();
		Persona personaf = new Persona.Builder(1, "ana", "ruiz").phone("5556565").color("red").build();
		Persona personag = new Persona.Builder(1, "ana", "ruiz").color("red").phone("5556565").build();
	}

}
