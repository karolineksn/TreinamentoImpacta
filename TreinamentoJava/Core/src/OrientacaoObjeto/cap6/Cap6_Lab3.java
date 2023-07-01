package OrientacaoObjeto.cap6;

public class Cap6_Lab3 {
    public static void main(String[] args) {
        Aluno joao = new Aluno();
        joao.setNome("João");
        Aluno.contadorDeAlunos++;
        System.out.println(joao);

        Aluno maria = new Aluno();
        maria.setNome("Maria");
        Aluno.contadorDeAlunos++;
        System.out.println(maria);

        Aluno marcos = new Aluno();
        marcos.setNome("Mercos");
        Aluno.contadorDeAlunos++;
        System.out.println(marcos);

    }
}
