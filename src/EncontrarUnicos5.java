import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class EncontrarUnicos5 {

    public static ArrayList<Integer> encontrarUnicos (ArrayList<Integer> datos){

        Map<Integer, Integer> contador = new HashMap<>();

        for (Integer i : datos){
            if(!contador.containsKey(i)){
                contador.put(i, 1);
            }
            else {
                contador.put(i, contador.get(i) + 1);

            }

        }
        System.out.println(contador);

        ArrayList<Integer> unicos = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : contador.entrySet()) {
            if (entry.getValue() == 1) {
                unicos.add(entry.getKey());
            }
        }

        return unicos;


        }
    }





