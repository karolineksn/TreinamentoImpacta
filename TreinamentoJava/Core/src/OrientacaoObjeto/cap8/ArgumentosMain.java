package OrientacaoObjeto.cap8;

public class ArgumentosMain {
    public static void main(String[] elementos) {

        long soma = 0;
        for (String elemento : elementos) {
            Integer inteiro = Integer.valueOf(elemento);
            Long aLong = Long.valueOf(elemento);
            soma += inteiro + aLong;
        }
        System.out.println("valor da soma: " + soma);
    }
}
