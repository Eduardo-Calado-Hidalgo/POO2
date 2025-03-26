package primerosPasosConCollections;


public class CuentaAtras {
	private int[] listaNumeros;
	
	public CuentaAtras(int numeroInicial, int numeroFinal) {
		
		listaNumeros = new int [numeroInicial - numeroFinal + 1];
		
		for(int i = 0; i < listaNumeros.length; numeroInicial++) {
			listaNumeros[i] = numeroInicial--;
		}
	}
	
	@Override
	public String toString() {
		String resultado = "";
		
		for(int cuenta:listaNumeros) {
		  resultado = cuenta + "...";
		}
		return resultado;
	}
	
	public void QuitaUno() {
		int[] arrayViejo = listaNumeros;
		int[] arrayNuevo = new int[arrayViejo.length - 1];
		
		for(int i = 0; i < arrayNuevo.length;i++) {
			arrayNuevo[i] = arrayViejo[i];
		}
		
		listaNumeros = arrayNuevo;
	}
	
	public static void main(String[] args) {
		CuentaAtras c = new CuentaAtras(5, 2);
		
		System.out.println(c);
	}
}
