package OrientacaoObjeto.cap11.Lab;

import java.util.Scanner;

public class ExercicioIdade {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in); //Uso de uma classe Scanner (entrada de dados)
            System.out.println("Digite o ano do seu nascimento: ");
            String valor = scanner.nextLine();          //até aqui

            int ano = Integer.parseInt(valor); //o valor que for digitado, é convertido pra int
            int idade = 2023 - ano; // para calcular a idade do usuario

            System.out.println("Sua idade é: " + idade);
        }catch (NumberFormatException e){
            System.out.println("Valor digitado inválido" + e.getMessage()); //o e.getMessage mostra qual o erro

        }

    }


}
