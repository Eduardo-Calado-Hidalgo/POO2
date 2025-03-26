package juegos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class PreguntaTestPaises {
	public static void main(String[] args) {

		ArrayList<String> paises = new ArrayList<String>();

		paises.add("Argentina");
		paises.add("Brasil");
		paises.add("Chile");
		paises.add("México");
		paises.add("Colombia");
		paises.add("Perú");
		paises.add("Ecuador");
		paises.add("Bolivia");
		paises.add("Paraguay");
		paises.add("Uruguay");
		paises.add("Venezuela");
		paises.add("Canadá");
		paises.add("Estados Unidos");
		paises.add("Francia");
		paises.add("España");
		paises.add("Alemania");
		paises.add("Italia");
		paises.add("Reino Unido");
		paises.add("Portugal");
		paises.add("Países Bajos");
		paises.add("Rusia");
		paises.add("China");
		paises.add("Japón");
		paises.add("Corea del Sur");
		paises.add("India");
		paises.add("Australia");
		paises.add("Sudáfrica");
		paises.add("Egipto");
		paises.add("Arabia Saudita");
		paises.add("Turquía");
		paises.add("Irán");
		paises.add("Pakistán");
		paises.add("Bangladesh");

		ArrayList<String> capitales = new ArrayList<>();

		capitales.add("Buenos Aires");
		capitales.add("Brasilia");
		capitales.add("Santiago");
		capitales.add("Ciudad de México");
		capitales.add("Bogotá");
		capitales.add("Lima");
		capitales.add("Quito");
		capitales.add("Sucre");
		capitales.add("Asunción");
		capitales.add("Montevideo");
		capitales.add("Caracas");
		capitales.add("Ottawa");
		capitales.add("Washington, D.C.");
		capitales.add("París");
		capitales.add("Madrid");
		capitales.add("Berlín");
		capitales.add("Roma");
		capitales.add("Londres");
		capitales.add("Lisboa");
		capitales.add("Ámsterdam");
		capitales.add("Moscú");
		capitales.add("Beijing");
		capitales.add("Tokio");
		capitales.add("Seúl");
		capitales.add("Nueva Delhi");
		capitales.add("Canberra");
		capitales.add("Pretoria");
		capitales.add("El Cairo");
		capitales.add("Riad");
		capitales.add("Ankara");
		capitales.add("Teherán");
		capitales.add("Islamabad");
		capitales.add("Daca");

		Random random = new Random();
		int poscorrecto = random.nextInt(paises.size());
		String capitalCorrecta = capitales.get(poscorrecto);
		
		Scanner scanner = new Scanner(System.in);

		ArrayList<String> preguntas = new ArrayList<>();

		preguntas.add(capitalCorrecta);

		while(preguntas.size()<4) {
			int posIncorrecto = random.nextInt(paises.size());
			String capitalIncorrecta = capitales.get(posIncorrecto);
			
			if(!preguntas.contains(capitalIncorrecta)) {
				preguntas.add(capitalIncorrecta);
			}
			
		}

		Collections.shuffle(preguntas);
		int pos = 0;
		
		
		
		System.out.println("El pais es: " + paises.get(poscorrecto));
		System.out.println();
		for(char opcion = 'a'; opcion <= 'd'; opcion++) {
			System.out.println(opcion + ": " + preguntas.get(pos++));
		}
		
		String jugador = scanner.nextLine().toLowerCase();
		
		int posicionCorrecta = preguntas.indexOf(capitalCorrecta);
		char letraCorrecta = (char) ('a' + posicionCorrecta); 
		
		if(jugador.charAt(0) == letraCorrecta) {
			System.out.println("Correcto");
		} else {
			System.out.println("La capital es " + capitalCorrecta);
		}
		
		}
}
