import java.util.HashMap;
import java.util.Map;

public class ContarLetras3 {

    public static Map<Character, Integer> contarLetras(String texto) {
        Map<Character, Integer> conteo = new HashMap<>();

        for (char letra : texto.toLowerCase().toCharArray()) {

            // Validación temprana: ignorar espacios
            if (letra == ' ') {
                continue;
            }

            // Obtener valor actual o 0 si no existe
            int cantidadActual = conteo.getOrDefault(letra, 0);

            // Actualizar conteo
            conteo.put(letra, cantidadActual + 1);
        }

        return conteo;
    }




//    public static HashMap<Character, Integer> contarLetras (String palabraRecibida){
//        HashMap<Character, Integer> cantidadLetras = new HashMap<Character, Integer>();
//
//        char[] palabra = palabraRecibida.toLowerCase().toCharArray();
//
//        for (char letra : palabra){
//
//            if (!cantidadLetras.containsKey(letra)){
//
//                if(letra != ' '){
//                    cantidadLetras.put(letra, 1);
//
//                }
//
//            }else {
//
//                int contador = cantidadLetras.get(letra);
//                cantidadLetras.put(letra, contador +1);
//            }
//        }
//        return cantidadLetras;
//    }




}
