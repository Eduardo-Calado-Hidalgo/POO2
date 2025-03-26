package PrimesosPasosEnum;

public enum Finde {
	VI(5,"Viernes","Friday"), SA(6,"Sabado","Saturday"), DO(7,"Domingo","Wednesdai");
	
	public int getNumeroDia() {
		return numeroDia;
	}

	public String getNombreIngles() {
		return nombreIngles;
	}

	private int numeroDia;
	private String nombre;
	public String getNombre() {
		return nombre;
	}

	private String nombreIngles;
	
	private Finde(int numeroDia, String nombre,String nombreIngles) {
		this.numeroDia = numeroDia;
		this.nombre = nombre;
		this.nombreIngles = nombreIngles;
	}

	public String presentacion() {
		return String.format("El %d de fin de semana es %s, en ingles %s", numeroDia,nombre,nombreIngles);
	}

	
}

