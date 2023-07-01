package OrientacaoObjeto.cap9;

public class Cliente extends Pessoa{

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + super.nome + '\'' +
                ", cpf='" + super.cpf + '\'' +
                '}';
    }
}
