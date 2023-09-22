package batalhatanques;

public class Factory{

    public static Tanque criarTanque(CoresRGB corTanque, CoresRGB corCanhão, double x, double y) {
        Tanque tanque = new Tanque();
        tanque.setCorTanque(corTanque);
        tanque.setCorCanhao(corCanhão);
        tanque.setX(x);
        tanque.setY(y);
        return tanque;
    }
    
}
