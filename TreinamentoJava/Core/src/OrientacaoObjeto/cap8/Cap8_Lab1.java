package OrientacaoObjeto.cap8;

public class Cap8_Lab1 {

    static int maiorNumero (int array[]){

        int maior = 0;
        for (int index = 0; index < array.length; index++){
            if (array[index] > maior){
                maior = array[index];
            }
        }
        return maior;
    }

    public static void main(String[] args) {

        int numeros[] = {100, 2, 55, 4444, 22};
        int maiorNumero = maiorNumero(numeros);

        for (int elementos : numeros){
            System.out.println(" " + elementos);
        }
        System.out.println();
        System.out.println("Maior número foi: " + maiorNumero);

    }

}
