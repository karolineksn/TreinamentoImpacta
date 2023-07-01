package OrientacaoObjeto.cap11.Lab;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExercicioGravacao {
    public static void main(String[] args) {

        try {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite uma frase qualquer: ");
            String texto = scanner.next();

            PrintWriter writer = new PrintWriter("doc1.txt"); //cada vez que você executa, ele cria um novo arquivo
            writer.println(texto);
            writer.close();
        } catch (IOException e){
            System.out.println("Falha ao gravar as informações digitadas");
        }
    }
}
