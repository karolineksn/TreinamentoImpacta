package OrientacaoObjeto.ExemploLivro;

public class Livro {
    //Atributos
    String nome;
    String autor;
    double valor;

    public void apresentarLivro(){
        System.out.println("-- Informa��es do Livro: --");
        System.out.println("Livro: " + nome);
        System.out.println("Autor: " + autor);
        System.out.println("Valor: " + valor);
    }
}
