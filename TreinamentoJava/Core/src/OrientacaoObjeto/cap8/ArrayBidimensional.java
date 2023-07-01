package OrientacaoObjeto.cap8;

public class ArrayBidimensional {

        public static void main(String[] args) {
                int notas[][] = new int[3][4];

                // [aluno][bimestre] = nota
                // [linha][coluna] = nota

                notas[0][0] = 7;
                notas[0][1] = 8;
                notas[0][2] = 10;
                notas[0][3] = 5;

                notas[1][0] = 5;
                notas[1][1] = 5;
                notas[1][2] = 0;
                notas[1][3] = 9;

                notas[2][0] = 2;
                notas[2][1] = 0;
                notas[2][2] = 5;
                notas[2][3] = 10;

                System.out.println("Nota do aluno de matricula 2 do ultimo bimestre: " + notas[2][3]);

                for (int linha = 0; linha < notas.length; linha++) {
                        for (int coluna = 0; coluna < notas[linha].length; coluna++) {
                                System.out.print("Aluno matricula: " + linha);
                                int nota = notas[linha][coluna];
                                System.out.println(" nota: " + nota + " do bimestre: " + coluna);
                        }
                }
        }
}
