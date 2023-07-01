package OrientacaoObjeto.cap9.Lab;

public class Professor extends Pessoa{
    private float salario;
    private String disciplina;

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public Professor(String nome,
                     int idade,
                     char sexo,
                     int numeroRG, String dataNasc, float salario, String disciplina) {
        super(nome, idade, sexo, new RG(numeroRG, dataNasc));
        this.salario = salario;
        this.disciplina = disciplina;

    }

    @Override
    public String falar(String fala){
        return super.getNome().concat(" " + fala);
    }
    @Override
    public String mostrarDados(){

        return "Professor {" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo=" + sexo +
                ", salario=" + salario +
                ", disciplina=" + disciplina +
                '}';
    }

}
