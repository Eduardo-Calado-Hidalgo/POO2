package primerosPasosGenerics;

public class Test {
public static void main(String[] args) {
	Moneda a1 = new Moneda("Moneda 1");
	
	CajaDeMonedas ca1 = new CajaDeMonedas(a1);
	CajaDeMonedas ca2 = new CajaDeMonedas(new Moneda("Moneda 2"));
	CajaDeString ca3 = new CajaDeString("String1");
	System.out.println(ca1);
	System.out.println(ca2);
	System.out.println(ca3);
	Caja c1 = new Caja(new Moneda ("Otra moneda"));
	Caja c2 = new Caja("Otra moneda");
	System.out.println(c1);
	System.out.println(c2);
	
	Caja<String> c10 = new Caja<>("caja generica 1");
	System.out.println(c10.getContenido().toUpperCase());
	Caja<Moneda> c11 = new Caja<>(new Moneda("Moneda maravillosa"));
	System.out.println(c11.getContenido());
	
	Pareja1<String,String> p1 = new Pareja1<>("Hola","Adios");
	System.out.println(p1);
	
	EstanteDeCosas<String> e1 = new EstanteDeCosas<>(new String[] {"1","22"}); 
	System.out.println(e1);
	
	Box<String> b1 = Box.of("Hola"); 
	Box<String> b2 = Box.of(null); 
	Box<String> b3 = Box.empty(); 
	System.out.println(b1.isPresent());
	System.out.println(b2.isPresent());
	System.out.println(b3.isPresent());
	
	Trio<String,String,String> t1 = new Trio<>("a","a","a");
	
	}
}
