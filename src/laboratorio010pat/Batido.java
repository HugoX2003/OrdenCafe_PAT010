package laboratorio010pat;

public class Batido extends Cafe {
    private double costoBatido = 0.89;
    
    public double costo(){
        double costo = super.costo() + costoBatido;
        
        return costo;
    }
    
    public String getDescription(){
           String str = "Su orden Cafe Batido" + super.getDescription();
        
           return str;
    }
}
