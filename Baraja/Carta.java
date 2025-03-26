package Baraja;

public class Carta {
	private String palo;
	private int numero;
	
	public Carta(String palo, int numero) {
		this.palo = palo;
		this.numero = numero;
	}

	@Override
	public String toString() {
		return String.format("[%d %s]",numero,palo);
	}
	
	
}
