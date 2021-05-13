package t8.ejercicios.ej01;

public class Cadena {

	private String         cadena;
	
	public Cadena(String cadena) {
		this.cadena = cadena;
	}

	public String getCadena() {
		return this.cadena;
	}

	public void cDelante(String cadenaDelante) {
		this.cadena = cadenaDelante + this.cadena;
	}

	public void cDetras(String cadenaDetras) {
		this.cadena = this.cadena + cadenaDetras;
	}
	
	public void quitar(char c) {
		String nuevaCadena = "";
		for (int i = 0; i < this.cadena.length(); i++) {			
			if (c != cadena.charAt(i) ) {
				nuevaCadena += cadena.charAt(i);
			}
		}
		this.cadena = nuevaCadena;
	}
	

}
