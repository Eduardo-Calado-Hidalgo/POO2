package primerosPasosGenerics;

public class Trio <K,J,H> {
	private K contenido1;
	private J contenido2;
	private H contenido3;
	
	public Trio(K contenido1, J contenido2, H contenido3) {
		this.contenido1 = contenido1;
		this.contenido2 = contenido2;
		this.contenido3 = contenido3;
	}

	public K getContenido1() {
		return contenido1;
	}

	public J getContenido2() {
		return contenido2;
	}

	public H getContenido3() {
		return contenido3;
	}

	@Override
	public String toString() {
		return "Trio [contenido1=" + contenido1 + ", contenido2=" + contenido2 + ", contenido3=" + contenido3 + "]";
	}
	
	
}
