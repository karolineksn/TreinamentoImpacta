package OrientacaoObjeto.cap13;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SorteadorDeNumeros {
    public static int sortear(int numero) {
        Random random = new Random();
        return random.nextInt(numero) + 1; // 1 a 60
    }

//    public static int[] jogoMegaSena() {
//        int lista[] = new int[6];
//
//        int contar = 0;
//        while (contar < 0){
//            int numero = sortear(60);
//            boolean eIgual = false;
//            for (int i = 0; i < lista.length; i++) {
//                if (lista[i] == numero) {
//                    eIgual = true;
//                    break;
//                }
//            }
//            if (!eIgual) {
//                lista[contar] = numero;
//                contar++;
//            }
//        }
//        return lista;
//    }

    //outro modo de fazer:

    public static Set<Integer> jogoMegasena(){
        Set<Integer> list = new TreeSet<>(); //TreeSet retorna lista ordenada, HashSet não
        while (list.size() < 6) {
            list.add(sortear(60));
        }
        return list;
    }

}
