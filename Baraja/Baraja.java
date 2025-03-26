package Baraja;

import java.util.Random;

public class Baraja {
	private Carta[] cartas;
	
	public Baraja(int numCartasPorPalo, String[] losPalos) {
	 cartas = new Carta[numCartasPorPalo * losPalos.length];
	 int pos = 0;
		for(int numCarta = 1; numCarta <= numCartasPorPalo;numCarta++) {
			for (String palo : losPalos) {
				cartas[pos++] = new Carta(palo,numCarta);
				}
			}
		}
	
	public int mostrarCartaAlAzar() {
		Random random = new Random();
		int posicionAleatoria = random.nextInt(cartas.length);
		System.out.println(cartas[posicionAleatoria]);
		return posicionAleatoria;
	}
	
	public Carta sacarCartaAlZar() {
		int posicion = mostrarCartaAlAzar();
		Carta cartaBorrada = cartas[posicion];
		cartas[posicion] = null;
		return cartaBorrada;
	}
	
	public static void main(String[] args) {
		Baraja espaniola1 = new Baraja(10, 
				new String[] {"Oros", "Copas", "Espadas","Bastos"});	
		String[]misPalos = {"Oros", "Copas", "Espadas","Bastos"};
		Baraja espaniola2 = new Baraja(10, misPalos);
		
		for (int i = 0; i < 10; i++) {
			if(espaniola1.sacarCartaAlZar() != null) {
			espaniola1.sacarCartaAlZar();
			}
		}
	}
}
