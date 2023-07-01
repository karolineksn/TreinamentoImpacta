package OrientacaoObjeto.cap6;

public class Aluno {
    private String nome;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Aluno {" +
                "nome='" + nome + '\'' +
                "contador de alunos " + contadorDeAlunos +
                '}';
    }

    public static int contadorDeAlunos;

}

