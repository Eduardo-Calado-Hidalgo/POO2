package ProjectoParking;

import java.util.Random;

public enum Marca {
	OP("Opel"),RE("Renault"),HY("Hyundai"),SE("Seat"),BM("BMV");
	
	private String nombre;

	private Marca(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}
	
	public static Marca obtenerMarca() {
		Random random = new Random();
		
		int aleatorio = random.nextInt(Marca.values().length);
		return Marca.values()[aleatorio];	
	}
}
