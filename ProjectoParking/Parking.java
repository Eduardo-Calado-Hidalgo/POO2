package ProjectoParking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class Parking {
	private String nombre;
	private int totalDePlazas;
	private List<Coche> listaDeCoches;
	private HashMap<Color, Integer> coloresCoches;
	private HashMap<Marca, Integer> marcaCoches;
	private HashMap<Coche, Integer> cochesIguales;
	private HashSet<Coche> setCoches;
	
	public Parking(String nombre, int totalDePlazas) {
		this.nombre = nombre;
		this.totalDePlazas = totalDePlazas;
		this.listaDeCoches = new ArrayList<Coche>();
		this.coloresCoches = new HashMap<Color, Integer>();
		this.marcaCoches = new HashMap<Marca, Integer>();
		this.cochesIguales = new HashMap<Coche, Integer>();
		this.setCoches = new HashSet<Coche>();
	}
	
	public boolean entraCoche(Coche c) {
		if(listaDeCoches.size() < totalDePlazas) {
			listaDeCoches.add(c);
			coloresCoches.put(c.getColor(), coloresCoches.getOrDefault(c.getColor(), 0) + 1);
			marcaCoches.put(c.getMarca(), marcaCoches.getOrDefault(c.getMarca(), 0) + 1);
			setCoches.add(c);
			System.out.println("El coche ha entrado al parking");
			//CochesIguales
			if (listaDeCoches.contains(c)) {
	            cochesIguales.put(c, cochesIguales.getOrDefault(c, 0) + 1);
	            return true;
	        }
			return true;
		}  
			System.out.println("No hay espacio suficiente");
			return false;
		} 
	
	public boolean saleCoche(Coche coche) {

		boolean cocheDentro = false;
		for (int i = 0; i < listaDeCoches.size(); i++) {
			if (listaDeCoches.get(i) == coche) {
				listaDeCoches.remove(i);
				cocheDentro = true;
				System.out.println("Sale un coche");
				break;
			}
		}

		if (!cocheDentro) {
			System.out.println("No puede salir el coche");
			return false;
		}

		ColorCont(coche);
		MarcaCont(coche);
		CochesIguales(coche);

		return true;
	}

	private void ColorCont(Coche coche) {
		int cont = coloresCoches.getOrDefault(coche.getColor(), 0);
		if (cont > 0) {
			coloresCoches.put(coche.getColor(), cont - 1);
		}
	}

	private void MarcaCont(Coche coche) {
		int cont = marcaCoches.getOrDefault(coche.getMarca(), 0);
		if (cont > 0) {
			marcaCoches.put(coche.getMarca(), cont - 1);
		}
	}
	
	private void CochesIguales(Coche coche) {
		int cont = cochesIguales.getOrDefault(coche, 0);

		if (cont == 1) {
			cochesIguales.remove(coche);
		} else {
			cochesIguales.put(coche, cont - 1);
		}
	}
	
	
	public Coche saleCocheAleatorio() {
		if (!listaDeCoches.isEmpty()) {
			Random random = new Random();
			int idxCocheAleatorio = random.nextInt(listaDeCoches.size());
			Coche cocheSacado = listaDeCoches.remove(idxCocheAleatorio);
			
			coloresCoches.put(cocheSacado.getColor(), coloresCoches.get(cocheSacado.getColor()) -1 );
			marcaCoches.put(cocheSacado.getMarca(), marcaCoches.get(cocheSacado.getMarca()) - 1);
			cochesIguales.put(cocheSacado, cochesIguales.get(cocheSacado) - 1);
			setCoches.remove(cocheSacado);
			return cocheSacado;
		}
		return null;
	}
	
	public boolean vaciarParking() {
		while(!listaDeCoches.isEmpty()) {
			saleCocheAleatorio();
		}
		return true;
	}
	
	public void mostrarParking() {
		
		 int plazasRestantes = totalDePlazas - listaDeCoches.size();
		
		System.out.println("\nLISTADO DE COCHES");
		System.out.println("-----------------");
		
		for (Coche coche : listaDeCoches) {
			System.out.println(coche.getMarca().getNombre() + " " + coche.getColor().getNombre());
		}
		System.out.println();
		System.out.println("Total de coches: " + listaDeCoches.size() + ", plazas libres: " + 
		plazasRestantes);
	}
	
	public void reportColores() {
		
		System.out.println("\nREPORT DE COLORES");
		System.out.println("-----------------");
		for (Color color : coloresCoches.keySet()) {
			if(coloresCoches.get(color) == 1) {
				System.out.printf("El color %s se repite %d vez%n",color.getNombre(),
						coloresCoches.get(color));
			} else if(coloresCoches.get(color) > 1) {
			System.out.printf("El color %s se repite %d veces%n",color.getNombre(),
					coloresCoches.get(color));
			}
		}
		
		int totalCoches = 0;
		
		for(int cantidad : coloresCoches.values()) {
			totalCoches+=cantidad;
		}
		
		System.out.println("\nTotal de coches: \n" + totalCoches);
	}
	
	public void reportMarcas() {
		System.out.println("\nREPORT DE MARCAS");
		System.out.println("-----------------");
		for (Marca marca : marcaCoches.keySet()) {
			if(marcaCoches.get(marca) == 1) {
				System.out.printf("El coche de marca %s se repite %d vez%n",marca.getNombre(),
						marcaCoches.get(marca));
			} else if(marcaCoches.get(marca) > 1) {
			System.out.printf("El coche de marca %s se repite %d veces%n",marca.getNombre(),
					marcaCoches.get(marca));
			}
		}
		
		int totalCoches = 0;
		
		for(int cantidad : coloresCoches.values()) {
			totalCoches+=cantidad;
		}
		
		System.out.println("\nTotal de coches: \n" + totalCoches);
	}
	
	public void reportCochesIguales() {
		System.out.println("REPORT DE COCHES IGUALES");
		System.out.println("-----------------");
		for (Coche coche : cochesIguales.keySet()) {
			if(cochesIguales.get(coche) == 1) {
				System.out.printf("El coche de marca %s %s se repite %d vez%n",coche.getMarca().getNombre(),coche.getColor().getNombre()
						,cochesIguales.get(coche) );
			} else if(cochesIguales.get(coche) > 1) {
			System.out.printf("El coche de marca %s %s se repite %d veces%n",coche.getMarca().getNombre(),coche.getColor().getNombre()
					,cochesIguales.get(coche) );
			} else if(cochesIguales.get(coche) < 0) {
				System.out.println("No hay ningun coche");
			}
				
		}
		
		int totalCoches = 0;
		
		for(int cantidad : cochesIguales.values()) {
			totalCoches+=cantidad;
		}
		
		System.out.println("\nTotal de coches: \n" + totalCoches);
	}
	
	public void reportSetCoches() {
		
		System.out.println("REPORT SET DE COCHES");
		System.out.println("-----------------");
		for (Coche coche : setCoches) {
				System.out.printf("Coche: %s %s%n",coche.getMarca().getNombre(),coche.getColor().getNombre(),cochesIguales.get(coche) );
			}
		
		System.out.println("\nTotal items: " + setCoches.size());
	}
	
	public void mostrarTodo() {
		mostrarParking();
		reportColores();
		reportMarcas();
		reportCochesIguales();
		reportSetCoches();
	}
	
	public String getNombre() {
		return nombre;
	}

	public int getTotalDePlazas() {
		return totalDePlazas;
	}

	public List<Coche> getListaDecoches() {
		return listaDeCoches;
	}
}
