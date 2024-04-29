package laboratorio010pat;

public class Cafe {
    String descripcion;
    private boolean leche;
    private boolean soya;
    private boolean moca;
    private boolean crema;
    private double LECHE_COSTO;
    private double SOYA_COSTO;
    private double MOCA_COSTO;
    private double CREMA_COSTO;
    
    public Cafe() {
        
        LECHE_COSTO = 0.10;
        SOYA_COSTO = 0.15;
        MOCA_COSTO = 0.20;
        CREMA_COSTO = 0.10;
        
    }
    
    public double costo(){
        float total = 0;
        
        if(this.esCrema()){
            total += CREMA_COSTO;
        }
        
        if(this.esLeche()){
            total += LECHE_COSTO;
        }
        
        if(this.esMoca()){
            total += MOCA_COSTO;
        }
        
        if(this.esSoya()){
            total += SOYA_COSTO;
        }
        
        return Math.round(total*100.0)/100.0;
    }
    
    public boolean esLeche(){
        return leche;
    }
    
    public void setLeche(boolean leche){
        this.leche = leche;
    }
    
    public boolean esSoya(){
        return soya;
    }
    
    public void setSoya(boolean soya){
        this.soya = soya;
    }
    
    public boolean esMoca(){
        return moca;
    }
    
    public void setMoca(boolean moca){
        this.moca = moca;
    }
    
    public boolean esCrema(){
        return crema;
    }
    
    public void setCrema(boolean crema){
        this.crema = crema;
    }
    
    public String getDescription(){
        String str = "";
        
        if(this.esCrema()){
            str += ", crema";  
        }
        
        if(this.esLeche()){
            str += ", leche";   
        }
        
        if(this.esMoca()){
            str += ", moca";  
        }
        
        if(this.esSoya()){  
            str += ", soya"; 
        }
        
        return str;
    }
}
