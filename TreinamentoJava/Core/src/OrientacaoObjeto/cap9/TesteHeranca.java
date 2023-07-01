package OrientacaoObjeto.cap9;

public class TesteHeranca {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Karol";
        funcionario.cpf = "123456789-00";
        funcionario.matricula = "PG123";
        System.out.println(funcionario);

        Cliente cliente = new Cliente();
        cliente.nome = "Maria";
        cliente.cpf = "987654321-11";
        System.out.println(cliente);
    }
}
