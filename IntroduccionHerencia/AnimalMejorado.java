package IntroduccionHerencia;


public class AnimalMejorado {
    private double peso;

    public AnimalMejorado(double peso) {
        this.peso = peso;
    }
    
    public void identificar(){
        System.out.print("Soy un ANIMAL mejorado");
    }

    public double getPeso() {
        return peso;
    }
}
