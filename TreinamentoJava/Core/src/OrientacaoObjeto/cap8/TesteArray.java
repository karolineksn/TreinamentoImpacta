package OrientacaoObjeto.cap8;

import OrientacaoObjeto.cap7.Cadastro;

public class TesteArray {
    public static void main(String[] args) {
        String arrayDeChar = "aqui";

        byte array[] = new byte[4];
        array[0] = 97;
        array[1] = 113;
        array[2] = 117;
        array[3] = 105;

        int[] array1;
        array1 = new int[50];

        int array2[] = {97, 113, 117, 105};
        int array3[] = new int[]{97, 113, 117, 105};
        System.out.println(array3[0]); //exemplo de impressão de lista utilizando indice
        System.out.println(array3[1]);
        System.out.println(array3[2]);

        Cadastro cadastro[] = new Cadastro[3];
        cadastro[0] = new Cadastro();
        cadastro[1] = new Cadastro("Karol", "Silva");
        cadastro[2] = new Cadastro("Maria", "Antonieta", 50);

        System.out.println(cadastro[1]); //exibe tudo
        System.out.println(cadastro[2].getNome()); //exibe só o nome

        int array4[] = new int[]{97, 113, 117, 105};
        for (int elemento : array4){
            System.out.println("Exemplo foreach: " + elemento); //percorre toda a lista em ordem, sem
        }                                                       // considerar os indices

        int soma = 0;
        for (int elemento : array4){
            soma += elemento; //exemplo de soma dos valores de cada indice, nesse caso 97+113+117+105=432
            System.out.println("Valor de cada soma: " + soma);
        }
        System.out.println("Valor final: " + soma); //432


    }

}
