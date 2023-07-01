package OrientacaoObjeto.cap8;

public class ExemploArrayParametros {

    public static void main(String[] args) {

        int valoresA[] = new int[3];
        int valoresB[] = new int[3];

        valoresA[0] = 10;
        valoresA[1] = 20;
        valoresA[2] = 30;

        valoresB = dobraValores(valoresA);

        for (int i = 0; i < valoresA.length; i++) {
            System.out.println("valoresA[" + i + "] = " + valoresA[i]);

        }

        for (int i = 0; i < valoresB.length; i++) {
            System.out.println("valoresB[" + i + "] = " + valoresB[i]);

        }
    }

    private static int[] dobraValores(int[] valores){
        for (int i = 0; i < valores.length; i++){
            valores[i] *= 2;
        }
        return valores;
    }

}
