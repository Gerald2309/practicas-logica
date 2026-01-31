import java.util.Map;

public class Main {
    public static void main(String[] args) {

//        Integer[] enteros = {2, 3, 5, 7, 6, 4, 8, 9, 12, 34, 55};
//        Pares1.parOImpar(enteros);
//
//        int cantidadVocales = vocales2.contarVocales("Hola, mi nombre es Geraldine");
//        System.out.println("La palabra/frase indicada tiene "+ cantidadVocales + " vocales");

        Map<Character, Integer> resultado =
                ContarLetras3.contarLetras("Holaa ola b");

        System.out.println(resultado);

    }
}


