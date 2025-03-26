package IntroduccionHerencia;

public class _1_OverviewBefore {
    public static void main(String[] args) {
        Animal a1 = new Animal (250.0);
        Gato g1 = new Gato (6.0);
        Perro p1 = new Perro (40.5);
        
        a1.identificar();
        System.out.println(" y con peso " + a1.getPeso());
        g1.identificar();
        System.out.println(" y con peso " + g1.getPeso());
        p1.identificar();
        System.out.println(" y con peso " + p1.getPeso());
    }
}
