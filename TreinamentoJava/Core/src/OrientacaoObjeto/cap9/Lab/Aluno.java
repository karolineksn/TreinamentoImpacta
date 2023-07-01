package OrientacaoObjeto.cap9.Lab;

public class Aluno extends Pessoa{

    private float mensalidade;
    private String curso;

    public float getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(float mensalidade) {
        this.mensalidade = mensalidade;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Aluno(String nome,
                 int idade,
                 char sexo,
                 int numeroRG, String dataNasc, float mensalidade, String curso) {
        super(nome, idade, sexo, new RG(numeroRG, dataNasc));
        this.mensalidade = mensalidade;
        this.curso = curso;
    }

    public String falar(String fala){
        return super.getNome().concat(" " + fala);
    }
    @Override
    public String mostrarDados(){
        return "Aluno {" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo=" + sexo +
                ", mensalidade=" + getMensalidade() +
                ", curso=" + getCurso() +
                '}';
        }
}
