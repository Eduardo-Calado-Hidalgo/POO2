package primerosPasosGenerics;

public class Pareja1<T,S> {
	public T getT() {
		return elemento1;
	}
	public S getS() {
		return elemento2;
	}
	@Override
	public String toString() {
		return "Pareja1 [t=" + elemento1 + ", s=" + elemento2 + "]";
	}
	public Pareja1(T t, S s) {
		this.elemento1 = elemento1;
		this.elemento2 = elemento2;
	}
	private T elemento1;
	private S elemento2;
}
