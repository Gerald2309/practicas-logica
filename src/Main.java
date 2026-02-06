import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

//        Integer[] enteros = {2, 3, 5, 7, 6, 4, 8, 9, 12, 34, 55};
//        Pares1.parOImpar(enteros);
//
//        int cantidadVocales = vocales2.contarVocales("Hola, mi nombre es Geraldine");
//        System.out.println("La palabra/frase indicada tiene "+ cantidadVocales + " vocales");

//        Map<Character, Integer> resultado =
//                ContarLetras3.contarLetras("Holaa ola b");
//
//        System.out.println(resultado);

//        ArrayList<String> lista = new ArrayList<>();
//
//        lista.add("a");
//        lista.add("b");
//        lista.add("c");
//        lista.add("a");
//
//        ArrayList<String> resultado = EliminarDuplicados4.eliminarDuplicados(lista);
//        System.out.println(resultado);

        ArrayList<Integer> datos = new ArrayList<>();

        datos.add(4);
        datos.add(7);
        datos.add(3);
        datos.add(5);
        datos.add(5);
        datos.add(5);
        datos.add(6);
        datos.add(6);

//        ArrayList<Integer> unicos =  EncontrarUnicos5.encontrarUnicos(datos);
//        System.out.println(unicos.getFirst());

        int repetido = PrimerRepetido6.primerRepetido(datos);
        System.out.println(repetido);


    }
}


