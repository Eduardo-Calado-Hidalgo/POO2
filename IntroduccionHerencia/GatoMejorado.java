package IntroduccionHerencia;


public class GatoMejorado extends AnimalMejorado{

    public void identificar(){
        System.out.print("Soy un ANIMAL mejorado");
    }

    public GatoMejorado(double peso) {
        super(peso);
    }

    
}
