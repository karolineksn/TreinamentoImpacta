package OrientacaoObjeto.cap16;
import java.io.*;

public class ExemploCriacaoArquivo {
    public static void main(String[] args) {
        try {
            String file = "Arquivo2.txt"; //Deixei comentado pq toda vez que roda, ele cria um arquivo novo
            FileOutputStream arquivo = new FileOutputStream(file, true);
            DataOutputStream dados = new DataOutputStream(arquivo);
            dados.writeBytes("meu segundo arquivo");
            dados.flush();
        }
        catch (FileNotFoundException e){
            System.out.println("Arquivo não criado!");
        }catch (IOException e){
            System.out.println("Não foi possível escrever dentro do arquivo!");
        }
    }
}
