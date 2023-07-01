package OrientacaoObjeto.cap11;

import java.io.FileReader;
import java.io.IOException;

public class ExemploIOException {
    public static void main(String[] args) {

        try {
            FileReader doc;
            doc = new FileReader("C:\\carta.text");
        }catch (IOException e){
            System.out.println("Não foi possível abrir o arquivo");
            e.printStackTrace();
        }
    }
}
