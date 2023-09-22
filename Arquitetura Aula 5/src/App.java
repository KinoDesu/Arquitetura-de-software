import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List lista = Factory.criarLista(EnumList.ARRAYLIST);
        lista.add("ar");
        lista.add("terra");
        lista.add("fogo");
        lista.add("água");
        lista.add(23);
        for (Object item : lista) {
            System.out.println(item);
        }
    }
}
