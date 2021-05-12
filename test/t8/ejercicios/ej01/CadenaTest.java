package t8.ejercicios.ej01;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CadenaTest {

	@Test
	@DisplayName("Creo la cadena 'pepe' y vep que el obketo contiene exactamente eso")
	public void createGet01() {
		//ARRANGE
		Cadena cadena = new Cadena("pepe");
	}
}
