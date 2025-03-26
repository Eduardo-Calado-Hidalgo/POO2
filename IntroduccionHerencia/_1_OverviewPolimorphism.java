package IntroduccionHerencia;

public class _1_OverviewPolimorphism {

    public static void main(String[] args) {
        AnimalMejorado a1 = new GatoMejorado(5.0);
        AnimalMejorado a2 = new PerroMejorado(25.0);
        GatoMejorado a3 = new GatoMejorado(10.0);
        PerroMejorado a4 = new PerroMejorado(30.0);
        AnimalMejorado a5 = new OsoMejorado(800.0);
        OsoMejorado a6 = new OsoMejorado(1_000.0);
        
        a1.identificar();
        System.out.println(" y con peso " + a1.getPeso());
        
        a2.identificar();
        System.out.println(" y con peso " + a2.getPeso());
        
        a3.identificar();
        System.out.println(" y con peso " + a3.getPeso());
        
        a4.identificar();
        System.out.println(" y con peso " + a4.getPeso());
        
        a5.identificar();
        System.out.println(" y con peso " + a5.getPeso());
        ((OsoMejorado)a5).rugir(3);
        
        a6.identificar();
        System.out.println(" y con peso " + a6.getPeso());
        a6.rugir(5);
    }
}
