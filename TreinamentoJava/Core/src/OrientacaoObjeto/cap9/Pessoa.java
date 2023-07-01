package OrientacaoObjeto.cap9;

public class Pessoa {
    String nome;
    String cpf;

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
