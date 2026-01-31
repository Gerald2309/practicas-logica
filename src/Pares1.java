import java.util.ArrayList;
import java.util.List;

public class Pares1 {

    public static void parOImpar(Integer[] enteros){

        List<Integer> pares = new ArrayList<>();

        for (Integer entero : enteros) {
            if (entero % 2 == 0) {
                pares.add(entero);
            }
        }
        System.out.print(pares + ", ");
    }

}
