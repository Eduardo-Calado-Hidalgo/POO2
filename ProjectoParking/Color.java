package ProjectoParking;

import java.util.Random;

public enum Color {
	RO("Rojo"),NA("Naranja"),AM("Amarillo"),VE("Verde"),AZ("Azul"),IN("Indigo"),VI("Violeta");
	
	private String nombre;

	private Color(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}
	
	public static Color obtenerColor() {
		Random random = new Random();
		
		int aleatorio = random.nextInt(Marca.values().length);
		return Color.values()[aleatorio];
	}
	
	
	
}
