package ProjectoParking;

public class Test {

	public static void main(String[] args) {
		
		Parking parking1 = new Parking ("Nuevo Parking 1",12);
		
		Coche c1 = new Coche (Marca.SE,Color.RO);
		Coche c2 = new Coche (Marca.SE,Color.RO);
		Coche c3 = new Coche (Marca.SE,Color.RO);
		
		// Parte 1
		System.out.println("PARTE 1");
		System.out.println();
		
		parking1.entraCoche(c1);
		parking1.entraCoche(c2);
		parking1.entraCoche(c3);
		
		System.out.println();
		
		
		System.out.println("SE BORRA COCHE");
		
		parking1.saleCoche(c2);
		
		System.out.println();
		System.out.println("SE BORRA OTRO COCHE OTRA VEZ");
		parking1.saleCoche(c2);
		
		parking1.mostrarTodo();
		System.out.println();
		System.out.println();
		
		parking1.vaciarParking();
		//Parte 2
		System.out.println();
		System.out.println("PARTE 2");
		System.out.println();
		
		parking1.entraCoche(c1);
		parking1.entraCoche(c2);
		parking1.entraCoche(c3);
		
		parking1.saleCocheAleatorio();
		parking1.saleCocheAleatorio();
		parking1.saleCocheAleatorio();
		parking1.saleCocheAleatorio();
		
		parking1.mostrarTodo();
		System.out.println();
		System.out.println();
		//Parte 3
		System.out.println();
		System.out.println("PARTE 3");
		System.out.println();
		parking1.entraCoche(c1);
		parking1.entraCoche(c2);
		parking1.entraCoche(c3);
		
		Coche cocheSacadoAleatorio = parking1.saleCocheAleatorio();
		
		parking1.entraCoche(cocheSacadoAleatorio);
		
		parking1.mostrarTodo();
		System.out.println();
		// Parte 4
		System.out.println();
		System.out.println("PARTE 4");
		System.out.println();
		parking1.vaciarParking();
		parking1.saleCocheAleatorio();
		parking1.saleCoche(c1);
		parking1.mostrarTodo();
		
		//Parte 5
		System.out.println();
		System.out.println("PARTE 5");
		System.out.println();
		
		for(int i = 0; i <= parking1.getTotalDePlazas() + 5;i++) {
			Coche c = new Coche(Marca.BM,Color.AM);
			parking1.entraCoche(c);
		}
		
		parking1.mostrarTodo();
		
	}
	
}
