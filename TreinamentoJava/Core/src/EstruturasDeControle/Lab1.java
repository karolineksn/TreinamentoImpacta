package EstruturasDeControle;

//N�meros primos

public class Lab1 {
    public static void main(String[] args) {
        int numero = 11;
        int divisoes = 0;

        for(int i = 1; i <= numero; i++) {
            if(numero % i == 0)
                divisoes++;

            if(divisoes > 2)
                break;
        }

        System.out.println(divisoes == 2
                ? String.format("O n�mero %d � primo!", numero)
                : String.format("O n�mero %d n�o � primo!", numero));


    }
}