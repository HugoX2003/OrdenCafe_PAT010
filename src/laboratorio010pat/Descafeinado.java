package laboratorio010pat;

public class Descafeinado extends Cafe {
    private double costoDescafeinado = 1.05;
    
    public double costo(){
        double costo = super.costo() + costoDescafeinado;
        
        return costo;
    }
    
    public String getDescription(){
           String str = "Su orden Cafe Descafeinado" + super.getDescription();
        
           return str;
    }
}
