package sesion1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio1 {
    public static void main(String[] args) {
        
        boolean resultado = false;
        List<Integer> lista;
        Integer k = (lista = new ArrayList<>(Arrays.asList(args).stream().map(Integer::valueOf).toList())).remove(0);
        Integer posicion1 = 0;
        Integer posicion2 = 0;

        for (Integer integer : lista) {
            for (Integer integer2 : lista) {
                if(posicion1!=posicion2){
                    if (k == (integer + integer2)) {
                        resultado = true;    
                    } 
                }
                posicion2++;
            }
            posicion1++;
            posicion2 = 0;
        }
        
        System.out.println(resultado);
    }
}
