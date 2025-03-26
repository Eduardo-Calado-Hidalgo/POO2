package primerosPasosGenerics;

public class CajaDeString {
	String contenido;

	public CajaDeString(String contenido) {
		this.contenido = contenido;
	}

	@Override
	public String toString() {
		return "CajaDeString [contenido=" + contenido + "]";
	}

	public String getContenido() {
		return contenido;
	}
	
	
}
