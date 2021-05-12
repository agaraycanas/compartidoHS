package t8.ejemplos.ej01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class EjemploTest {

	public void miMetodo1() {
		System.out.println("HOLA 1");
	}

	public void miMetodo2() {
		System.out.println("HOLA 2");
	}

	@Test
	@DisplayName("Probando un test inocuo")
	public void miMetodo3() {
		System.out.println("HOLA 3");
	}

	@Test
	@DisplayName("¿ 3 = 4 ?")
	public void miMetodo4() {
		System.out.println("HOLA 4");
		assertEquals(3, 4);
	}
	
	@Test
	@DisplayName("Rojo tras saltar una excepción")
	public void miMetodo5() throws Exception {
		System.out.println("HOLA 5");
		throw (new Exception("PUM"));
	}
	
}
