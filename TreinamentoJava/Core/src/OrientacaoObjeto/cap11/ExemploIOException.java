package OrientacaoObjeto.cap11;

import java.io.FileReader;
import java.io.IOException;

public class ExemploIOException {
    public static void main(String[] args) {

        try {
            FileReader doc;
            doc = new FileReader("C:\\carta.text");
        }catch (IOException e){
            System.out.println("N�o foi poss�vel abrir o arquivo");
            e.printStackTrace();
        }
    }
}
