package primerosPasosConCollections;

import java.util.ArrayList;

public class Frase2 {
	private ArrayList<String> palabras;
	
	public Frase2(String frase) {
		palabras = new ArrayList<String>();
		String [] arrayPalabras = frase.split(" ");
		for(String palabra:frase.split(" ")) {
			palabras.add(palabra);
		}
	}
	
	@Override
	public String toString() {
		String resultado = "";
		for(String palabra: palabras) {
			resultado =  resultado + palabra + " ";
		}
		return resultado;
	}
	public static void main(String[] args) {
		Frase f = new Frase("El perro mueve la cola");
		
		System.out.println(f);
		f.addPalabra("marron ");
		System.out.println(f);
	}
}
