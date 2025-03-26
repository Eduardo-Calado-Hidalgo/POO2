package primerosPasosConCollections;

import java.util.ArrayList;

public class ArrayEjemplo1 {
	public static void main(String[] args) {
		ArrayList<String> colores = new ArrayList<String>();
		
			for(int i = 0; i<3;i++) {
				colores.add("rojo");
				colores.add("amarillo");
				colores.add("verde");
				colores.add("amarillo");
				colores.add("azul");
				colores.add("naranja");
				colores.add("marron");
				colores.add("verde");
				}
		
		
			System.out.println(colores.size());
			System.out.println("-------------------------------------------------");
			System.out.println("Imprimir con bucle for:");
			
			for(int i = 0; i<colores.size();i++) {
				System.out.print(colores.get(i) + " ");
			}
			
			System.out.println("-------------------------------------------------");
			System.out.println("Bucle con foreach:");
			
			for(String pos:colores) {
				System.out.print(pos + " ");
			}
			System.out.println("-------------------------------------------------");
			System.out.println("Segundo rojo eliminado:");
			colores.remove(4);
			System.out.print(colores);
			
			System.out.println("-------------------------------------------------");
			System.out.println("Eliminar amarillo:");
			for(int i = 0;i < colores.size();i++) {
				while(colores.get(i) == "amarillo") {
					colores.remove(i);
				}
			}
			System.out.println(colores);
			
	}
	
}
