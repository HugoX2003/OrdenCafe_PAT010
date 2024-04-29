
package laboratorio010pat;

/**
 *
 * @author Márquez Diestra, Hugo
 */
public class Laboratorio010PAT {
    public static void main(String[] args) {
        Cafe c1 = new Expreso();
        c1.setCrema(true);
        System.out.println(c1.getDescription() + "\nTotal = " + c1.costo());
        
        c1 = new Descafeinado();
        c1.setMoca(true);
        System.out.println(c1.getDescription() + "\nTotal = " + c1.costo());
        
        c1 = new Batido();
        c1.setLeche(true);
        System.out.println(c1.getDescription() + "\nTotal = " + c1.costo());
        
        c1 = new TostadoNegro();
        c1.setLeche(true);
        c1.setSoya(true);
        System.out.println(c1.getDescription() + "\nTotal = " + c1.costo());
        
        c1 = new Expreso();
        c1.setLeche(true);
        c1.setSoya(true);
        c1.setSoya(true);
        c1.setSoya(true);
        c1.setSoya(true);
        c1.setSoya(true);
        c1.setSoya(true);
        c1.setMoca(true);
        c1.setCrema(true);
        System.out.println(c1.getDescription() + "\nTotal = " + c1.costo());
    }
}

//La única limitación del siguiente código es que no me deja agregar más de una vez el mismo agregado.
