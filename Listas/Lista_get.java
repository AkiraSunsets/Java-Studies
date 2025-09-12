import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>();
        lista.add("Kety"); //adiciona novo item a lista
        lista.add("Leonardo");
        System.out.println(lista);
        System.out.println(lista.get(1)); //mostra pelo indice
    }
}
