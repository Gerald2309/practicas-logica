
public class vocales2 {

    public static int contarVocales(String palabraRecibida) {

        char[] palabra = palabraRecibida.toLowerCase().toCharArray();
        char[] vocales = {'a','e','i','o','u'};
        int contador = 0;

        for (char letra : palabra ){
            for (char vocal : vocales){
                if (letra == vocal){
                    contador += 1;
                    break;
                }
            }
        }
        return contador;

    }
}
