package OrientacaoObjeto.ExemplosMetodos;

public class TesteMetodos {
    public static void main(String[] args) {
        Metodos metodos = new Metodos();
        metodos.exibirNoTerminal("Hello World!");

        Long soma = metodos.somar(10L, 20L);
        metodos.exibirNoTerminal("Resultado da soma do método: " + soma);

    }
}
