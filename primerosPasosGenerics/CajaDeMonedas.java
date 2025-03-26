package primerosPasosGenerics;

public class CajaDeMonedas {
	Moneda contenido;

	public CajaDeMonedas(Moneda contenido) {
		this.contenido = contenido;
	}

	@Override
	public String toString() {
		return "CajaDeMonedas [contenido=" + contenido + "]";
	}

	public Moneda getContenido() {
		return contenido;
	}
	
	
}
