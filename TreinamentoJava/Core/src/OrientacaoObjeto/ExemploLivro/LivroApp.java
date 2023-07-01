package OrientacaoObjeto.ExemploLivro;
public class LivroApp {
    public static void main(String[] args) {
        //Instanciando um objeto
        Livro meuLivro = new Livro(); //Construtor
        Livro outroLivro = new Livro();

        meuLivro.nome = "O Senhor dos An�is";
        meuLivro.autor = "J.R.R. Tolkien";
        meuLivro.valor = 127.90;

        outroLivro.nome = "Harry Potter";
        outroLivro.autor = "J.K. Rowling";
        outroLivro.valor = 98.90;
        //1� Exemplo de apresenta��o
        System.out.println("-- Informa��es do Livro: --");
        System.out.println(meuLivro.nome);
        System.out.println(meuLivro.autor);
        System.out.println(meuLivro.valor);

        System.out.println();
        //2� Exemplo
        outroLivro.apresentarLivro();
    }

}
