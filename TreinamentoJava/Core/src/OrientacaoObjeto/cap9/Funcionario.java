package OrientacaoObjeto.cap9;

public class Funcionario extends Pessoa{

    String matricula;

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + super.nome + '\'' +
                ", cpf='" + super.cpf + '\'' +
                ", matricula='" + matricula + '}';
    }
}
