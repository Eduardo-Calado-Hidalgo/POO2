package IntroduccionHerencia;


public class PerroMejorado extends AnimalMejorado{

@Override
    public void identificar(){
        System.out.print("Soy un ANIMAL mejorado");
    }
    
   public PerroMejorado(double peso) {
        super(peso);
    }
    
    

    
}
