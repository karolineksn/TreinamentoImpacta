import model.Filme;
import service.FilmeDAOImpl;

import java.util.List;
import java.util.Scanner;

public class ApplicationUserFilme {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma opção:");

        System.out.println("01 - Consultar");
        System.out.println("02 - Sortear");
        System.out.println("03 - Sair");

        int valor = scanner.nextInt();

        switch (valor) {
            case 1:
                consultar();
            case 2:
                break;
            case 3:
            default:
                System.out.println("Fim do Programa");
        }
    }

    private static void consultar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as informações do Filme:");
        System.out.print("Gênero: ");
        String genero = scanner.nextLine();

        System.out.print("Título: ");
        String titulo = scanner.nextLine();

        System.out.print("Ano: ");
        String anoTexto = scanner.nextLine();

        int ano = 0;
        if (!anoTexto.isEmpty()) {
            try {
                ano = Integer.parseInt(anoTexto);
            } catch (RuntimeException e) {
                System.out.println("Erro ao consultar a lista de filmes");
            }
        }

        FilmeDAOImpl filmeDAO = new FilmeDAOImpl();
        List<Filme> filmes = filmeDAO.findByTituloAndGeneroAndAno(titulo, genero, ano);

        if (filmes.isEmpty()) {
            System.out.println("Nenhum Filme Encontrado");
            return;
        }

        // TODO: 04/07/2023 ainda falta imprimir os dados conforme o requisito
//        filmes.stream().sorted().forEach(System.out::println);
        filmes.forEach(Filme::imprimir);

    }

}