package t8.ejemplos.ej01;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MiClaseTest {

	private MiClase unNombrecualquiera;
	
	@BeforeEach
	public void setUp() {
		//ARRANGE
		unNombrecualquiera = new MiClase();
	}
	
	
	@Test
	@DisplayName("doble(4) = 8")
	public void testDoble01() {
		
		//ACT
		int resultado = unNombrecualquiera.doble(4);
		
		//ASSERT
		assertEquals(8,resultado);
	}


	@Test
	@DisplayName("doble(-4) = -8")
	public void testDoble02() {
		//ACT & ASSERT
		assertEquals(-8,unNombrecualquiera.doble(-4));
	}


}
