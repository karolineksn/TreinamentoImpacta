public class TiposPrimitivos {
    public static void main(String[] args) {
        //tipo da vari�vel NomeDaVar = atribui��o ou valor;
        byte Byte = 127;
        short Short = 32_767;
        int Int = 2_147_483_647; //pode-se usar o underline pra n�meros grandes, se usar ponto ele
        long Long = 1236L;       //vira float

        float Float = 12.23f;
        double Double = 12.23;

        char CaracterA = 65; //valor de A em ASCII
        char Caracter_A = 'A';

        boolean Verdadeiro = true;
        boolean Falso = false;

        var Variavel = 127; // um tipo de vari�vel coringa, que n�o fica limitada a um tipo

        System.out.println("Hoje � : " +  DiaDaSemanaEnum.SEGUNDA_FEIRA); //uso do Enum
    }

}
