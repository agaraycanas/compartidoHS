package t8.ejercicios.ej02;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import t8.ejercicios.ej02.exception.FechaException;

public class UtilidadesTest {
	private Utilidades utilidades;
	
	@BeforeEach
	public void setUp() {
		this.utilidades = new Utilidades();
	}
	
	@Test
	@DisplayName("21-5-2021 no es fin de semana")
	public void esFindeSemanaTest01() throws FechaException{
		assertFalse(this.utilidades.esFinDeSemana(21, 5, 2021));
	}

	@Test
	@DisplayName("22-5-2021 sí es fin de semana")
	public void esFindeSemanaTest02() throws FechaException {
		assertTrue(this.utilidades.esFinDeSemana(22, 5, 2021));
	}
	

	@Test
	@DisplayName("1-1-1900 NO es fin de semana")
	public void esFindeSemanaTest03() throws FechaException {
		assertFalse(this.utilidades.esFinDeSemana(1, 1, 1900));
	}

	@Test
	@DisplayName("2-1-1900 NO es fin de semana")
	public void esFindeSemanaTest04() throws FechaException {
		assertFalse(this.utilidades.esFinDeSemana(1, 1, 1900));
	}
	
	@Test
	@DisplayName("31-12-1899 salta FechaX")
	public void esFindeSemanaTest05() throws FechaException {
		assertThrows(FechaException.class, () -> this.utilidades.esFinDeSemana(31, 12, 1899), "Debería haber saltado FechaX");
	}

	@Test
	@DisplayName("1-1-3000 NO es fin de semana")
	public void esFindeSemanaTest06() throws FechaException {
		assertFalse(this.utilidades.esFinDeSemana(1, 1, 3000));
	}

	@Test
	@DisplayName("31-12-2999 NO es fin de semana")
	public void esFindeSemanaTest07() throws FechaException {
		assertFalse(this.utilidades.esFinDeSemana(31, 12, 2999));
	}
	
	@Test
	@DisplayName("2-1-3000 salta FechaX")
	public void esFindeSemanaTest08() throws FechaException {
		assertThrows(FechaException.class, () -> this.utilidades.esFinDeSemana(2, 1, 3000), "Debería haber saltado FechaX");
	}

}
