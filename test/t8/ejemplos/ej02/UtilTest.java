package t8.ejemplos.ej02;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import t8.ejemplos.ej02.exception.ArgumentoException;

public class UtilTest {
	
	private Util util;
	
	@BeforeEach
	public void setUp() {
		this.util = new Util();
	}
	
	
	@Test
	@DisplayName("1000 es par")
	public void esParTest01() throws ArgumentoException {
		assertTrue(this.util.esPar(1000));
	}

	@Test
	@DisplayName("1001 hace saltar ArgumentoExcpetion")
	public void esParTest02() throws ArgumentoException {
		assertThrows(ArgumentoException.class, ()->{this.util.esPar(1001);}, "1001 -> XArgumento" );
	}
	
	@Test
	@DisplayName("999 no es par")
	public void esParTest03() throws ArgumentoException {
		assertFalse(this.util.esPar(999));
	}
	
	@Test
	@DisplayName("-1000 es par")
	public void esParTest04() throws ArgumentoException {
		assertTrue(this.util.esPar(-1000));
	}

	@Test
	@DisplayName("-1001 hace saltar ArgumentoExcpetion")
	public void esParTest05() throws ArgumentoException {
		assertThrows(ArgumentoException.class, ()->{this.util.esPar(-1001);}, "-1001 -> XArgumento" );
	}
	
	@Test
	@DisplayName("-999 no es par")
	public void esParTest06() throws ArgumentoException {
		assertFalse(this.util.esPar(-999));
	}
	

	

}
