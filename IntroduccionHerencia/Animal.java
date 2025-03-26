package IntroduccionHerencia;

public class Animal {
    private double peso;

    public Animal(double peso) {
        this.peso = peso;
    }
    
    public void identificar(){
        System.out.print("Soy un ANIMAL");
    }

    public double getPeso() {
        return peso;
    }
}
