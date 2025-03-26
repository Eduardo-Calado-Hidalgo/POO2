package primerosPasosGenerics;

public class Box <L>{
	private L contenido;
	
	public Box(L contenido) {
		this.contenido = contenido;
	}

	public static <L> Box<L> of (L contenido) {
		return new Box <>(contenido);
	}
	
	public static <L> Box<L> empty(){
		return new Box<>(null);
	}
	
	public boolean isPresent() {
		return this.contenido != null;
	}
}
