import java.util.ArrayList;
import java.util.Arrays;

public class HackerRank {

    public static ArrayList<Integer> compararTriples(ArrayList<Integer>a, ArrayList<Integer>b){
        int contA = 0, contB = 0;
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i) > b.get(i)){
                contA++;
            }else if(a.size() < b.size()){
                contB++;
            }else {}
        }
        ArrayList<Integer>lista = new ArrayList<>(Arrays.asList(contA,contB));
        return lista;
    }


}
