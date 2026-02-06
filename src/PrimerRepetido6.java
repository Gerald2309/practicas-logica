import java.util.ArrayList;

public class PrimerRepetido6 {

    public static int primerRepetido(ArrayList<Integer> datos){

        ArrayList<Integer> vistos = new ArrayList<>();

        for (int dato : datos){

            if(vistos.contains(dato)){
                return dato;
            }
            vistos.add(dato);
        }

        throw new IllegalArgumentException("No hay repetidos");
    }

}
