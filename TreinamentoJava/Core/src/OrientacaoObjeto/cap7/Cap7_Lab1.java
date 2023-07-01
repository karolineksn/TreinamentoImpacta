package OrientacaoObjeto.cap7;

public class Cap7_Lab1 {
    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro();
        //cadastro.setNome("Construtor Padrão");
        cadastro.exibeNaTela();

        Cadastro cadastro1 = new Cadastro();
        cadastro1.setNome("Karol");
        cadastro1.setSobrenome("Silva");
        cadastro1.exibeNaTela();

        Cadastro cadastro2 = new Cadastro();
        cadastro2.setNome("Julia");
        cadastro2.setSobrenome("Abreu");
        cadastro2.setIdade(30);
        cadastro2.exibeNaTela();


    }

}
