package OrientacaoObjeto.cap5;

import java.math.BigDecimal;

public class Cap5_Lab1 {
    public static void main(String[] args) {
       Funcionario funcionario = new Funcionario();

       funcionario.nome = "Karoline";
       funcionario.sobrenome = "Nascimento";
       funcionario.cargo = "Engenheira de Software Jr";
       funcionario.salario = BigDecimal.valueOf(520000,2);

        System.out.println("Nome: " + funcionario.nome);
        System.out.println("Sobrenome: " + funcionario.sobrenome);
        System.out.println("Cargo: " + funcionario.cargo);
        System.out.println("Salário: " + funcionario.salario);


    }
}
