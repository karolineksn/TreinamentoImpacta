package OrientacaoObjeto.cap14;

public class TesteInterfaceFuncional { //Implementação de interface funcional

    public static void main(String[] args) {

        OperacaoAritmetica somaFuncional = (x, y) -> x + y;
        System.out.println(somaFuncional.executar(12.3, 10));

        OperacaoAritmetica subtracaoFuncional = (x, y) -> x - y;
        System.out.println(subtracaoFuncional.executar(12.5, 10));

        OperacaoAritmetica divisaoFuncional = (x, y) -> x / y;
        System.out.println(divisaoFuncional.executar(12.3, 10));

        ExemploFuncional funcional = (nome, idade, sexo) ->
                System.out.println(nome + idade + sexo);
        funcional.exibirDados("Karol ", 30, " F");

    }
}
