/**
 * Factory
 */
public class Factory {
    public static Integer pegarArestas(EnumForma forma) {
        switch (forma) {
            case QUADRADO:
                return new Quadrado().getArestas();
            case TRIANGULO:
                return new Triangulo().getArestas();
            case CIRCULO:
                return new Circulo().getArestas();
            case CUBO:
                return new Cubo().getArestas();
            default:
                return null;
        }
    }
}