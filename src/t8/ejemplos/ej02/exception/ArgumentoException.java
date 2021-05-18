package t8.ejemplos.ej02.exception;

@SuppressWarnings("serial")
public class ArgumentoException extends Exception {
	public ArgumentoException(String mensaje) {
		super(mensaje);
	}
	
	public ArgumentoException() {
		super();
	}
	
}
