package IntroduccionHerencia;


public class _1_OverviewAfter{

    public static void main(String[] args) {
        AnimalMejorado a1 = new AnimalMejorado(250.0);
        GatoMejorado g1 = new GatoMejorado(6.0);
        PerroMejorado p1 = new PerroMejorado(40.5);
        
        a1.identificar();
        System.out.println(" y con peso " + a1.getPeso());
        g1.identificar();
        System.out.println(" y con peso " + g1.getPeso());
        p1.identificar();
        System.out.println(" y con peso " + p1.getPeso());
    }
}
