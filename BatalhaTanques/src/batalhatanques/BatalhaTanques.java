
package batalhatanques;

public class BatalhaTanques {
 
    public static void main(String[] args) {
        Tanque t1 = Factory.criarTanque(CoresRGB.RED, CoresRGB.GREEN, 1, 2);
        System.out.println(t1);
    }
    
}
