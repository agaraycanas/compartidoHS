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
	
	

}
