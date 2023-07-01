package OrientacaoObjeto.cap9.Lab;

public class Cap9_Lab1 {

    public static void main(String[] args) {

        Pessoa manuel = new Aluno("Manuel", 30, 'M',
                123123, "10/05/1992", 250, "Administracao");

        Pessoa juliana = new Aluno("Juliana", 29, 'F',
                123123, "10/09/1993", 250, "Matemática");

        Pessoa joao = new Professor("Joao", 32, 'M', 123454,
                "05/05/1990", 3500, "Português");

        System.out.println(joao.falar(": Manuel?"));
        System.out.println(manuel.falar(": Presente!"));
        System.out.println(joao.falar(": Juliana?"));
        System.out.println(juliana.falar(": Presente!"));
        System.out.println(" ");

        System.out.println(manuel.mostrarDados());
        System.out.println(juliana.mostrarDados());
        System.out.println(joao.mostrarDados());

    }
}