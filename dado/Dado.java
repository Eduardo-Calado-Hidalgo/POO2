package dado;

import java.util.Random;

public class Dado {
    
    private int lanzamiento;
    private int caras;
    private int[] historico /*= new int[10]*/;
    
    public Dado(int elementosDelHistorico) {
    	this.caras = caras;
    	historico = new int[elementosDelHistorico];
    }
    
    public int lanzar() {
    	Random random = new Random();
    	lanzamiento = random.nextInt(1, 7);
    	
    	for (int i = 1; i < historico.length; i++) {
			historico[i - 1] = historico[i];
		}
    	historico[historico.length - 1] = lanzamiento;
    	
    	return lanzamiento;
    }
    
    public int contarNumeroDeCaras(int lanzamientos, int numeroCara) {
    	int contador = 0;
    	boolean caraValida = numeroCara >= 1 && numeroCara <= caras;
    	if(caraValida) {
    	for (int i = 0; i < lanzamientos; i++) {
			if(lanzar() == numeroCara) {
				contador++;
			}
		}
    }
    return contador;
    }
    public void mostrarHistorico() {
    	
    }
    
    public static void main(String[] args) {
		Dado d1 = new Dado(10);
		for(int i = 0; i <10; i++) {
			d1.lanzar();
		}
		d1.mostrarHistorico();
		
	}
}
