package juegos;

public class undirLaFlota {
	
public static void main(String[] args) {
	
	char [][] cuadricula = new char[5][5];
	
	for(int llenar = 0;llenar < 5;llenar++) {
		for(int j = 0; j < 5; j++) {
			cuadricula[llenar][j] = ' ';
		}
	}
	
	int fila;
	int columna;
	
	System.out.println("   1  2  3  4  5");
	for(fila = 0; fila < 5;fila++) {
		System.out.print(fila + 1);
		for(columna = 0;columna< 5;columna++) {
			System.out.print(" |" + cuadricula[fila][columna]);
			if(columna == 4) {
				System.out.println(" |");
			}
		}
		System.out.print("  ");
		for(int raya = 0; raya <8;raya++) {
			System.out.print("--");
		}
		System.out.print("  ");
		System.out.println();
	}
	
	}

}
