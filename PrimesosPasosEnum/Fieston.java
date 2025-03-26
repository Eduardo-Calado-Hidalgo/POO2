package PrimesosPasosEnum;

public class Fieston {
	private String lugar;
	private Finde dia;
	private Mes mes;
	
	public Fieston(String lugar, Finde dia, Mes mes) {
		this.lugar = lugar;
		this.dia = dia;
		this.mes = mes;
	}
	
	@Override
	public String toString() {
		return "Fieston [lugar=" + lugar + ", dia=" + dia + ", mes=" + mes + "]";
	}
	
	public static void main(String[] args) {
		Fieston f = new Fieston("Core", Finde.SA,Mes.ABR);
		System.out.println(f);
		for (Finde bucle: Finde.values()) {
			System.out.println(bucle);;	
		}
		
	}
}
