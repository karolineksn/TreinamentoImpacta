package OrientacaoObjeto.cap16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExemploCriacaoBufferReader {
    public static void main(String[] args) {
        try{
            FileReader fileReader = new FileReader("Arquivo2.txt");
            BufferedReader reader = new BufferedReader(fileReader);
            System.out.println(reader.readLine()); //Lê o conteúdo do arquivo acima

        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
