package laboratorio010pat;

public class Expreso extends Cafe {
    private double costoExpreso = 1.99;
    
    public double costo(){
        double costo = super.costo() + costoExpreso;
        
        return costo;
    }
    
    public String getDescription(){
           String str = "Su orden Cafe Expreso" + super.getDescription();
        
           return str;
    }
}
