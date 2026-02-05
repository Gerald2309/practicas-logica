import java.util.ArrayList;

public class EliminarDuplicados4 {

    public static ArrayList<String> eliminarDuplicados(ArrayList<String> lista){
        ArrayList<String> listaSinDuplicados = new ArrayList<String>();


        for(String i : lista){
            boolean existe = false;
            for (String j : listaSinDuplicados){
                if (i.equals(j)){
                    existe = true;
                    break;
                }
            }
            if(!existe){
                listaSinDuplicados.add(i);
            }
        }



        return listaSinDuplicados;
    }


}
