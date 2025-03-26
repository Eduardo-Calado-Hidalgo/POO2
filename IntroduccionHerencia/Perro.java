package IntroduccionHerencia;

public class Perro {
    private double peso;

    public Perro(double peso) {
        this.peso = peso;
    }
    
    public void identificar(){
        System.out.print("Soy un PERRO");
    }
    
    public double getPeso() {
        return peso;
    }
}
