package primerosPasosConCollections;

public class Frase {
	 String[] palabras;
	 String frase;
	
	public Frase(String frase) {
		this.palabras = frase.split(" ");
	}

	@Override
	public String toString() {
		String resultado = "";
		for(String palabra: palabras) {
			resultado =  resultado + palabra + " ";
		}
		return resultado;
	}
	
	public void addPalabra(String palabra) {
		String[] arrayNuevo = new String[palabras.length + 1];
		String[] arrayViejo = palabras;
		for(int i = 0; i < arrayViejo.length;i++) {
			arrayNuevo[i] = arrayViejo[i];
		}
		arrayNuevo[arrayNuevo.length - 1] = palabra;
		palabras = arrayNuevo;
	}	
	
	public static void main(String[] args) {
		Frase f = new Frase("El perro mueve la cola");
		
		System.out.println(f);
		f.addPalabra("marron ");
		System.out.println(f);
	}
}
