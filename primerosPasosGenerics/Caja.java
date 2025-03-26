package primerosPasosGenerics;

public class Caja <X>{
	
	public Caja(X contenido) {
		this.contenido = contenido;
	}

	public X getContenido() {
		return contenido;
	}

	@Override
	public String toString() {
		return "Caja [contenido=" + contenido + "]";
	}

	private X contenido;
	
	
}
