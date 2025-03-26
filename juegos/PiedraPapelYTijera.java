package juegos;

import java.util.Random;
import java.util.Scanner;

public class PiedraPapelYTijera {
	
	public static void main(String[] args) {
		
		
		
		int puntosJugador = 0;
		int puntosRadnom = 0;
		
		String[] opciones = {"Piedra","Papel","Tijera"};
		
		Random random = new Random();
		int eleccionMaquina = random.nextInt(opciones.length);
		String valorMaquina = opciones[eleccionMaquina];
		Scanner scanner = new Scanner(System.in);
		
		
		
		System.out.println("El primero que llege a 3");
		
		while(puntosJugador < 3 && puntosRadnom < 3) {
			System.out.println("Piedra, Papel, Tijera... 1... 2... 3...");
			
			eleccionMaquina = random.nextInt(opciones.length);
			valorMaquina = opciones[eleccionMaquina];
			String intento = scanner.next();
		
			
			if(valorMaquina.equals("Piedra") && intento.equals("Piedra")) {
				System.out.println();
				System.out.println("ES UN EMPATE!");
				System.out.println("Jugador: " + puntosJugador);
				System.out.println("Maquina: " + puntosRadnom);
				}else if (valorMaquina.equals("Piedra") && intento.equals("Papel")){
					System.out.println();
					System.out.println("PUNTO PARA EL JUGADOR");
					System.out.println();
					System.out.println("Jugador: " + ++puntosJugador);
					System.out.println("Maquina: " + puntosRadnom);
			} else if(valorMaquina.equals("Piedra") && intento.equals("Tijera")) {
				System.out.println();
				System.out.println("PUNTO PARA LA MAQUINA");
				System.out.println("Jugador: " + puntosJugador);
				System.out.println("Maquina: " + ++puntosRadnom);
			}
			
			
			if(valorMaquina.equals("Papel") && intento.equals("Papel")) {
				System.out.println();
				System.out.println("ES UN EMPATE!");
				System.out.println("Jugador: " + puntosJugador);
				System.out.println("Maquina: " + puntosRadnom);
				}else if (valorMaquina.equals("Papel") && intento.equals("Tijera")){
					System.out.println();
					System.out.println("PUNTO PARA EL JUGADOR");
					System.out.println("Jugador: " + ++puntosJugador);
					System.out.println("Maquina: " +puntosRadnom);
			} else if(valorMaquina.equals("Papel") && intento.equals("Piedra")) {
				System.out.println();
				System.out.println("PUNTO PARA LA MAQUINA");
				System.out.println("Jugador: " + puntosJugador);
				System.out.println("Maquina: " + ++puntosRadnom);
			}
			
			
			if(valorMaquina.equals("Tijera") && intento.equals("Piedra")) {
				System.out.println();
				System.out.println("ES UN EMPATE!");
				System.out.println("Jugador: " + puntosJugador);
				System.out.println("Maquina: " + puntosRadnom);
				}else if (valorMaquina.equals("Tijera") && intento.equals("Piedra")){
					System.out.println();
					System.out.println("PUNTO PARA EL JUGADOR");
					System.out.println("Jugador: " + ++puntosJugador);
					System.out.println("Maquina: " + puntosRadnom);
			} else if(valorMaquina.equals("Tijera") && intento.equals("papel")) {
				System.out.println();
				System.out.println("PUNTO PARA LA MAQUINA");
				System.out.println("Jugador: " + puntosJugador);
				System.out.println("Maquina: " + ++puntosRadnom);
			}
			System.out.println();
		}
	}
}
