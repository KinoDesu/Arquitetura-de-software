import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Factory {
    public static List criarLista(EnumList tipo){
        if(tipo.equals(EnumList.ARRAYLIST)){
            return new ArrayList<>();
        }else if(tipo.equals(EnumList.LINKEDLIST)){
            return new LinkedList<>();
        }else if(tipo.equals(EnumList.VECTOR)){
            return new Vector<>();
        }
        return null;
    }
}