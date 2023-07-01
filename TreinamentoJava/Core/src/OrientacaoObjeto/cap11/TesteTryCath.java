package OrientacaoObjeto.cap11;

import java.util.Scanner;

public class TesteTryCath {
    public static void main(String[] args) {
        int i;
        try {
            i = 1 / 0; //exceção por dividir por zero
            System.out.println(i);
        }catch (ArithmeticException e){ //você pode lançar as mensagens de exception ou uma mensagem
            System.out.println(e.getCause());
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
            System.out.println(e.getClass());
            System.out.println("Não é possível dividir por zero!"); //mensagem à sua escolha
        }
        try{
            i = 2;
            System.out.println(i);
        }catch (Exception e){
            System.out.println(e);

        }
    }
}
