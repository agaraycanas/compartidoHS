package t8.ejemplos.ej02;

import t8.ejemplos.ej02.exception.ArgumentoException;

public class Util {

	/**
	 * Decide si un n�mero proporcionado es par o no
	 * 
	 * @param numero el n�mero a evaluar
	 * @exception ArgumentoException si <code>numero</code> no est� comprendido
	 *                               entre <code>-1000 <= numero <= 1000
	 * @return <code>true</code> si el n�mero es par y <code>false</code> en
	 *                               caso contrario
	 */
	public boolean esPar(int numero) throws ArgumentoException {
		if (numero < -1000 || numero > 1000) {
			throw new ArgumentoException();
		}
		return (numero % 2 == 0);
	}
}
