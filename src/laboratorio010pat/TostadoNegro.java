package laboratorio010pat;

public class TostadoNegro extends Cafe {
    
    private double costoTostado = 0.99;
    
    public double costo(){
        double costo = super.costo() + costoTostado;
        
        return costo;
    }
    
    public String getDescription(){
           String str = "Su orden Tostado Negro" + super.getDescription();
        
           return str;
    }
}
