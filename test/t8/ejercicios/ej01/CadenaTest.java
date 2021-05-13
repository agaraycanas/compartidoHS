package t8.ejercicios.ej01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CadenaTest {

	@Test
	@DisplayName("createGet01: Creo la cadena 'test' y veo que el objeto contiene exactamente eso")
	public void createGet01() {

		//ARRANGE
		Cadena cadena = new Cadena("test");
		
		//ACT
		String stringObtenido = cadena.getCadena();
		
		//ASSERT
		assertEquals("test", stringObtenido);
	}

	@Test
	@DisplayName("cDelante01: 'latas' cDelante('abre') sale abrelatas")
	public void cDelante01() {
		Cadena cadena = new Cadena("latas");
		cadena.cDelante("abre");
		assertEquals("abrelatas", cadena.getCadena());
	}

	@Test
	@DisplayName("cDetras01: 'corre' cDetras('caminos') sale correcaminos")
	public void cDetras01() {
		Cadena cadena = new Cadena("corre");
		cadena.cDetras("caminos");
		assertEquals("correcaminos", cadena.getCadena());
	}

	
}
