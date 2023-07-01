package OrientacaoObjeto.cap16;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ExemploCriacaoArquivoTryResources {
    public static void main(String[] args) {
        File file = new File("tryWithResources.txt");

        try (InputStream inputStream = new FileInputStream(file)){
            inputStream.close();
            inputStream.readAllBytes();

        }catch (IOException e){
            throw new RuntimeException(e);
        }


    }
}
