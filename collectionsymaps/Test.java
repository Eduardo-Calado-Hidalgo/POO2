package collectionsymaps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Test {

	
	public static String devuelvePalabras(String limpiador) {		
		limpiador = limpiador.replaceAll(",","");
		limpiador = limpiador.replaceAll("\\.","");
		limpiador = limpiador.replaceAll("\\n","");
		return limpiador;
	}
	
	public static void arrayPalabras (String palabra) {
		
		String[] palabras =  palabra.split(" ");
		
        System.out.println("Array de palabras");
        System.out.println("=================");
        
        for (String bucle : palabras) {
            System.out.print("[" + bucle + "]");
        }
	}
	
	public static void arrayListPalabras(String palabrasArray) {
		
		ArrayList<String> palabras = new ArrayList<String>();
		
		String[] p = palabrasArray.split(" ");
		
		for (String bucle : p) {
			palabras.add(bucle);
		}
		
		System.out.println("ArrayList de palabras");
        System.out.println("=================");
        
        for (String bucle2 : palabras) {
			System.out.print("[" +bucle2 + "]");
		}
	}
	
	public static void hashSetPalabras(String texto) {
		
        HashSet<String> palabras = new HashSet<>();
        
        String[] palabrasArray = texto.split(" ");
        
        for (String palabra : palabrasArray) {
            palabras.add(palabra);
        }
        
        System.out.println("HashSet de palabras");
        System.out.println("====================");
        
        for (String palabra : palabras) {
            System.out.print("[" + palabra + "] ");
        }
        System.out.println("\nLista en HashSet tiene " + palabras.size() + " palabras.");
	}
	
	public static void treeSetPalabras(String texto) {
		
		TreeSet<String> palabras = new TreeSet<String>();
        
        String[] palabrasArray = texto.split(" ");
        
        for (String palabra : palabrasArray) {
            palabras.add(palabra);
        }
        
        System.out.println("HashSet de palabras");
        System.out.println("====================");
        
        for (String palabra : palabras) {
            System.out.print("[" + palabra + "] ");
        }
        System.out.println("\nLista en HashSet tiene " + palabras.size() + " palabras.");
	}
	
	public static void ContadorPalabras(String[] palabras) {

	        Map<String, Integer> conteo = new HashMap<String, Integer>();

	        for (String palabra : palabras) {
	            conteo.put(palabra, conteo.getOrDefault(palabra, 0) + 1);
	        }

	        System.out.println("Conteo de repeticiones de palabras");
	        System.out.println("==================================");
	        for (Map.Entry<String, Integer> entry : conteo.entrySet()) {
	            System.out.println("[" + entry.getKey() + "(" + entry.getValue() + ")]");
	        }
	    }

	    public static void mapConteoPalabrasOrdenadas(String[] palabras) {
	    	
	        Map<String, Integer> conteo = new HashMap<>();

	        for (String palabra : palabras) {
	            conteo.put(palabra, conteo.getOrDefault(palabra, 0) + 1);
	        }

	        Map<String, Integer> conteoOrdenado = new TreeMap<>(conteo);

	        System.out.println("Conteo de repeticiones de palabras");
	        System.out.println("==================================");
	        for (Map.Entry<String, Integer> entry : conteoOrdenado.entrySet()) {
	            System.out.println("[" + entry.getKey() + "(" + entry.getValue() + ")]");
	        }
	    }
	    
	    public static void mapConteoPalabrasOrdenadasAlReves(String[] palabras) {
	    	
	        Map<String, Integer> conteo = new HashMap<>();

	        for (String palabra : palabras) {
	            conteo.put(palabra, conteo.getOrDefault(palabra, 0) + 1);
	        }

	        Map<String, Integer> conteoOrdenadoAlReves = new TreeMap<>(Collections.reverseOrder());
	        
	        conteoOrdenadoAlReves.putAll(conteo);
	        
	        System.out.println("Conteo de repeticiones de palabras");
	        System.out.println("==================================");
	        for (Map.Entry<String, Integer> entry : conteoOrdenadoAlReves.entrySet()) {
	            System.out.println("[" + entry.getKey() + "(" + entry.getValue() + ")]");
	        }
	    }

	    public static void main(String[] args) {
	    
	        String[] palabras = {
	            "creciera", "de", "venderla", "lo", "con", "de", "con", "de", "lo", "de", "con", "lo"
	        };

	       mapConteoPalabrasOrdenadas(palabras);
	        mapConteoPalabrasOrdenadasAlReves(palabras);
	    }
	}
