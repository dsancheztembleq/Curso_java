package sesion1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio1 {
    public static void main(String[] args) {
        
        boolean resultado  = false;
        List<Integer> lista;
        Integer k = (lista = new ArrayList<>(Arrays.asList(args).stream().map(Integer::valueOf).toList())).remove(0);
        Integer numSum = 0;

       for (Integer integer : lista) {
            numSum = numSum + integer;
            if(k==numSum){
                resultado = true;
                break;
            }
            else{
                numSum = integer;
            }
       }

        System.out.println(resultado);
    }
}
