package OrientacaoObjeto.cap16;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ExemploPath {

    public static void main(String[] args) {
        Path arquivo = Paths.get("Arquivo2.txt");
        System.out.println(arquivo);
        System.out.println(arquivo.toAbsolutePath());
        System.out.println(arquivo.getFileName());
        System.out.println(arquivo.getFileSystem());
    }
}
