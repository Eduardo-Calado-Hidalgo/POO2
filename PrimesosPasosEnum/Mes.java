package PrimesosPasosEnum;

public enum Mes {
	ENE(1,"ENERO"), FEB(2,"FEBRERO"), MAR(3,"MARZO"),ABR(4,"ABRIL"), MAY(5,"MAYO"), JUN(6,"JUNIO"),JUL(7,"JULIO"),
	AGO(8,"AGOSTO"),SEP(9,"SEPTIEMBRE"),OCT(10,"OCTUBRE"),NOV(11,"NOVIEMBRE"),DIC(12,"DICIEMBRE");
	
	private int num;
	private String nombre;
	
	private Mes(int num, String nombre) {
		this.num = num;
		this.nombre = nombre;
	}

	public int getNum() {
		return num;
	}

	public String getNombre() {
		return nombre;
	}
	
	
}
