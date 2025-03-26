package IntroduccionHerencia;


public class OsoMejorado extends AnimalMejorado{

@Override
    public void identificar(){
        System.out.print("Soy un ANIMAL mejorado");
    }
    
    public void rugir(int n){
        for(int i = 0; i <= n;i++){
        System.out.println("Grrrr");
        }
    }
   public OsoMejorado(double peso) {
        super(peso);
    }
    
    

    
}
