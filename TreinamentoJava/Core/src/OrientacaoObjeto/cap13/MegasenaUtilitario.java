package OrientacaoObjeto.cap13;

import java.util.Random;

public class MegasenaUtilitario {

    public static int sortearNumero(){
        Random sorteador = new Random();
        int numero = sorteador.nextInt(60) + 1; //sorteia numeros entre 0 e 59, c/ +1 soma até 60
        return numero;
    }
}
