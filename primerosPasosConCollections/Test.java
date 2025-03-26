package primerosPasosConCollections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {

		ArrayList<Integer> numerosPares = new ArrayList<Integer>();
		int n = 10;

		for (int i = 0; numerosPares.size() <= n; i++) {
			if (i % 2 == 0) {
				numerosPares.add(i);
			}
		}

		System.out.println(numerosPares);

		ArrayList<Integer> numerosMultiplos = new ArrayList<Integer>();

		int nM = 10;

		int m = 9;
		int p = 3;

		for (int i = 0; numerosMultiplos.size() <= nM; i++) {
			if (i % p == 0 && i % m == 0) {
				numerosMultiplos.add(i);
			}
		}

		System.out.println(numerosMultiplos);

		ArrayList<String> letrasAleatorias = new ArrayList<String>();
		ArrayList<String> terminaEnAC = new ArrayList<String>();
		Random random = new Random();

		for (int i = 0; i < 1000; i++) {
			String palabraAleatoria = "";
			for (int palabra = 0; palabra < 4; palabra++) {
				palabraAleatoria += (char) random.nextInt('a', 'z' + 1);
			}
			letrasAleatorias.add(palabraAleatoria);
			if (palabraAleatoria.endsWith("c") || palabraAleatoria.endsWith("a")) {
				terminaEnAC.add(palabraAleatoria);
			}
		}

		System.out.println(letrasAleatorias);

		System.out.println(terminaEnAC);

		ArrayList<Integer> intentos = new ArrayList<Integer>();

		int numrandom = random.nextInt(1, 100) + 1;
		int intento;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Introduce tu intento: ");
		intento = scanner.nextInt();

		while (numrandom != intento) {

			System.out.println("Introduce tu nuevo intento: ");
			intento = scanner.nextInt();

			if (numrandom == intento) {
				System.out.println("El numero es igual");
				System.out.println(intentos);
				break;
			} else if (numrandom < intento) {
				System.out.printf("Lo has conseguido! %d es mayor que %d%n", intento, numrandom);
				System.out.println(intentos);
				break;
			}
			intentos.add(intento);
		}
	}
}
